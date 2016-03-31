package program;

import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LogInScreen extends javax.swing.JFrame {

    SQLdao dao = new SQLdao();

    public LogInScreen() {
        initComponents();
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/resources/computer.png"));
        this.setIconImage(ii.getImage());
        jLabelError.setVisible(false);
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
        jLabelError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtxtLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtLogInActionPerformed(evt);
            }
        });
        getContentPane().add(JtxtLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 89, 139, -1));
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
        getContentPane().add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 196, -1, -1));

        jLabelPass.setText("Password");
        getContentPane().add(jLabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 114, -1, -1));

        jLabelUser.setText("Username");
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 68, 113, -1));

        jLabelError.setText("User/Pass Wrong. Try again");
        getContentPane().add(jLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 166, 139, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        MainScreen x = new MainScreen();
        this.setVisible(false);
        x.setVisible(true);
        //temporary bypass for testing
//        char[] pass = {'p','a','s','s','w','o','r','d'};
        //dao.connect();
//        dao.logIn("username", pass);
        
//        try {
//            dao.connect();
//            if (JtxtLogIn.getText() != null && JtxtPassword.getPassword() != null) {
//                if (dao.logIn(JtxtLogIn.getText(), JtxtPassword.getPassword()).next()) {
//                    this.setVisible(false);
//                    MainScreen ms = new MainScreen();
//                    ms.setVisible(true);
//                } else {
//                    jLabelError.setVisible(true);
//                }
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, this, "Error accessing database.", JOptionPane.ERROR_MESSAGE);
//        } catch(NullPointerException d){
//            JOptionPane.showMessageDialog(null, this, "Please enter a username and password.", JOptionPane.ERROR_MESSAGE);
//        }finally {
//            JtxtPassword.setText("");
//        }
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void JtxtLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtLogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtLogInActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInScreen().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtxtLogIn;
    private javax.swing.JPasswordField JtxtPassword;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelUser;
    // End of variables declaration//GEN-END:variables
}
