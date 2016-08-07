package recording.audio.prototype;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.DataLine.Info;

/**
 * A recorder of sounds.
 * @author Jafeth
 */
public class SoundRecorder {
    
    private final File wavFile;//Path of the wav file
    private final AudioFileFormat.Type fileType;//Format of audio file
    private TargetDataLine line;//The line from which audio data is captured
    private final Thread recorderThread;//The seperate thread for the recording of the audio file.
    private boolean recording;//Tells wether the system is recording or not.
    private final RecordingEventCatcher eventCatcher;//An event catcher for Recording Events.
    private AudioFormat format;//An audio format.
    private final Info info;//DataLine info for the capturing of the microphone.
    
    /**
     * A default constructor for the SoundRecorder class.
     * @param gui
     */
    public SoundRecorder(RecorderGUI gui)
    {
        wavFile = new File("C:/Test/RecordAudio.wav");
        fileType = AudioFileFormat.Type.WAVE;
        recorderThread = new Thread(this::start);
        recording = false;
        eventCatcher = new RecordingEventCatcher(gui);
        
        setAudioFormat(41000, 16, 2, true, true);
        info = new DataLine.Info(TargetDataLine.class, format);
        try
        {
            line = (TargetDataLine) AudioSystem.getLine(info);
        }
        catch (LineUnavailableException ex)
        {
            Logger.getLogger(SoundRecorder.class.getName()).log(Level.SEVERE, null, ex);
            eventCatcher.lineNotFoundEvent();
        }
    }
    
    /**
     * Sets an audio format according to the given parameters.
     */
    private void setAudioFormat(float sampleRate, int sampleSizeInBits, int channels, boolean signed, boolean bigEndian)
    {
        format = new AudioFormat(sampleRate, sampleSizeInBits, channels, signed, bigEndian);
    }
    
    /**
     * Starts the recording of the microphone.
     */
    public void startRecording()
    {
        if(!recording)
        {
            recorderThread.start();
        }
        else
        {
            eventCatcher.recordingNotStartedEvent();
        }
    }
 
    /**
     * Captures the sound and records it into a WAV file
     */
    private void start()
    {
        if(line != null)
        {
            //Checks if system supports the data line
            if (!AudioSystem.isLineSupported(info))
            {
                try
                {
                    //Start capturing
                    line.open(format);
                    line.start();   

                    AudioInputStream ais = new AudioInputStream(line);

                    //This is set before the actual recording start because it will not fire otherwise.
                    //If an error happens anyway, the recording is set back to false and the recordingNotStartedEvent is fired
                    //This means the user will not even see the notification of the recording being started.
                    recording = true;
                    eventCatcher.recordingStartedEvent();

                    //Start recording
                    AudioSystem.write(ais, fileType, wavFile);
                }
                catch (LineUnavailableException | IOException ex)
                {
                    recording = false;
                    System.out.println(ex.getMessage());
                    eventCatcher.recordingNotStartedEvent();
                }
            }
            else
            {
                recording = false;
                eventCatcher.formatNotSupportedEvent();
            }
        }
        else
        {
            eventCatcher.lineNotFoundEvent();
        }
    }
    
    /**
     * Closes the target data line to finish capturing and recording
     */
    public void finish()
    {
        if(recording)
        {
            line.stop();
            line.close();
            System.out.println("Finished");
            recording = false;
            eventCatcher.recordingStoppedEvent();
        }
        else
        {
            eventCatcher.recordingNotStoppedEvent();
        }
    }   
}