package program;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;

public class MainScreen extends javax.swing.JFrame {

    //Methods object
    Methods meth;
    //orders ArrayList
    ArrayList<String> orderList;

    public MainScreen() throws SQLException {

        meth = new Methods();

        orderList = new ArrayList();

        initComponents();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/resources/computer.png"));
        this.setIconImage(ii.getImage());
    
     /*   //More Custom Code Here
        //Vanity Code
        //This needs to be changed to a dynamic reference 
        ImageIcon icon = new ImageIcon("C:/Users/Dsd06/Documents/tech.jpg"); 
        lbltech.setIcon(icon);
      */ 
       //Populate the List with Data Entries
        jTblData = new JTable(meth.buildTableModel(meth.displayAllProducts())); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanes = new javax.swing.JTabbedPane();
        jPanelSplash = new javax.swing.JPanel();
        lbltech = new javax.swing.JLabel();
        jPanelInventory = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTblData = new javax.swing.JTable();
        lblCategory = new javax.swing.JLabel();
        cboxCategory = new javax.swing.JComboBox();
        lblDescription = new javax.swing.JLabel();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        txtaDescription = new javax.swing.JTextArea();
        jPanelReturns = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblOrderHistory = new javax.swing.JLabel();
        jPanelOrder = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        btnProceed = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        btnSignout = new javax.swing.JButton();
        lblWallet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPanes.setName(""); // NOI18N

        jPanelSplash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltech.setBackground(new java.awt.Color(0, 0, 255));
        jPanelSplash.add(lbltech, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 400, 300));

        jTabbedPanes.addTab("Splash", jPanelSplash);

        jPanelInventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSearch.setText("Search");
        jPanelInventory.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, 47, -1));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        jPanelInventory.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 162, -1));

        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jPanelInventory.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 476, 122, -1));

        jTblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Type", "Quantity In Stock"
            }
        ));
        jScrollPane6.setViewportView(jTblData);

        jPanelInventory.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 42, 581, 459));

        lblCategory.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblCategory.setText("Category:");
        jPanelInventory.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 16, -1, -1));

        cboxCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelInventory.add(cboxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 12, -1, -1));

        lblDescription.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDescription.setText("Description:");
        jPanelInventory.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 92, -1, -1));

        txtaDescription.setColumns(20);
        txtaDescription.setLineWrap(true);
        txtaDescription.setRows(5);
        txtaDescription.setText("Click a product to view description.");
        txtaDescription.setWrapStyleWord(true);
        jScrollPaneDescription.setViewportView(txtaDescription);

        jPanelInventory.add(jScrollPaneDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, 193, 344));

        jTabbedPanes.addTab("Inventory", jPanelInventory);

        btnReturn.setText("Return selected");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        lblOrderHistory.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblOrderHistory.setText("Order History");

        javax.swing.GroupLayout jPanelReturnsLayout = new javax.swing.GroupLayout(jPanelReturns);
        jPanelReturns.setLayout(jPanelReturnsLayout);
        jPanelReturnsLayout.setHorizontalGroup(
            jPanelReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReturnsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
            .addGroup(jPanelReturnsLayout.createSequentialGroup()
                .addGroup(jPanelReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReturnsLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelReturnsLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(lblOrderHistory)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanelReturnsLayout.setVerticalGroup(
            jPanelReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReturnsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblOrderHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPanes.addTab("Returns", jPanelReturns);

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel6);

        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOrderLayout = new javax.swing.GroupLayout(jPanelOrder);
        jPanelOrder.setLayout(jPanelOrderLayout);
        jPanelOrderLayout.setHorizontalGroup(
            jPanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderLayout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addGroup(jPanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderLayout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))))
        );
        jPanelOrderLayout.setVerticalGroup(
            jPanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTabbedPanes.addTab("Order", jPanelOrder);

        getContentPane().add(jTabbedPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 830, 530));

        lblUser.setText("Username");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        btnSignout.setText("Sign-out");
        btnSignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignout, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 30, -1, 30));

        lblWallet.setText("€0.00");
        getContentPane().add(lblWallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        orderList.clear();
        meth.order(orderList);
        txtaDescription.setText(orderList.toString());
    }//GEN-LAST:event_btnOrderActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped

    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtaDescription.setText(meth.search(txtSearch.getText()));
        }

    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        //When text is entered here the list will be filtered
        
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignoutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to clear the order?", 
       "Warning", JOptionPane.WARNING_MESSAGE);
        if(result == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(this, "Order basket has been emptied!");
            orderList.clear();
            orderList.add("Order empty!");
}
      
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        JOptionPane.showMessageDialog(this, "LOC monitor 21``   ---->   220$" );
    }//GEN-LAST:event_btnProceedActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // returns selected items to returned items table in the SQL universe :P
    }//GEN-LAST:event_btnReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProceed;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSignout;
    private javax.swing.JComboBox cboxCategory;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelInventory;
    private javax.swing.JPanel jPanelOrder;
    private javax.swing.JPanel jPanelReturns;
    private javax.swing.JPanel jPanelSplash;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JTabbedPane jTabbedPanes;
    private javax.swing.JTable jTblData;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblOrderHistory;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblWallet;
    private javax.swing.JLabel lbltech;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextArea txtaDescription;
    // End of variables declaration//GEN-END:variables

}
