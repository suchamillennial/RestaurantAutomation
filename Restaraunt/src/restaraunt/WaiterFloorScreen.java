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
public class WaiterFloorScreen extends javax.swing.JPanel {

    private WaiterUI waiterUI;
    /**
     * Creates new form WaiterFloorScreen
     */
    public WaiterFloorScreen(WaiterUI waiterUI) {
        this.waiterUI = waiterUI;
        initComponents();
        initTableButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTable1 = new restaraunt.TableButton();
        btnTable2 = new restaraunt.TableButton();
        btnTable3 = new restaraunt.TableButton();
        btnTable4 = new restaraunt.TableButton();
        btnTable5 = new restaraunt.TableButton();
        btnTable6 = new restaraunt.TableButton();
        btnTable7 = new restaraunt.TableButton();
        btnTable8 = new restaraunt.TableButton();
        btnTable9 = new restaraunt.TableButton();
        btnTable10 = new restaraunt.TableButton();

        btnTable1.setText("Table 1");
        btnTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable1ActionPerformed(evt);
            }
        });

        btnTable2.setText("Table 2");
        btnTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable2ActionPerformed(evt);
            }
        });

        btnTable3.setText("Table 3");
        btnTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable3ActionPerformed(evt);
            }
        });

        btnTable4.setText("Table 4");
        btnTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable4ActionPerformed(evt);
            }
        });

        btnTable5.setText("Table 5");
        btnTable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable5ActionPerformed(evt);
            }
        });

        btnTable6.setText("Table 6");
        btnTable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable6ActionPerformed(evt);
            }
        });

        btnTable7.setText("Table 7");
        btnTable7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable7ActionPerformed(evt);
            }
        });

        btnTable8.setText("Table 8");
        btnTable8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable8ActionPerformed(evt);
            }
        });

        btnTable9.setText("Table 9");
        btnTable9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable9ActionPerformed(evt);
            }
        });

        btnTable10.setText("Table 10");
        btnTable10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTable8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTable8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable1ActionPerformed
        // TODO add your handling code here:
       waiterUI.showTableScreen(1);
    }//GEN-LAST:event_btnTable1ActionPerformed

    private void btnTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable2ActionPerformed
        // TODO add your handling code here:
        waiterUI.showTableScreen(2);
    }//GEN-LAST:event_btnTable2ActionPerformed

    private void btnTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable3ActionPerformed
        // TODO add your handling code here:
        waiterUI.showTableScreen(3);
    }//GEN-LAST:event_btnTable3ActionPerformed

    private void btnTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable4ActionPerformed
        // TODO add your handling code here:
        waiterUI.showTableScreen(4);
    }//GEN-LAST:event_btnTable4ActionPerformed

    private void btnTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable5ActionPerformed
        // TODO add your handling code here:
        waiterUI.showTableScreen(5);
    }//GEN-LAST:event_btnTable5ActionPerformed

    private void btnTable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable6ActionPerformed
        // TODO add your handling code here:
        waiterUI.showTableScreen(6);
    }//GEN-LAST:event_btnTable6ActionPerformed

    private void btnTable7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable7ActionPerformed
        // TODO add your handling code here:
        waiterUI.showTableScreen(7);
    }//GEN-LAST:event_btnTable7ActionPerformed

    private void btnTable8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable8ActionPerformed
        // TODO add your handling code here:
        waiterUI.showTableScreen(8);
    }//GEN-LAST:event_btnTable8ActionPerformed

    private void btnTable9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable9ActionPerformed
        // TODO add your handling code here:
        waiterUI.showTableScreen(9);
    }//GEN-LAST:event_btnTable9ActionPerformed

    private void btnTable10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable10ActionPerformed
        // TODO add your handling code here:
        waiterUI.showTableScreen(10);
    }//GEN-LAST:event_btnTable10ActionPerformed

    public void showTableScreen(){
        //TableButton tablebutton = (TableButton)evt.getSource();
        //waiterUI.showTableScreen(tablebutton.getTableID());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private restaraunt.TableButton btnTable1;
    private restaraunt.TableButton btnTable10;
    private restaraunt.TableButton btnTable2;
    private restaraunt.TableButton btnTable3;
    private restaraunt.TableButton btnTable4;
    private restaraunt.TableButton btnTable5;
    private restaraunt.TableButton btnTable6;
    private restaraunt.TableButton btnTable7;
    private restaraunt.TableButton btnTable8;
    private restaraunt.TableButton btnTable9;
    // End of variables declaration//GEN-END:variables

    public void initTableButtons() {
        
        Table table = new Table();
        //System.out.println(table.getStatus());
        table = waiterUI.getTable(1);
        btnTable1.setTable(table);
        //System.out.println("Table ID: "+table.getTableID());
        btnTable1.changeColor();
        
        table = waiterUI.getTable(2);
        btnTable2.setTable(table);
        btnTable2.changeColor();
        
        table = waiterUI.getTable(3);
        btnTable3.setTable(table);
        btnTable3.changeColor();
        
        table = waiterUI.getTable(4);
        btnTable4.setTable(table);
        btnTable4.changeColor();
        
        table = waiterUI.getTable(5);
        btnTable5.setTable(table);
        btnTable5.changeColor();
        
        table = waiterUI.getTable(6);
        btnTable6.setTable(table);
        btnTable6.changeColor();
        
        table = waiterUI.getTable(7);
        btnTable7.setTable(table);
        btnTable7.changeColor();
        
        table = waiterUI.getTable(8);
        btnTable8.setTable(table);
        btnTable8.changeColor();
        
        table = waiterUI.getTable(9);
        btnTable9.setTable(table);
        btnTable9.changeColor();
        
        table = waiterUI.getTable(10);
        btnTable10.setTable(table);
        btnTable10.changeColor();
        
    }
    
}
