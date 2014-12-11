/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaraunt;

/**
 *
 * @author tejgi_000
 */
public class WaiterTableScreen extends javax.swing.JPanel {

    private WaiterUI waiterUI;
    private int tableID;
    /**
     * Creates new form WaiterTableScreen
     */
    public WaiterTableScreen(int tableID, WaiterUI waiterUI) {
        
        this.waiterUI = waiterUI;
        this.tableID = tableID;
        System.out.println("HOW: "+tableID);
        initComponents();
        initCBChangeStatus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblPromptStatus = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        cbChangeStatus = new javax.swing.JComboBox();
        btnChangeStatus = new javax.swing.JButton();
        btnSubmitOrder = new javax.swing.JButton();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPromptStatus.setText("Table Status:");

        btnAddItem.setText("Add Item to Order");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        lblStatus.setText("status");

        cbChangeStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnChangeStatus.setText("Change Table Status");
        btnChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeStatusActionPerformed(evt);
            }
        });

        btnSubmitOrder.setText("Submit Order");
        btnSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPromptStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbChangeStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChangeStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btnSubmitOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPromptStatus)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangeStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmitOrder)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        waiterUI.showFloorScreen();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        waiterUI.showAddItemScreen();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeStatusActionPerformed
        // TODO add your handling code here:
        updateTableStatus();
    }//GEN-LAST:event_btnChangeStatusActionPerformed

    private void btnSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangeStatus;
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.JComboBox cbChangeStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPromptStatus;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
    public void initCBChangeStatus(){
        cbChangeStatus.removeAllItems();
        cbChangeStatus.addItem("OPEN");
        cbChangeStatus.addItem("OCCUPIED");
        cbChangeStatus.addItem("DIRTY");
        cbChangeStatus.setSelectedItem("OPEN");
        System.out.println("TableID: "+ tableID);
        System.out.println(waiterUI.getTable(tableID));
        lblStatus.setText(waiterUI.getTable(tableID).getStatus());
    }
    
    public void updateTableStatus(){
        String status = cbChangeStatus.getSelectedItem().toString();
        waiterUI.updateTableStatus(tableID, status);
        System.out.println(tableID);
        System.out.println(waiterUI.getTable(tableID));
        lblStatus.setText(waiterUI.getTable(tableID).getStatus());
        
    }
    public void updateStatusLabel(){
        waiterUI.getStatusOfTable(tableID);
    }
}


