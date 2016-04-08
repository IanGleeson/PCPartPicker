package program;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author dsd03
 */
public class Wallet extends javax.swing.JFrame {
    double AmountToAdd = 0;
    SQLdao Wdao;
    String tempUser;
    boolean closed = false;
    MainScreen ms;

    public Wallet(String User, MainScreen ms) {
        initComponents();
        this.setSize(450, 300);
        this.setTitle("PC Parts Picker");
        Wdao = new SQLdao();
        tempUser = User;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd5 = new javax.swing.JButton();
        btnAdd10 = new javax.swing.JButton();
        btnAdd25 = new javax.swing.JButton();
        btnAdd50 = new javax.swing.JButton();
        btnAdd100 = new javax.swing.JButton();
        lblBalance = new javax.swing.JLabel();
        lblWalletTitle = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        lblAmountToAdd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd5.setText("Add € 5");
        btnAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 31, 79, -1));

        btnAdd10.setText("Add € 10");
        btnAdd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 65, 79, -1));

        btnAdd25.setText("Add € 25");
        btnAdd25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd25ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 107, 79, -1));

        btnAdd50.setText("Add € 50");
        btnAdd50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd50ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 149, 79, -1));

        btnAdd100.setText("Add € 100");
        btnAdd100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd100ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 191, -1, -1));

        lblBalance.setText("Current Balance: ");
        getContentPane().add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 31, -1, -1));

        lblWalletTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblWalletTitle.setText("Wallet");
        getContentPane().add(lblWalletTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 6, -1, -1));

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 128, 87, 66));

        lblAmountToAdd.setText("Amount to Add: ");
        getContentPane().add(lblAmountToAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 65, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void changeBalance(MainScreen ms){
        ms.setWallet(AmountToAdd);
    }
    
    public boolean walletClosed(){
        return closed;
    }
    
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
    int result = JOptionPane.showConfirmDialog(this,
    "Would you like to add the amount to wallet?",
    "An Inane Question",
    JOptionPane.YES_NO_OPTION);
    
    if(result == JOptionPane.YES_OPTION){
        changeBalance(ms);
        this.setVisible(false);
    }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd5ActionPerformed
        lblAmountToAdd.setText("Amount to Add: " + (AmountToAdd+=5));
    }//GEN-LAST:event_btnAdd5ActionPerformed

    private void btnAdd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd10ActionPerformed
        lblAmountToAdd.setText("Amount to Add: " + (AmountToAdd+=10));
    }//GEN-LAST:event_btnAdd10ActionPerformed

    private void btnAdd25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd25ActionPerformed
        lblAmountToAdd.setText("Amount to Add: " + (AmountToAdd+=25));
    }//GEN-LAST:event_btnAdd25ActionPerformed

    private void btnAdd50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd50ActionPerformed
        lblAmountToAdd.setText("Amount to Add: " + (AmountToAdd+=50));
    }//GEN-LAST:event_btnAdd50ActionPerformed

    private void btnAdd100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd100ActionPerformed
        lblAmountToAdd.setText("Amount to Add: " + (AmountToAdd+=100));
    }//GEN-LAST:event_btnAdd100ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd10;
    private javax.swing.JButton btnAdd100;
    private javax.swing.JButton btnAdd25;
    private javax.swing.JButton btnAdd5;
    private javax.swing.JButton btnAdd50;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblAmountToAdd;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblWalletTitle;
    // End of variables declaration//GEN-END:variables
}
