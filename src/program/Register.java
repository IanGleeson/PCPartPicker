package program;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dsd03
 */
public class Register extends javax.swing.JFrame {
    
    private SQLdao Rdao;
    private MainScreen ms;
    
    public Register() {
        initComponents();
        this.setTitle("PC Parts Picker");
        Rdao = new SQLdao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInformation = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRetypePassword = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cboxEmail = new javax.swing.JComboBox();
        btnRegister = new javax.swing.JButton();
        lblUsernameErr = new javax.swing.JLabel();
        lblPasswordErr = new javax.swing.JLabel();
        lblAddressErr = new javax.swing.JLabel();
        lblFullNameErr = new javax.swing.JLabel();
        lblRetypePasswordErr = new javax.swing.JLabel();
        lblEmailErr = new javax.swing.JLabel();
        passPassword = new javax.swing.JPasswordField();
        passRetypePassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInformation.setText("Please Enter your Information");

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        lblRetypePassword.setText("Retype Password");

        lblFullName.setText("Full-Name:");

        lblAddress.setText("Address:");

        lblEmail.setText("Email:");

        cboxEmail.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "@hotmail.com", "@hotmail.co.uk", "@gmail.com", "@yahoo.com" }));

        btnRegister.setText("Register");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lblInformation)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblRetypePassword)
                    .addComponent(lblPassword)
                    .addComponent(lblFullName)
                    .addComponent(lblAddress)
                    .addComponent(lblEmail))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(txtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(passPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(passRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsernameErr, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(lblPasswordErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFullNameErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRetypePasswordErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cboxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblEmailErr, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblAddressErr, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblInformation)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblUsernameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(lblPasswordErr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRetypePassword)
                            .addComponent(passRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFullName)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFullNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEmail)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblEmailErr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblAddressErr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblRetypePasswordErr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        boolean okCheck = false;
        
        //Username check
        if(txtUsername.getText().length() < 4 || txtUsername.getText().length() == 0){
            lblUsernameErr.setText("Username must be at least 4 characters.");
            okCheck = false;
        }
        else if(txtUsername.getText().contains(" ")){
            lblUsernameErr.setText("Username cannot contain spaces.");
            okCheck = false;
        }
        else{
            okCheck = true;
            lblUsernameErr.setText("");
        }
        ///////////////////////////
        //Password Check
        if(passPassword.getPassword().length < 5){
            lblPasswordErr.setText("Password has to be at least 5 characters.");
            okCheck = false;
        }
        else{
            lblPasswordErr.setText("");
            okCheck = true;
        }
        //Retype Password Check
        if(Arrays.toString(passPassword.getPassword()).equals(Arrays.toString(passRetypePassword.getPassword()))){
            lblRetypePasswordErr.setText("");
            okCheck = true;
        }
        else{
            lblRetypePasswordErr.setText("Must match above password.");
            okCheck = false;
        }
        ///////////////////////////
        ///////////////////////////
        //Full Name Check
        if(txtFullName.getText().length() == 0){
            lblFullNameErr.setText("Cannot be empty.");
            okCheck = false;
        }
        else{
            lblFullNameErr.setText("");
            okCheck = true;
        }
        ///////////////////////////
        //Address Check
        if(txtAddress.getText().length() == 0){
           lblAddressErr.setText("Cannot be empty.");
           okCheck = false;
        }
        else{
           lblAddressErr.setText("");
           okCheck = true;
        }
        ///////////////////////////
        //Email Check
        if(txtEmail.getText().length() == 0 || txtEmail.getText().contains(" ")){
            lblEmailErr.setText("Please enter a valid email.");
            okCheck = false;
        }
        else{
            lblEmailErr.setText("");
            okCheck = true;
        }
        
        ///////////////////////////
        //Code to Add new user to user table.
        if(okCheck){
            Rdao.addUser(txtUsername.getText(), passRetypePassword.getPassword(), txtFullName.getText(), txtAddress.getText(), txtEmail.getText()+cboxEmail.getSelectedItem());
            ms = new MainScreen(txtUsername.getText());
            ms.setVisible(true);
            this.dispose();
        }
        ///////////////////////////
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox cboxEmail;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddressErr;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailErr;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblFullNameErr;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordErr;
    private javax.swing.JLabel lblRetypePassword;
    private javax.swing.JLabel lblRetypePasswordErr;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameErr;
    private javax.swing.JPasswordField passPassword;
    private javax.swing.JPasswordField passRetypePassword;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
