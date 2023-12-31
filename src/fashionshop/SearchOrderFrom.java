/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionshop;

import fashionshop.OrderListImpl.Node;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thara
 */
public class SearchOrderFrom extends javax.swing.JFrame {

    /**
     * Creates new form SearchOrderFrom
     */
    public SearchOrderFrom() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButtonn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customerIdTextField = new javax.swing.JTextField();
        SearchCustomerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchCustomerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackButtonn.setBackground(new java.awt.Color(255, 60, 60));
        BackButtonn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackButtonn.setForeground(new java.awt.Color(255, 255, 255));
        BackButtonn.setText("Back");
        BackButtonn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter Customer ID : ");

        customerIdTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdTextFieldActionPerformed(evt);
            }
        });

        SearchCustomerButton.setBackground(new java.awt.Color(0, 128, 0));
        SearchCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchCustomerButton.setForeground(new java.awt.Color(255, 255, 255));
        SearchCustomerButton.setText("Search");
        SearchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        SearchCustomerTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Size", "Qty", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        SearchCustomerTable.setRowHeight(40);
        jScrollPane1.setViewportView(SearchCustomerTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButtonn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButtonn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonnActionPerformed
        // TODO add your handling code here:
         setVisible(false);
         MainForm mainform = new MainForm();       
         mainform.setVisible(true);
    }//GEN-LAST:event_BackButtonnActionPerformed

    private void customerIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdTextFieldActionPerformed

    private void SearchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCustomerButtonActionPerformed
        // TODO add your handling code here:
    String searchPhoneNumber = customerIdTextField.getText();
    double totalAmount = 0;
    DefaultTableModel model = (DefaultTableModel) SearchCustomerTable.getModel();
    model.setRowCount(0);

    String[] allowedSizes = {"M", "XL", "XXL", "XS", "S", "L"};

    boolean customerFound = false;

    Node firstNode = OrderController.getFirst(); 

    if (firstNode != null) {
        for (String size : allowedSizes) {
            double amount = 0;
            int qty = 0;

            Node temp = firstNode;
            boolean found = false;

            while (temp != null) {
                Order order = temp.getOrder();
                if (order.getPhoneNumber().equals(searchPhoneNumber) && order.getSize().equals(size)) {
                    qty = order.getOrderQuantity();
                    amount = qty * OrderUtils.getAmountBySize(order.getSize());
                    totalAmount += amount;

                    model.addRow(new Object[]{size, qty, amount});
                    found = true;
                    customerFound = true;
                    break;
                }
                temp = temp.getNext();
            }

            if (!found) {
                model.addRow(new Object[]{size, 0, 0.0});
            }
        }
    }

    if (!customerFound) {
        JOptionPane.showMessageDialog(null, "Invalid Customer ID", "Error", JOptionPane.ERROR_MESSAGE);
        model.setRowCount(0);
    } else {
        model.addRow(new Object[]{"Total Amount", "", totalAmount});
    }
     
    }//GEN-LAST:event_SearchCustomerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchOrderFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchOrderFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchOrderFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchOrderFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchOrderFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButtonn;
    private javax.swing.JButton SearchCustomerButton;
    private javax.swing.JTable SearchCustomerTable;
    private javax.swing.JTextField customerIdTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
