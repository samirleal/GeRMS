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
import java.awt.Dimension;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


/**
 * 
 * The final report class allows the user to see how well they did on the Final Assessment for their grade
 * This class displays the standard of each question and whether it was correct or incorrect
 * Also, this class allows for printing capabilities of the final report.
 */
public class FinalReport extends javax.swing.JInternalFrame {

    // Main class
    Main main;

    // Results
    private int[] results;
    
    // Standards
    private String[] standards;
    
    // Stores the grade
    private int grade;
    
    // Stores the difficulty (3 is hard for final)
    private String difficulty = "Hard";
    
    // ImageIcons for the checkmark and red x
    private ImageIcon incorrectImageIcon;
    private ImageIcon correctImageIcon;
    
    // Default table model
    DefaultTableModel tableModel;
    
    /**
     * Creates new form FinalReport
     */
    public FinalReport(Main m, int[] results, String[] standards, int grade) {
        
        // Initializes the components
        initComponents();
        
        // Stores a reference to the main
        main = m;
        
        // Centers the JInternalFrame
        center();
        
        // Stores the results from the previous assessment
        this.results = results;
        
        // Stores the standards asked from the previous assessment
        this.standards = standards;
        
        // Stores the grade
        this.grade = grade;
        
        // Standards that were passed from the Assessment class
        // Are identified and saved in the global Standards[] String array
        for (int i = 0; i < standards.length; i++) {
            switch (standards[i]) {
                case "KN1":
                    this.standards[i] = "Counting";
                break;
                case "KN2":
                    this.standards[i] = "Matching";
                break;
                case "KN3":
                    this.standards[i] = "Position";
                break;
                case "KN4":
                    this.standards[i] = "Comparing";
                break;
                case "KN5":
                    this.standards[i] = "Half & Whole";
                break;
                case "KN6":
                    this.standards[i] = "Coins";
                break;
                case "KN7":
                    this.standards[i] = "Math with Drawings";
                break;
                case "KN8":
                    this.standards[i] = "Estimate";
                break;
                case "2N4":
                    this.standards[i] = "Comparing";
                break;
                case "4N12":
                    this.standards[i] = "Math with Large Numbers";
                break;
                default:
                    this.standards[i] = "";    
                break;
            }            
        }

        
        // ImageIcons for the correct, and incorrect buttons
        incorrectImageIcon = new ImageIcon(getClass().getResource("Images/QuizReport/X.png"));
        correctImageIcon = new ImageIcon(getClass().getResource("Images/QuizReport/Checkmark.png"));
       
        // Gets the model from the JTable on the screen
        tableModel = (DefaultTableModel) jTable1.getModel();
        
        displayReport();
        
    }

    // This method centers the JInternalFrame on the screen
    public void center() {
        
        // Gets the dimension of the main desktop pane
        Dimension desktopSize = main.getDesktopPaneDimension();
                
        // Gets the size of this JInternalFrame
        Dimension jInternalFrameSize = this.getSize();
        
        // Centers this JInternalFrame in the DesktopPane
        this.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
        
    }
    
