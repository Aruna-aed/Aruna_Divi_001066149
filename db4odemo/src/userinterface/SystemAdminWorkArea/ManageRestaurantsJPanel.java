/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aruna Divi
 */
public class ManageRestaurantsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantsJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    
           Enterprise enterprise; 
      Organization organization;
    public ManageRestaurantsJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTable();
        if(enterprise!=null &&organization!=null ){
       this.enterprise = ecosystem.getEnterpriseDirectory().searchEnterprise(txtSearchRestaurant.getText());
        this.organization=enterprise.getRestaurantDirectory().searchOrganization("RestaurantAdmin") ;
        }
    }
public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblRestaurantsList.getModel();
        Enterprise result = ecosystem.getEnterpriseDirectory().searchEnterprise(txtSearchRestaurant.getText());
        //Organization organization1=result.getRestaurantDirectory().searchOrganization("RestaurantAdmin") ;
        dtm.setRowCount(0);
        for(Enterprise enterprise:ecosystem.getEnterpriseDirectory().getEnterpriseList()) {
            Object row[] = new Object[3];
            row[0] = enterprise.getName();
            row[1] = enterprise.getAddress();
            row[2] = enterprise;
            //row[4] = airliner.getFlightDir().getFlightList().size();
            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantsList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnNewRestaurant = new javax.swing.JButton();
        btnUpdateRestaurant = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSearchRestaurant = new javax.swing.JTable();
        btnManageFlights = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSearchRestaurant = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        DeleteManagersBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        DeleteRestaurant = new javax.swing.JButton();

        tblRestaurantsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Address", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurantsList);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Restaurants List");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Restaurants");

        btnNewRestaurant.setText("New Restaurant>>");
        btnNewRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRestaurantActionPerformed(evt);
            }
        });

        btnUpdateRestaurant.setText("Update Restaurant");
        btnUpdateRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRestaurantActionPerformed(evt);
            }
        });

        tblSearchRestaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Manager Name", "Manager User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSearchRestaurant);

        btnManageFlights.setText("Update Managers");
        btnManageFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFlightsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Restaurant Name");

        txtSearchRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchRestaurantActionPerformed(evt);
            }
        });

        btnSearch.setText("Search Restaurant");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        DeleteManagersBtn.setText("Delete Manger");
        DeleteManagersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteManagersBtnActionPerformed(evt);
            }
        });

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DeleteRestaurant.setText("Delete restaurant");
        DeleteRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRestaurantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnManageFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(DeleteManagersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeleteRestaurant)
                                .addGap(89, 89, 89)
                                .addComponent(btnNewRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnUpdateRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNewRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DeleteRestaurant))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteManagersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRestaurantActionPerformed
        // TODO add your handling code here:
          CreateNewRestaurantJPanel panel = new CreateNewRestaurantJPanel(userProcessContainer,ecosystem);
        userProcessContainer.add("CreateNewRestaurantJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnNewRestaurantActionPerformed

    private void btnUpdateRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRestaurantActionPerformed
        // TODO add your handling code here:
int selectedRow = tblSearchRestaurant.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            UserAccount ua = (UserAccount)tblSearchRestaurant.getValueAt(selectedRow, 2);
            UpdateUserJPanel panel = new UpdateUserJPanel(userProcessContainer,ua,"RestaurantAdmin");
            userProcessContainer.add("UpdateManagerJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUpdateRestaurantActionPerformed

    private void btnManageFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFlightsActionPerformed
        // TODO add your handling code here:
   int selectedRow = tblSearchRestaurant.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            UserAccount ua = (UserAccount)tblSearchRestaurant.getValueAt(selectedRow, 2);
            UpdateUserJPanel panel = new UpdateUserJPanel(userProcessContainer,ua,"RestaurantAdmin");
            userProcessContainer.add("UpdateManagerJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnManageFlightsActionPerformed

    private void txtSearchRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchRestaurantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchRestaurantActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
           Enterprise result = ecosystem.getEnterpriseDirectory().searchEnterprise(txtSearchRestaurant.getText());
        Organization organization1=result.getRestaurantDirectory().searchOrganization("RestaurantAdmin") ;
        if (result == null) {
            JOptionPane.showMessageDialog(null, "Restaurant entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel dtm = (DefaultTableModel) tblSearchRestaurant.getModel();
            dtm.setRowCount(0);
        }
        else{
            DefaultTableModel dtm = (DefaultTableModel) tblSearchRestaurant.getModel();
            dtm.setRowCount(0);
  for(UserAccount userAccount:organization1.getUserAccountDirectory().getUserAccountList()) 
  {
            Object row[] = new Object[3];
            row[0] = result.getName();
            row[1] = userAccount.getEmployee().getName();
            
            row[2] = userAccount;
           
            dtm.addRow(row);
  }
      }
      
    }//GEN-LAST:event_btnSearchActionPerformed

    private void DeleteManagersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteManagersBtnActionPerformed
        // TODO add your handling code here:
           int selectedRow = tblSearchRestaurant.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            UserAccount ua = (UserAccount)tblSearchRestaurant.getValueAt(selectedRow, 2);
            organization.getUserAccountDirectory().deleteUserAccount(ua);
            organization.getEmployeeDirectory().deleteEmployee(ua.getEmployee());
        JOptionPane.showMessageDialog(null, "User Account deleted successfully");
    } 
    }//GEN-LAST:event_DeleteManagersBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
               systemAdminWorkAreaJPanel.populateTree(); 
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeleteRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRestaurantActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblRestaurantsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            Enterprise e = (Enterprise)tblRestaurantsList.getValueAt(selectedRow, 2);
            ecosystem.getEnterpriseDirectory().deleteEnterprise(e);
        JOptionPane.showMessageDialog(null, "Restaurant deleted successfully");
        populateTable();
    } 
        
    }//GEN-LAST:event_DeleteRestaurantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteManagersBtn;
    private javax.swing.JButton DeleteRestaurant;
    private javax.swing.JButton btnManageFlights;
    private javax.swing.JButton btnNewRestaurant;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateRestaurant;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRestaurantsList;
    private javax.swing.JTable tblSearchRestaurant;
    private javax.swing.JTextField txtSearchRestaurant;
    // End of variables declaration//GEN-END:variables
}