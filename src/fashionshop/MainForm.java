/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionshop;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author thara
 */
public final class MainForm extends javax.swing.JFrame {
     private OrderList orderList; 
     public static final int PROCESSING = 0;
     public static final int DELIVERING = 1;
     public static final int DELIVERED = 2;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        scaleImage();
        setLocationRelativeTo(null);
    }
    
    public void scaleImage() {
    ImageIcon icon = new ImageIcon("D:\\ICET\\Netbeans\\FashionShop\\src\\Images\\background.png");

    Image scaledImage = icon.getImage().getScaledInstance(300, -1, Image.SCALE_SMOOTH);
    ImageIcon scaledBackgroundImage = new ImageIcon(scaledImage);

    // Assuming you have a JLabel named jLabel2 already defined in your UI
    jLabel2.setIcon(scaledBackgroundImage);
  }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SearchForm = new javax.swing.JButton();
        StatusForm = new javax.swing.JButton();
        ReportsForm = new javax.swing.JButton();
        DeleteForm = new javax.swing.JButton();
        PlaceOrderForm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("              Fashion Shop");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);

        SearchForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearchForm.setText("Search");
        SearchForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFormActionPerformed(evt);
            }
        });

        StatusForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusForm.setText("Status");
        StatusForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusFormActionPerformed(evt);
            }
        });

        ReportsForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ReportsForm.setText("Reports");
        ReportsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsFormActionPerformed(evt);
            }
        });

        DeleteForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteForm.setText("Delete");
        DeleteForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteFormActionPerformed(evt);
            }
        });

        PlaceOrderForm.setBackground(new java.awt.Color(255, 51, 51));
        PlaceOrderForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PlaceOrderForm.setForeground(new java.awt.Color(255, 255, 255));
        PlaceOrderForm.setText("Place Order");
        PlaceOrderForm.setAutoscrolls(true);
        PlaceOrderForm.setBorderPainted(false);
        PlaceOrderForm.setSelected(true);
        PlaceOrderForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderFormActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("                                                   Copyrights  PTI 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PlaceOrderForm, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(DeleteForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReportsForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StatusForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchForm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StatusForm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ReportsForm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteForm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(PlaceOrderForm, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFormActionPerformed
        // TODO add your handling code here:
        String[] options = { "SearchCustomer", "Search Order", "Cancel" };
        int selectedOption = JOptionPane.showOptionDialog(
								MainForm.this, //parent
								"Select Option", //message
								"Search Options", //title
								JOptionPane.YES_NO_CANCEL_OPTION, //option
								JOptionPane.QUESTION_MESSAGE, //type
								null, //icon
								options, //options
								options[0] //default option
							);
      if (selectedOption == JOptionPane.YES_OPTION) {
        setVisible(false);
        SearchOrderFrom searchOrderForm = new SearchOrderFrom();
        searchOrderForm.setVisible(true);
    } else if (selectedOption == JOptionPane.NO_OPTION) {
        setVisible(false);
        OrderSearchForm orderSearchForm = new OrderSearchForm();
        orderSearchForm.setVisible(true);
    } else if (selectedOption == JOptionPane.CANCEL_OPTION) {
        // User clicked "Option 3" or closed the dialog
        // Add your code for Option 3 here or handle the dialog closing
    }
    }//GEN-LAST:event_SearchFormActionPerformed

    private void StatusFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusFormActionPerformed
        // TODO add your handling code here:
           setVisible(false);

            
            StatusForm statusForm = new StatusForm();
            statusForm.setVisible(true);
    }//GEN-LAST:event_StatusFormActionPerformed

    private void PlaceOrderFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderFormActionPerformed
        // TODO add your handling code here:
            setVisible(false);

            
            PlaceOrderForm placeOrderForm = new PlaceOrderForm();
            placeOrderForm.setVisible(true);
    }//GEN-LAST:event_PlaceOrderFormActionPerformed

    private void ReportsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsFormActionPerformed
        // TODO add your handling code here:
           setVisible(false);

            
            ReportsForm reportForm = new ReportsForm();
            reportForm.setVisible(true);
    }//GEN-LAST:event_ReportsFormActionPerformed

    private void DeleteFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteFormActionPerformed
        // TODO add your handling code here:
            setVisible(false);

            
            DeleteForm deleteForm = new DeleteForm();
            deleteForm.setVisible(true);
    }//GEN-LAST:event_DeleteFormActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteForm;
    private javax.swing.JButton PlaceOrderForm;
    private javax.swing.JButton ReportsForm;
    private javax.swing.JButton SearchForm;
    private javax.swing.JButton StatusForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
