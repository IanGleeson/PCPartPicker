package program;

import java.sql.SQLException;
import java.time.Clock;
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

        JtxtLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtLogInActionPerformed(evt);
            }
        });

        jLabelHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHeader.setText("PC Part Picker");

        jButtonLogIn.setText("Log In");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });

        jLabelPass.setText("Password");

        jLabelUser.setText("Username");

        jLabelError.setText("User/Pass Wrong. Try again");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPass)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabelHeader)))
                                .addComponent(JtxtLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(jButtonLogIn))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelHeader)
                .addGap(18, 18, 18)
                .addComponent(jLabelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtxtLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButtonLogIn)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        dao.connect();
        System.out.print("working");
//        MainScreen x = new MainScreen();
//        this.setVisible(false);
//        x.setVisible(true);
        //temporary bypass for testing
//        char[] pass = {'p','a','s','s','w','o','r','d'};
        
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
