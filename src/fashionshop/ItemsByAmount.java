/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionshop;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thara
 */
public class ItemsByAmount extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    private int[] totalQtys;
    private double[] totalAmounts;
    private String[] sizes = {"XS", "S", "M", "L", "XL", "XXL"};
    private Order[] customers;
    /**
     * Creates new form ItemsByAmount
     */
    public ItemsByAmount() {
        initComponents();
        tableModel = new DefaultTableModel(new Object[]{"Size", "Qty", "Total Amount"}, 0);
        jTable1.setModel(tableModel);
        populateItemsByQtyData();
        setLocationRelativeTo(null);
    }
        private void populateItemsByQtyData() {
     
        totalQtys = new int[sizes.length];
        totalAmounts = new double[sizes.length];
       
      
        customers = new Order[OrderController.size()];
        
        for (int i = 0; i < OrderController.size(); i++) {
            customers[i] = OrderController.getOrder(i);
        }
      
       
        for (int i = 0; i < customers.length; i++) {
            Order order = customers[i];
            String size = order.getSize();
            int quantity = order.getOrderQuantity();
            double amount = quantity * OrderUtils.getAmountBySize(size);

           
            for (int j = 0; j < sizes.length; j++) {
                if (size.equals(sizes[j])) {
                    totalQtys[j] += quantity;
                    totalAmounts[j] += amount;
                    break; 
                }
            }
        }

      
         for (int i = 1; i < totalQtys.length; i++) {
            for (int j = 1; j < totalQtys.length; j++) {

                if (totalAmounts[j - 1] < totalAmounts[j]) {

                    double t = totalAmounts[j - 1];
                    totalAmounts[j - 1] = totalAmounts[j];
                    totalAmounts[j] = t;

                    int q = totalQtys[j - 1];
                    totalQtys[j - 1] = totalQtys[j];
                    totalQtys[j] = q;

                    String s = sizes[j - 1];
                    sizes[j - 1] = sizes[j];
                    sizes[j] = s;
                }
            }
        }
       
        tableModel.setRowCount(0);

       
        for (int i = 0; i < sizes.length; i++) {
            tableModel.addRow(new Object[]{sizes[i], totalQtys[i], totalAmounts[i]});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BackButton.setBackground(new java.awt.Color(255, 60, 60));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Size", "Qty", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
         setVisible(false);
         ReportsForm reportsform = new ReportsForm();       
         reportsform.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ItemsByAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemsByAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemsByAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemsByAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemsByAmount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
