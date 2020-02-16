/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AEDSpring2019
 */
public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    List<User> list;
    JPanel panelRight;
    public LoginScreen(JPanel panelRight, List<User> list) {
        initComponents();
        this.list = list;
        this.panelRight = panelRight;
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JLabel();
        txtPword = new javax.swing.JPasswordField();
        showjCheckBox = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 204, 255));

        btnSubmit.setText("Login");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        comboUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUserActionPerformed(evt);
            }
        });

        txtTitle.setText("Supplier Login Screen");

        showjCheckBox.setText("show password");
        showjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showjCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnSubmit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showjCheckBox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboUser, 0, 166, Short.MAX_VALUE)
                                .addComponent(txtTitle)
                                .addComponent(txtPword)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTitle)
                .addGap(18, 18, 18)
                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(showjCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        User user = (User) comboUser.getSelectedItem();
        String password=txtPword.getText();
 boolean result=user.verify(password);
 if(result==false){
 JOptionPane.showMessageDialog(null, "Incorrect password");
 return;
 }else{
 CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add(new SuccessScreen(user));
        layout.next(panelRight);}
 
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void comboUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUserActionPerformed

    private void showjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showjCheckBoxActionPerformed
        // TODO add your handling code here:
        if(showjCheckBox.isSelected()){
            txtPword.setEchoChar((char)0);
        }
        else{
            txtPword.setEchoChar('*');
        }
       
    }//GEN-LAST:event_showjCheckBoxActionPerformed

    
    private void initialize(){
        //text should either be "Supplier Login Screen" OR "Customer Login Screen"
        //Based on the selection
        DefaultComboBoxModel dcb= new DefaultComboBoxModel();
        comboUser.removeAllItems();
        for(User user : list)
        {
            if((user.getRole()).equals("CUSTOMER")){
                txtTitle.setText("Customer Login Screen");   
            dcb.addElement(user);
           comboUser.setModel(dcb);
        } else
            if((user.getRole()).equals("SUPPLIER")){
                txtTitle.setText("Supplier Login Screen");
            dcb.addElement(user);
            comboUser.setModel(dcb);
        }


                
            } 
        //only customer or suppliers should be listed based on the selection
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<Object> comboUser;
    private javax.swing.JCheckBox showjCheckBox;
    private javax.swing.JPasswordField txtPword;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
