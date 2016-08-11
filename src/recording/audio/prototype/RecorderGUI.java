package recording.audio.prototype;

import java.awt.Color;
import javax.swing.JFrame;

/**
 * A GUI frame for the recording program.
 * @author Jafeth
 * TODO: Create language interface to support multiple languages.
 */
public class RecorderGUI extends javax.swing.JFrame {

    private final SoundRecorder recorder;//An instance of the recorder class to do the actual recording.
    
    /**
     * Creates new form RecorderGUI
     */
    public RecorderGUI() {
        recorder = new SoundRecorder(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sampleRateComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        sampleSizeComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        channelsComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setText("STOP");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(startButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stopButton))
            .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(stopButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        titleLabel.setText("Recording prototype");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel1.setText("Sample rate:");

        sampleRateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8000", "16000", "32000", "44100", "48000", "96000", "192000" }));
        sampleRateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sampleRateComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Sample Size:");

        sampleSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16", "20", "24", "32" }));
        sampleSizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sampleSizeComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Channels:");

        channelsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "4", "6" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sampleRateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sampleSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(channelsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sampleRateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sampleSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(channelsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Is called when the start button is pressed. Starts the recording.
     * @param evt The event of the button being pressed.
     */
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        int sampleRate = Integer.decode(this.sampleRateComboBox.getSelectedItem().toString());
        int sampleSize = Integer.decode(this.sampleSizeComboBox.getSelectedItem().toString());
        int channels = Integer.decode(this.channelsComboBox.getSelectedItem().toString());
        this.recorder.startRecording(sampleRate, sampleSize, channels);
    }//GEN-LAST:event_startButtonActionPerformed

    /**
     * Is called when the stop button is pressed. Stops the recording.
     * @param evt The event of the button being pressed.
     */
    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        this.recorder.finish();
    }//GEN-LAST:event_stopButtonActionPerformed

    private void sampleRateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sampleRateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sampleRateComboBoxActionPerformed

    private void sampleSizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sampleSizeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sampleSizeComboBoxActionPerformed
    
    public void formatNotSupportedActionPerformed()
    {
        //Tells the user the microphone can not record the currently set audioformat.
        //Colour is red to imply an error.
        this.messageLabel.setForeground(Color.RED);
        this.messageLabel.setText("Audio format not supported on the microphone.");
    }
    
    /**
     * Is triggered when the attempt to find a microphone is unsuccessful.
     */
    public void lineNotFoundActionPerformed()
    {
        //Tells the user a microphone could not be found.
        //Colour is red to imply an error.
        this.messageLabel.setForeground(Color.RED);
        this.messageLabel.setText("Microphone not found.");
    }
    
    /**
     * Is triggered when a recording start attempt is successful.
     */
    public void recordingStartedActionPerformed()
    {
        //Tells the user the recording start attempt was successful.
        //Colour is black to imply being just a notification.
        this.messageLabel.setForeground(Color.BLACK);
        this.messageLabel.setText("Recording started");
    }
    
    /**
     * Is triggered when a recording start attempt is unsuccessful.
     */
    public void recordingNotStartedActionPerformed()
    {
        //Tells the user the recording start attempt was unsuccessful.
        //Colour is red to imply an error.
        this.messageLabel.setForeground(Color.RED);
        this.messageLabel.setText("Recording not started");
    }
    
    /**
     * Is triggered when a recording stop attempt is successful.
     */
    public void recordingStoppedActionPerformed(FileSystem fileSystem)
    {
        //Tells the user the recording stop attempt was successful.
        //Colour is black to imply being just a notification.
        this.messageLabel.setForeground(Color.BLACK);
        this.messageLabel.setText("Recording stopped\nFile can be found under: " + fileSystem.getFilePath() + "RecordAudio.wav");
    }
    
    /**
     * Is triggered when a recording stop attempt is unsuccessful.
     */
    public void recordingNotStoppedActionPerformed()
    {
        //Tells the user the recording stop attempt was unsuccessful.
        //Colour is red to imply an error.
        this.messageLabel.setForeground(Color.RED);
        this.messageLabel.setText("Recording not stopped");
    }
    
    /**
     * Is triggered when the OS is not supported.
     */
    public void osNotSupportedActionperformed()
    {
        //Tells the user the OS is not supported and recording might not work.
        //Colour is red to imply an error.
        this.messageLabel.setForeground(Color.RED);
        this.messageLabel.setText("OS not supported.\nRecording might not work.");
    }
    
    /**
     * The start of the program. Creates the GUI.
     * @param args The command line arguments.
     */
    public static void main(String[] args)
    {
        //Creates a new recorder GUI.
        RecorderGUI gui = new RecorderGUI();
        
        //Sets the default operation of the close button of the GUI to exit.
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Makes the GUI visible.
        gui.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> channelsComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JComboBox<String> sampleRateComboBox;
    private javax.swing.JComboBox<String> sampleSizeComboBox;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}