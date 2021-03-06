/*
 * Team name: GeRMS
 * Team members: Gustavo Moraes, Ryan Ahearn, Mark Morabito, and Samir Leal
 * Date: 04/30/15
 * Purpose: In this project, you and your partners will work to write a program to 
 * create a Math Tutor Software System to help elementary school students.
 *
 * This software will help elementary school students to study and practice math skills.
 *
 * The math curriculum information in Massachusetts is in following link: 
 * http://www.doe.mass.edu/frameworks/math/2000/toc.html
 *
 * The client requests following features as minimum:
 *     practice test materials
 *     tutorials
 *     printing the record(test results)
 *     different level tests for each grade
 *     security(log-in, log-out)
 *     Reward
 *
 */

import java.awt.Desktop;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
* This is the class for the help screen, which will hold videos for each portion of our program. 
* This screen is a JInternalFrame.
* This screen display's a button for each screen accessible to the user.
* Each button will open a video tutorial to help the user understand the selected screen.
*/
public class HelpScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form HelpScreen
     */
    public HelpScreen() {
        
        // Initializes the components
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

        loginTutorialButton = new javax.swing.JButton();
        registerTutorialButton = new javax.swing.JButton();
        forgotpasswordTutorialButton = new javax.swing.JButton();
        manageAccountsTutorialButton = new javax.swing.JButton();
        gradeselectTutorialButton = new javax.swing.JButton();
        quizdifficultyTutorialButton = new javax.swing.JButton();
        prekandkTutorialButton = new javax.swing.JButton();
        printreportTutorialButton = new javax.swing.JButton();
        quizreportTutorialButton = new javax.swing.JButton();
        finalReportTutorialButton = new javax.swing.JButton();
        helpAudioButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Help");
        setToolTipText("Help");
        setVisible(true);

        loginTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconLogin.jpg"))); // NOI18N
        loginTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTutorialButtonActionPerformed(evt);
            }
        });

        registerTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconRegister.jpg"))); // NOI18N
        registerTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerTutorialButtonActionPerformed(evt);
            }
        });

        forgotpasswordTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconForgotPassword.jpg"))); // NOI18N
        forgotpasswordTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpasswordTutorialButtonActionPerformed(evt);
            }
        });

        manageAccountsTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconManageAccounts.jpg"))); // NOI18N
        manageAccountsTutorialButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        manageAccountsTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccountsTutorialButtonActionPerformed(evt);
            }
        });

        gradeselectTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconGradeSelect.jpg"))); // NOI18N
        gradeselectTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeselectTutorialButtonActionPerformed(evt);
            }
        });

        quizdifficultyTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconQuizDifficulty.jpg"))); // NOI18N
        quizdifficultyTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizdifficultyTutorialButtonActionPerformed(evt);
            }
        });

        prekandkTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconPreK.jpg"))); // NOI18N
        prekandkTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prekandkTutorialButtonActionPerformed(evt);
            }
        });

        printreportTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconPrintReport.jpg"))); // NOI18N
        printreportTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printreportTutorialButtonActionPerformed(evt);
            }
        });

        quizreportTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconQuizReport.jpg"))); // NOI18N
        quizreportTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizreportTutorialButtonActionPerformed(evt);
            }
        });

        finalReportTutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HelpScreen/IconFinalReport.jpg"))); // NOI18N
        finalReportTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalReportTutorialButtonActionPerformed(evt);
            }
        });

        helpAudioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AudioButton.png"))); // NOI18N
        helpAudioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpAudioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gradeselectTutorialButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(prekandkTutorialButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginTutorialButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerTutorialButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(forgotpasswordTutorialButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manageAccountsTutorialButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(helpAudioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quizdifficultyTutorialButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quizreportTutorialButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(finalReportTutorialButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printreportTutorialButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerTutorialButton)
                    .addComponent(loginTutorialButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(manageAccountsTutorialButton)
                        .addComponent(forgotpasswordTutorialButton)
                        .addComponent(helpAudioButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradeselectTutorialButton)
                    .addComponent(quizdifficultyTutorialButton)
                    .addComponent(quizreportTutorialButton)
                    .addComponent(prekandkTutorialButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printreportTutorialButton)
                    .addComponent(finalReportTutorialButton))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        setBounds(170, 15, 990, 560);
    }// </editor-fold>//GEN-END:initComponents

    // This is the action listener for the login screen tutorial button
    private void loginTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTutorialButtonActionPerformed
        
        
        String videoName = "Login";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }//GEN-LAST:event_loginTutorialButtonActionPerformed

    // This is the action listener for the register screen tutorial button    
    private void registerTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerTutorialButtonActionPerformed
       
        String videoName = "Register";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }//GEN-LAST:event_registerTutorialButtonActionPerformed

    // This is the action listener for the forgot password screen tutorial button
    private void forgotpasswordTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpasswordTutorialButtonActionPerformed
        
        String videoName = "ForgotPassword";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }//GEN-LAST:event_forgotpasswordTutorialButtonActionPerformed

    // This is the action listener for the manage screen tutorial button
    private void manageAccountsTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccountsTutorialButtonActionPerformed

        String videoName = "ManageAccounts";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_manageAccountsTutorialButtonActionPerformed

    // This is the action listener for the grade select screen tutorial button    
    private void gradeselectTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeselectTutorialButtonActionPerformed
      
        String videoName = "Main Menu";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_gradeselectTutorialButtonActionPerformed

    // This is the action listener for the quiz difficulty tutorial button    
    private void quizdifficultyTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizdifficultyTutorialButtonActionPerformed
            String videoName = "QuizDifficultySelect";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_quizdifficultyTutorialButtonActionPerformed

    // This is the action listener for the PreK-K module screen tutorial button    
    private void prekandkTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prekandkTutorialButtonActionPerformed
       
        
        String videoName = "PreKK";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_prekandkTutorialButtonActionPerformed
    
    // This is the action listener for the print report screen tutorial button    
    private void printreportTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printreportTutorialButtonActionPerformed
             
        
        String videoName = "PrintReport";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_printreportTutorialButtonActionPerformed

    // This is the action listener for the quiz report screen tutorial button        
    private void quizreportTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizreportTutorialButtonActionPerformed
        
       
        String videoName = "QuizReport";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }   
        
    }//GEN-LAST:event_quizreportTutorialButtonActionPerformed

    // This is the action listener for the final report screen tutorial button        
    private void finalReportTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalReportTutorialButtonActionPerformed
       
        
        String videoName = "FinalReport";
         try {
                
                //Creates a file, initialized to null
                File f = null;
            try {
                //Gets the class and resource path of the mp4 video
                f = new File(getClass().getResource("Videos/" + videoName + ".mp4").toURI());
            } catch (URISyntaxException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
               //Opens and plays the video with the corresponding video application
                Desktop.getDesktop().open(f);
                
            } catch (IOException ex) {
                Logger.getLogger(PreKK.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_finalReportTutorialButtonActionPerformed

    // This method is called when the audio button is clicked
    private void helpAudioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpAudioButtonActionPerformed

        /*
        * This is the code that plays the audio .wav file.
        * This audio .wav file is the audio tutorial
        * to help the user understand this screen.
        */
        
        // Creates a filepath to the .wav file
        File yourFile = new File("src/sounds/GeRMSHelp.wav");
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        Clip clip;

        // A try/catch block to play the .wav file
        try {
            stream = AudioSystem.getAudioInputStream(yourFile);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
              
    }//GEN-LAST:event_helpAudioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton finalReportTutorialButton;
    private javax.swing.JButton forgotpasswordTutorialButton;
    private javax.swing.JButton gradeselectTutorialButton;
    private javax.swing.JButton helpAudioButton;
    private javax.swing.JButton loginTutorialButton;
    private javax.swing.JButton manageAccountsTutorialButton;
    private javax.swing.JButton prekandkTutorialButton;
    private javax.swing.JButton printreportTutorialButton;
    private javax.swing.JButton quizdifficultyTutorialButton;
    private javax.swing.JButton quizreportTutorialButton;
    private javax.swing.JButton registerTutorialButton;
    // End of variables declaration//GEN-END:variables

}