    // This method displays the users report on the final assessment
    public void displayReport() {
        
        tableModel.setRowCount(results.length);
        
        for (int i = 0; i < results.length; i++) {
            
            jTable1.setValueAt(i+1, i, 0);
            jTable1.setValueAt(standards[i], i, 1);
            
            if (results[i] == 0) {
                jTable1.setValueAt(incorrectImageIcon, i, 2);
            } else {
                jTable1.setValueAt(correctImageIcon, i, 2);
            }
            
            jTable1.setRowHeight(42);
            
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Final Report");
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Question Number", "Type", "Right/Wrong"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                switch (columnIndex) {
                    case 2: return ImageIcon.class;
                    default: return types[columnIndex];
                }
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Final Report");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RegisterScreen/goButton.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainScreen/printer.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // When the GO button is clicked
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Opens the grade select screen
        main.openGradeSelectScreen();  

        // Disposes this screen
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    // Called when the printer button is pressed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // Text area that is used to write the report to
        JTextArea textArea = new JTextArea();
        
        // Sets the font
        textArea.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        // Gets the current date in MM-dd-yyyy format
        Date d = new Date();
        String date = new SimpleDateFormat("MM-dd-yyyy").format(d);
        
        // Used to store either PreK-K, Grades 1 and 2, or Grades 3 and 4
        String grade = "";
        
        // Stores the grade in the above String
        switch (this.grade) {
            case 0:
                grade = "PreK-K";
            break;
            
            case 1:
                grade = "Grades 1 and 2";
            break;
                
            case 2:
                grade = "Grades 3 and 4";
            break;
                
            default:
                grade = "";
            break;
                
        }
        
        // this.difficulty = "Hard"; already instantiated in globab variables field
        
       // Used to store either Incorrect/Correct for all questions
        String[] results = new String[this.results.length];
        
        // Used to store the score on the assessment
        int score = 0;
        
        // Gets the score and stores incorrect/correct in the above String array
        for (int i = 0; i < this.results.length; i++) {
            
            // Adds one or zero to the score
            score += this.results[i];
            
            switch (this.results[i]) {
                
                case 0:
                    results[i] = "Incorrect";
                break;
                    
                case 1:
                    results[i] = "Correct";
                break;
                
                default:
                    results[i] = "";
                break;
                    
            }
        }
        
        // Stores the score as a double from 0-100
        score = (score * 10);
        
        // Text that goes above the data from the assessment
        String headings = ""
                + "Username: " + main.getUsername() + "\n"
                + "Date: " + date + "\n"
                + "Grade: " + grade + "\n"
                + "Assessment Type: Final" + "\n"
                + "Difficulty: " + difficulty + "\n"
                + "Score: " + score + "\n\n";
        
        // Determine which row has the longest standard name (for spacing purposes)
        int standardLength = 0;
        for (int i = 0; i < standards.length; i++) {
            if (standards[i].length() > standardLength) {
                // Stores the largest length
                standardLength = standards[i].length();
            }
        }
        
        // Used to store the spaces as a String that go after the second column text
        String[] spacesForSecondColumn = new String[standards.length];
        
        // Instantiates the spacesForSecondColumn array
        for (int i = 0; i < spacesForSecondColumn.length; i++) {
            spacesForSecondColumn[i] = "";
        }
        
        // Determines the number of spaces needed after the second column for each row
        // Then stores the spaces in an array
        for (int i = 0; i < standards.length; i++) {
            int spacesNeededForSecondColumn = standardLength - standards[i].length();
            for (int j = 0; j < spacesNeededForSecondColumn; j++) {
                spacesForSecondColumn[i] += " ";
            }
            spacesForSecondColumn[i] += "             ";
        }
        
        // Number of spaces after the Type column
        int numberOfSpacesAfterSecondColumn = (standardLength-4) + 8;
        
        // Column headings for the data table
        String columnHeadings = String.format("Question #         Type%"+numberOfSpacesAfterSecondColumn+"s"+"Correct/Incorrect" + "\n", "");
        
        // Loops through each element in the results array
        // adding one row of data to the string each time
        String data = "";
        for (int i = 0; i < standards.length; i++) {
            numberOfSpacesAfterSecondColumn = (standardLength-standards[i].length()) + 8;
            if (i < 9) {
                data += String.format((i+1) + "                  " + standards[i] + "%"+numberOfSpacesAfterSecondColumn+"s" + results[i] + "\n", "");
            } else {
                data += String.format((i+1) + "                 " + standards[i] + "%"+numberOfSpacesAfterSecondColumn+"s" + results[i] + "\n", "");                
            }
        }
        
        // Sets the textArea with the print preview text
        textArea.setText(headings + columnHeadings + data);
        
        // Makes the textArea not editable
        textArea.setEditable(false);
        
        // Displays a print preview
        JOptionPane.showMessageDialog(null, textArea, "Print Assessment Preview", JOptionPane.PLAIN_MESSAGE);

        // Attempts to send a print job
        try {
            boolean complete = textArea.print(null, null, true, null, null, true);
            if (complete) {
                /* show a success message  */

            } else {
                /*show a message indicating that printing was cancelled */

            }
        } catch (PrinterException pe) {
            /* Printing failed, report to the user */

        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    // Method that is called when the form is closed
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

        // Sets the variable to false
        main.setIsFinalReportScreenOpen(false);

    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
