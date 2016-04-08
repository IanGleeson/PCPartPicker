package program;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LogInScreen extends javax.swing.JFrame {

    SQLdao dao = new SQLdao();
    MainScreen ms;

    public LogInScreen() {
        initComponents();
        this.setTitle("PC Parts Picker");
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/resources/computerIcon.png"));
        this.setIconImage(ii.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JtxtLogIn = new javax.swing.JTextField();
        JtxtPassword = new javax.swing.JPasswordField();
        jLabelHeader = new javax.swing.JLabel();
        jButtonLogIn = new javax.swing.JButton();
        jLabelPass = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(JtxtLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 89, 139, -1));

        JtxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JtxtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(JtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 135, 139, -1));

        jLabelHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHeader.setText("PC Part Picker");
        getContentPane().add(jLabelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 33, -1, -1));

        jButtonLogIn.setText("Log In");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabelPass.setText("Password");
        getContentPane().add(jLabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 114, -1, -1));

        jLabelUser.setText("Username");
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 68, 113, -1));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        setSize(new java.awt.Dimension(258, 303));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        try {
            ms = new MainScreen(JtxtLogIn.getText());
            ms.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(LogInScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        //LogIn();
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        //Test method to bypass login 
        Register reg = new Register();
        this.setVisible(false);
        reg.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void JtxtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtxtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LogIn();
        }
    }//GEN-LAST:event_JtxtPasswordKeyPressed

    private void LogIn() {
        try {
            if (JtxtLogIn.getText() != null && JtxtPassword.getPassword() != null) {
                String[] LogIn = dao.logIn(JtxtLogIn.getText(), JtxtPassword.getPassword());
                if (LogIn[0].equals(JtxtLogIn.getText()) && LogIn[1].equals(new String(JtxtPassword.getPassword()))) {
                    ms = new MainScreen(JtxtLogIn.getText());
                    ms.setVisible(true);
                    this.setVisible(false);
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid username and password", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, "Error accessing database", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            JtxtPassword.setText("");
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LogInScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtxtLogIn;
    private javax.swing.JPasswordField JtxtPassword;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelUser;
    // End of variables declaration//GEN-END:variables
}
