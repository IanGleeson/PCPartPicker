package program;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LogInScreen extends javax.swing.JFrame {

    SQLdao dao = new SQLdao();

    public LogInScreen() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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

        setSize(new java.awt.Dimension(258, 303));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
//        dao.connect();
//        System.out.print("working");
        MainScreen x;
        try{
            x = new MainScreen();
            this.setVisible(false);
            x.setVisible(true);
        }catch (SQLException ex) {
            Logger.getLogger(LogInScreen.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            
        }
        
        
        
//        MainScreen x;
//        try {
//            x = new MainScreen();
//            x.setVisible(true);
//        } catch (SQLException ex) {
//            Logger.getLogger(LogInScreen.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        this.setVisible(false);
        
        //temporary bypass for testing
//        char[] pass = {'p','a','s','s','w','o','r','d'};

//        dao.logIn("username", pass);
//        try {
//            dao.connect();
//            if (JtxtLogIn.getText() != null && JtxtPassword.getPassword() != null) {
//                String[] LogIn = dao.logIn(JtxtLogIn.getText(), JtxtPassword.getPassword());
//                if (LogIn[0].equals(JtxtLogIn.getText()) && LogIn[1].equals(Arrays.toString(JtxtPassword.getPassword()))) {
//                    System.out.print("working");
//                    this.setVisible(false);
//                    MainScreen ms = new MainScreen();
//                    ms.setVisible(true);
//                }
//            }
//        } catch (NullPointerException d) {
//            JOptionPane.showMessageDialog(null, this, "Please enter a username and password.", JOptionPane.ERROR_MESSAGE);
//        } catch (SQLException ex) {
//            Logger.getLogger(LogInScreen.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            JtxtPassword.setText("");
//        }
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void JtxtLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtLogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtLogInActionPerformed

    public static void main(String args[]) {
        try {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
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
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelUser;
    // End of variables declaration//GEN-END:variables
}
