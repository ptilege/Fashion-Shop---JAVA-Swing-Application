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
public class AllCustomersForm extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    
    /**
     * Creates new form AllCustomersForm
     */
    public AllCustomersForm() {
        initComponents();
        tableModel = new DefaultTableModel(new Object[]{"Phone Number", "XS", "S", "M", "L", "XL", "XXL", "Total Amount"}, 0);
        jTable1.setModel(tableModel);
        populateCustomerData();
        setLocationRelativeTo(null);
    }
    
  private void populateCustomerData() {
    
     int orderCount = OrderController.size();
     String[] phoneNumbers = new String[orderCount];  
     int phoneNumbersCount = 0; 

    for (int i = 0; i < orderCount; i++) {
      String phoneNumber = OrderController.getOrder(i).getPhoneNumber();
    
    boolean isDuplicate = false;
    for (int j = 0; j < phoneNumbersCount; j++) {
        if (phoneNumbers[j].equals(phoneNumber)) {
            isDuplicate = true;
            break;
        }
    }
    
   
    if (!isDuplicate) {
        phoneNumbers[phoneNumbersCount++] = phoneNumber;
    }
}

    
    for (String phoneNumber : phoneNumbers) {
        int[] tempSizes = new int[6];

        
        for (int i = 0; i < OrderController.size(); i++) {
            Order order = OrderController.getOrder(i);
            if (phoneNumber.equals(order.getPhoneNumber())) {
                switch (order.getSize()) {
                    case "XS":
                        tempSizes[0] += order.getOrderQuantity();
                        break;
                    case "S":
                        tempSizes[1] += order.getOrderQuantity();
                        break;
                    case "M":
                        tempSizes[2] += order.getOrderQuantity();
                        break;
                    case "L":
                        tempSizes[3] += order.getOrderQuantity();
                        break;
                    case "XL":
                        tempSizes[4] += order.getOrderQuantity();
                        break;
                    case "XXL":
                        tempSizes[5] += order.getOrderQuantity();
                        break;
                }
            }
        }

        double total = 0;
        for (int j = 0; j < tempSizes.length; j++) {
            total += tempSizes[j] * OrderUtils.getAmountBySize(getSizeByColumn(j + 1));
        }

       
        tableModel.addRow(new Object[]{phoneNumber, tempSizes[0], tempSizes[1], tempSizes[2], tempSizes[3], tempSizes[4], tempSizes[5], total});
    }
}

    private void calculateTotalAmount() {
       
        for (int row = 0; row < tableModel.getRowCount(); row++) {
            double totalAmount = 0;
           
            for (int col = 1; col <= 6; col++) {
                int quantity = (int) tableModel.getValueAt(row, col);
                double sizeAmount = OrderUtils.getAmountBySize(getSizeByColumn(col));
                totalAmount += quantity * sizeAmount;
            }
            
            tableModel.setValueAt(totalAmount, row, 7);
        }
    }

    private String getSizeByColumn(int column) {
        switch (column) {
            case 1: return "XS";
            case 2: return "S";
            case 3: return "M";
            case 4: return "L";
            case 5: return "XL";
            case 6: return "XXL";
            default: return "";
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(255, 60, 60));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phone Number", "XS", "S", "M", "L", "XL", "XXL", "Total Amount"
            }
        ));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
         ReportsForm reportsform = new ReportsForm();       
         reportsform.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AllCustomersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllCustomersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllCustomersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllCustomersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllCustomersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
