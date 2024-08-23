/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalassignemnt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditProfile extends javax.swing.JFrame {
    public EditProfile() {
        initComponents();
        setLocationRelativeTo(null);
        CustomerEdit.verifyECustomer();
        try{
            String [] colname = {"Username","Password","Email","Phone","Birthday","Address"};
            DefaultTableModel model = new DefaultTableModel(colname,0);
            edittable.setModel(model);
            ArrayList <String> allRec = CustomerEdit.getAllRec();
            String [] tableLines = allRec.toArray(new String[0]);
            for (int i=0; i<allRec.size();i++){
                CustomerEdit d = CustomerEdit.findUser(tableLines[i]);
                if(tableLines[i].equals(d.getUsername())){
                    String username= d.getUsername();
                    String password = d.getPassword();
                    String email = d.getEmail();
                    String phone = d.getPhone();
                    String birth = d.getBirth();
                    String address = d.getAddress();
                    String[] dataRow = {username,password,email,phone,birth,address};
                    model.addRow(dataRow);
                }

            }
        }
        catch (Exception ex){
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mailtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        birthtxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edittable = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mailtxt.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel1.setText("Username");

        phonetxt.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        birthtxt.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        addresstxt.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        confirm.setBackground(new java.awt.Color(153, 255, 153));
        confirm.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel5.setText("Birth");

        jLabel6.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel6.setText("Address");

        usertxt.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        passtxt.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        edittable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Email", "Phone", "Birth", "Address"
            }
        ));
        edittable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                edittableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(edittable);

        back.setBackground(new java.awt.Color(153, 255, 153));
        back.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 255, 153));
        jLabel7.setFont(new java.awt.Font("BN Machine", 0, 36)); // NOI18N
        jLabel7.setText("Edit Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(phonetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(mailtxt))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(addresstxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passtxt)
                                    .addComponent(usertxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirm))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel7)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(birthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        int i = edittable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)edittable.getModel();
        String oldusername = model.getValueAt(i, 0).toString();
        String username = usertxt.getText();
        String password = passtxt.getText();
        String Email = mailtxt.getText();
        String Phone = phonetxt.getText();
        String Birth = birthtxt.getText();
        String Address = addresstxt.getText();  
        CustomerEdit reg = new CustomerEdit(username,password,Email,Phone,Birth,Address);
            CustomerEdit.allRec.remove(CustomerEdit.findUser(oldusername));
            CustomerEdit.allRec.add(reg);
            reg.writeCustomer();
            JOptionPane.showMessageDialog(null, "Register Successful");
            setVisible(false);
            dispose();
//        if(i>= 0){
//            model.setValueAt(usertxt.getText(), i, 0);
//            model.setValueAt(passtxt.getText(), i, 1);
//            model.setValueAt(mailtxt.getText(), i, 2);
//            model.setValueAt(phonetxt.getText(), i, 3);
//            model.setValueAt(birthtxt.getText(), i, 4);
//            model.setValueAt(addresstxt.getText(), i, 5); 
    }//GEN-LAST:event_confirmActionPerformed

    private void edittableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edittableMouseReleased
        int selectedRow = edittable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)edittable.getModel();
        usertxt.setText(model.getValueAt(selectedRow, 0).toString());
        passtxt.setText(model.getValueAt(selectedRow, 1).toString());
        mailtxt.setText(model.getValueAt(selectedRow, 2).toString());
        phonetxt.setText(model.getValueAt(selectedRow, 3).toString());
        birthtxt.setText(model.getValueAt(selectedRow, 4).toString());
        addresstxt.setText(model.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_edittableMouseReleased

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HomePageCustomer().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    
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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton back;
    private javax.swing.JTextField birthtxt;
    private javax.swing.JButton confirm;
    private javax.swing.JTable edittable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mailtxt;
    private javax.swing.JTextField passtxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
