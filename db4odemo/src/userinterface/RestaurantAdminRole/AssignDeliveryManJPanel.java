/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import userinterface.CustomerRole.*;
import Business.EcoSystem;
import Business.Order;
import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AssignDeliveryManJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    
    Order order;
    EcoSystem business;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public AssignDeliveryManJPanel(JPanel userProcessContainer, Order order,EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        
        this.order = order;
        this.business=business;
        populateComboBox();
       
    }

   public void  populateComboBox(){
        DefaultComboBoxModel dm=new DefaultComboBoxModel();
           for(Organization o:business.getDeliveryManDirectory().getOrganizationList()){
             for(UserAccount u:o.getUserAccountDirectory().getUserAccountList())  {
         
           dm.addElement(u); 
             }
   }
       deliveryManComboBox.setModel(dm);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * JComboBox<String> seatsComboBox;
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestdeliveryJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        deliveryManComboBox = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestdeliveryJButton.setText("Request delivery");
        requestdeliveryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestdeliveryJButtonActionPerformed(evt);
            }
        });
        add(requestdeliveryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel1.setText("Deliver man :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 40, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        deliveryManComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryManComboBoxActionPerformed(evt);
            }
        });
        add(deliveryManComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestdeliveryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestdeliveryJButtonActionPerformed
  UserAccount selectedItem = (UserAccount) deliveryManComboBox.getSelectedItem();
        
        if (selectedItem == null){
            return;
        }
        order.setStatus("assigned");
        order.setDeliveryManName(selectedItem.getEmployee().getName());  
        order.setDeliveryManUserName(selectedItem.getUsername()); 
        order.setDeliveryManId(selectedItem.getEmployee().getId()); 
        JOptionPane.showMessageDialog(null, "Delivery man assigned successfully");
         return ; 
        
        
    }//GEN-LAST:event_requestdeliveryJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
       // dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deliveryManComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryManComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryManComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> deliveryManComboBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton requestdeliveryJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
