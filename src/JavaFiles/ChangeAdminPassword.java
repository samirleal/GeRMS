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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samir
 */
public class ChangeAdminPassword extends javax.swing.JInternalFrame {

    // Main class
    private Main main;
    
    // Variables needed to make connection with DB
   private static final String dbClassName = "com.mysql.jdbc.Driver";
   private static final String CONNECTION = "jdbc:mysql://localhost/germs";  
    
    /**
     * Creates new form ChangeAdminPassword
     */
    public ChangeAdminPassword(Main m) {
        
        // Inits the components
        initComponents();
        
        // Reference to the Main class
        main = m;
        
        // Centers the form
        // Gets the dimension of the main desktop pane
        Dimension desktopSize = main.getDesktopPaneDimension();
                
        // Gets the size of this JInternalFrame
        Dimension jInternalFrameSize = this.getSize();
        
        // Centers this JInternalFrame in the DesktopPane
        this.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Change Administrator Password");
        setToolTipText("");
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Old Password:");

        jLabel2.setText("New Password:");

        jLabel3.setText("Re-type New Password:");

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
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
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Called when the form is closed
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

        // Sets the variable to false
        main.setIsChangeAdminPasswordScreenOpen(false);
        
    }//GEN-LAST:event_formInternalFrameClosed

    // This method is called when the Close button is clicked
    // It disposes of this screen
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // Disposes of the screen
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // A try/catch block to get information from the database using SQL
        try {

            // Database Driver
            Class.forName(dbClassName);

            // user/pwd to connect to DB
            Properties p = new Properties();
            p.put("user","GermsAdmin");
            p.put("password","g3rm5p0w3ru53r");

            // DB connection
            Connection conn = DriverManager.getConnection(CONNECTION,p);
            
            // A sql statement to get the password
            Statement stmt = conn.createStatement();
            String sql;
            String oldpassword = "";
            sql = "select * from accounts where accUser = 'admin'";
            ResultSet rs = stmt.executeQuery(sql);
            
            // Loops through all the elements in the ResultSet
            if (rs.next() == true){
                String oldpasswordencrypted = rs.getString("accPassword");
                String key = rs.getString("secretKey");
                
                // Converts the key from the db to a byte array so it can be converted to a SecretyKey for decryption
                byte[] decodedKey = Base64.getDecoder().decode(key);
            
                // Convert the pasword key from byte[] to SecretKey so it can be decrypted
		SecretKey secretKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
                
                // Encryptor class
                EncryptionDecryptionAES encryptor = new EncryptionDecryptionAES();
                
                // Decrypt the password
                try {
                    
                    // Decrypts the pass from the db
                    oldpassword = encryptor.decrypt(oldpasswordencrypted, secretKey);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
            
            
            // Gets the password from the password field
            char[] oldpass = jPasswordField1.getPassword();

            // String for the password
            String password1 = "";

            // Gets the password from the char[] array
            for (int i = 0; i < oldpass.length; i++) {
                password1 += oldpass[i];
            }
            
            // If the passwords match
            if(password1.equals(oldpassword)){
                
                // Gets the password from the password field
                char[] newpass = jPasswordField2.getPassword();
                // String for the password
                String newpassword = "";
                // Gets the password from the char[] array
                for (int i = 0; i < newpass.length; i++) {
                    newpassword += newpass[i];
                }
                
                // Gets the password from the password field
                char[] newpass2 = jPasswordField3.getPassword();
                // String for the password
                String newpassword2 = "";
                // Gets the password from the char[] array
                for (int i = 0; i < newpass2.length; i++) {
                    newpassword2 += newpass2[i]; 
                }
                
                if(newpassword.equals(newpassword2)){
                    // Encryptor class
                    EncryptionDecryptionAES encryptor = new EncryptionDecryptionAES();

                    // Encrypt the password
                    try {
                        newpassword = encryptor.encrypt(newpassword);
                    } catch(Exception e) {}
                    
                    String key = encryptor.getKey();

                    // Inserts the data into the database
                    sql = "UPDATE accounts SET accpassword = '"+newpassword+"', secretkey = '"+key+"'" +
                            "WHERE accUser = 'admin'";
                    stmt.executeUpdate(sql);

                    // Displays a message 
                    JOptionPane.showMessageDialog(null, "Password Changed", "Admin change password", JOptionPane.INFORMATION_MESSAGE);

                    // Closes the register screen
                    this.dispose();
                      
                }
                else{
                    // Display's a message
                    JOptionPane.showMessageDialog(null, "New passwords do not match", "Admin change password", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                // Display's a message
                JOptionPane.showMessageDialog(null, "Wrong password", "Admin change password", JOptionPane.INFORMATION_MESSAGE);
            }
 
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
