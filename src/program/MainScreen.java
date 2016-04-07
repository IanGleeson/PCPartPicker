package program;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import static program.Methods.checkoutList;

public class MainScreen extends javax.swing.JFrame {

    Methods meth;
    SQLdao dao;
    ArrayList<String> orderList;
    Component[] componentArr;

    public MainScreen() throws SQLException {

        dao = new SQLdao();
        meth = new Methods();
        orderList = new ArrayList();

        initComponents();
        
        lblUser.setText(User);
        
        //Icon Graphical code
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/resources/computerIcon.png"));
        this.setIconImage(ii.getImage());

        //Main Graphical Stuff
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/resources/tech.jpg"));
        lbltech.setIcon(icon);

        //Populate the Table with entries
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
        jScrollOrderHistory = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblOrderHistory = new javax.swing.JLabel();
        jPanelOrder = new javax.swing.JPanel();
        jScrollPaneOrder = new javax.swing.JScrollPane();
        pnlOrder = new javax.swing.JPanel();
        btnProceed = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        btnSignout = new javax.swing.JButton();
        lblWallet = new javax.swing.JLabel();
        btnWallet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPanes.setName(""); // NOI18N

        jPanelSplash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltech.setBackground(new java.awt.Color(0, 0, 255));
        jPanelSplash.add(lbltech, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 780, 400));

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
        });
        jPanelInventory.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 162, -1));

        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jPanelInventory.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 120, 50));

        jTblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Category", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblData.setColumnSelectionAllowed(true);
        jTblData.getTableHeader().setReorderingAllowed(false);
        jTblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblDataMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTblData);
        jTblData.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanelInventory.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 42, 581, 459));

        lblCategory.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblCategory.setText("Category:");
        jPanelInventory.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        cboxCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Keyboard", "Mouse", "Monitor", "Gfx Card", "Motherboard", "Memory", "CPU", "Fans", "Cases" }));
        jPanelInventory.add(cboxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 90, -1));

        lblDescription.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDescription.setText("Description:");
        jPanelInventory.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 92, -1, -1));

        txtaDescription.setColumns(20);
        txtaDescription.setLineWrap(true);
        txtaDescription.setRows(5);
        txtaDescription.setText("Click a product to view description.");
        txtaDescription.setWrapStyleWord(true);
        jScrollPaneDescription.setViewportView(txtaDescription);

        jPanelInventory.add(jScrollPaneDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, 193, 320));

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

        jScrollOrderHistory.setViewportView(jPanel1);

        lblOrderHistory.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblOrderHistory.setText("Order History");

        javax.swing.GroupLayout jPanelReturnsLayout = new javax.swing.GroupLayout(jPanelReturns);
        jPanelReturns.setLayout(jPanelReturnsLayout);
        jPanelReturnsLayout.setHorizontalGroup(
            jPanelReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReturnsLayout.createSequentialGroup()
                .addGroup(jPanelReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReturnsLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jScrollOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelReturnsLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(lblOrderHistory))
                    .addGroup(jPanelReturnsLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanelReturnsLayout.setVerticalGroup(
            jPanelReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReturnsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblOrderHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPanes.addTab("Returns", jPanelReturns);

        jScrollPaneOrder.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneOrder.setToolTipText("");
        jScrollPaneOrder.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout pnlOrderLayout = new javax.swing.GroupLayout(pnlOrder);
        pnlOrder.setLayout(pnlOrderLayout);
        pnlOrderLayout.setHorizontalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        pnlOrderLayout.setVerticalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jScrollPaneOrder.setViewportView(pnlOrder);

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
                        .addComponent(jScrollPaneOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPaneOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTabbedPanes.addTab("Order", jPanelOrder);

        getContentPane().add(jTabbedPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 830, 570));

        lblUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUser.setText("Username");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        btnSignout.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSignout.setText("Sign-out");
        btnSignout.setBorderPainted(false);
        btnSignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignout, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, 20));

        lblWallet.setText("€0.00");
        getContentPane().add(lblWallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 40, 30));

        btnWallet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10AML4VB_alt.jpg"))); // NOI18N
        btnWallet.setBorderPainted(false);
        btnWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWalletActionPerformed(evt);
            }
        });
        getContentPane().add(btnWallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
//        orderList.clear();
//        meth.order(orderList);
//        txtaDescription.setText(orderList.toString());

        pnlOrder.setLayout(null); // <---No layout manager - uses absolute positioning system
        
        jTblData.getValueAt(jTblData.getSelectedRow(), jTblData.getSelectedColumn());
        pnlOrder.add(meth.returnCheckBox());
        pnlOrder.add(meth.returnSpinner());

        pnlOrder.repaint();
        pnlOrder.revalidate();
    }//GEN-LAST:event_btnOrderActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtSearch.getText().equals("")) {
                //Updates the table based on the query
                //meth.search(txtSearch.getText());
                txtaDescription.setText("This is a description");
                //txtaDescription.setText(meth.search(rst))
            } else {
                JOptionPane.showMessageDialog(null, "Please enter something to search for!");
            }
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        super.setVisible(true);


    }//GEN-LAST:event_btnSignoutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to clear the order?",
                "Warning", JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            //removing CheckBoxes and Spinners from panel
            pnlOrder.removeAll();
            meth.y = 50;
            meth.x = 50;
            pnlOrder.repaint();
            pnlOrder.revalidate();
            JOptionPane.showMessageDialog(this, "Order basket has been emptied!");
            orderList.clear();
            orderList.add("Order empty!");
            pnlOrder.removeAll();
        }
    }//GEN-LAST:event_btnClearActionPerformed


    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        componentArr = pnlOrder.getComponents();
        meth.checkoutProd(componentArr);
    }//GEN-LAST:event_btnProceedActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // returns selected items to returned items table in the SQL universe :P
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        meth.search(txtSearch.getText());
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWalletActionPerformed
        Wallet w = new Wallet();
        w.setVisible(true);
    }//GEN-LAST:event_btnWalletActionPerformed

    private void jTblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblDataMouseClicked
        if (jTblData.getValueAt(jTblData.getSelectedRow(), 1) != null) {
            txtaDescription.setText(dao.getDescription((String) jTblData.getValueAt(jTblData.getSelectedRow(), 1)));
        }
    }//GEN-LAST:event_jTblDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProceed;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSignout;
    private javax.swing.JButton btnWallet;
    private javax.swing.JComboBox cboxCategory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInventory;
    private javax.swing.JPanel jPanelOrder;
    private javax.swing.JPanel jPanelReturns;
    private javax.swing.JPanel jPanelSplash;
    private javax.swing.JScrollPane jScrollOrderHistory;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JScrollPane jScrollPaneOrder;
    private javax.swing.JTabbedPane jTabbedPanes;
    private javax.swing.JTable jTblData;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblOrderHistory;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblWallet;
    private javax.swing.JLabel lbltech;
    private javax.swing.JPanel pnlOrder;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextArea txtaDescription;
    // End of variables declaration//GEN-END:variables

}
