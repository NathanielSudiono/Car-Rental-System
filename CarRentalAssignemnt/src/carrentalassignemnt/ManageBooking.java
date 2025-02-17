/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalassignemnt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ManageBooking extends javax.swing.JFrame {

    /**
     * Creates new form ManageBooking
     */
    public ManageBooking() {
        initComponents();
        setLocationRelativeTo(null);
        String filepath = "D:\\My APU stuff\\Year 2 APU sem 1\\assignment\\OODJ\\CarRentalAssignemnt\\CarRentalAssignemnt\\BookCar.txt";
        File f = new File(filepath);
        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            DefaultTableModel model = (DefaultTableModel)cartable.getModel();
            
            
            Object[] tableLines = br.lines().toArray();
            for(int i = 0; i< tableLines.length; i++){
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(":");
                model.addRow(dataRow);
            }
        }catch(Exception ex){
            
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
        cartable = new javax.swing.JTable();
        endday = new javax.swing.JTextField();
        startdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regnum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Reject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cartable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No", "Brand", "StartDate", "EndDate", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cartableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(cartable);

        endday.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel5.setText("Brand");

        jLabel6.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel6.setText("Price");

        jLabel2.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel2.setText("Reg No");

        price.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel3.setText("End Date");

        brand.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        jLabel4.setText("Start Date");

        regnum.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("BN Machine", 0, 36)); // NOI18N
        jLabel1.setText("Manage Booking");

        Edit.setBackground(new java.awt.Color(153, 255, 153));
        Edit.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        Edit.setText("Confirm");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(153, 255, 153));
        Back.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Reject.setBackground(new java.awt.Color(153, 255, 153));
        Reject.setFont(new java.awt.Font("BN Machine", 0, 12)); // NOI18N
        Reject.setText("Reject");
        Reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(endday, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brand)
                                    .addComponent(regnum)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(startdate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reject, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(regnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Edit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(Back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartableMouseReleased
        // TODO add your handling code here:
        int selectedRow = cartable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)cartable.getModel();
        regnum.setText(model.getValueAt(selectedRow, 0).toString());
        brand.setText(model.getValueAt(selectedRow, 1).toString());
        startdate.setText(model.getValueAt(selectedRow, 2).toString());
        endday.setText(model.getValueAt(selectedRow, 3).toString());
        price.setText(model.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_cartableMouseReleased

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        String NumCar, Brand, startDate, endDate, Price;
        NumCar = regnum.getText();
        Brand = brand.getText();
        startDate = startdate.getText();
        endDate = endday.getText();
        Price = price.getText();
        int i = cartable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)cartable.getModel();
        if(i>= 0){
            model.setValueAt(regnum.getText(), i, 0);
            model.setValueAt(brand.getText(), i, 1);
            model.setValueAt(startdate.getText(), i, 2);
            model.setValueAt(endday.getText(), i, 3);
            model.setValueAt(price.getText(), i, 4);
        BookingManage reg = new BookingManage(NumCar,Brand,startDate,endDate,Price);
        if(reg.editBooking()== true){
            JOptionPane.showMessageDialog(null, "Booking accepted");
                    setVisible(false);
                    dispose();
                    new ManageBooking().setVisible(true);
        }    
        }
        else{
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_EditActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HomePageAdmin().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void RejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel) cartable.getModel();     
        if(cartable.getSelectedRowCount()==1){
            tmodel.removeRow(cartable.getSelectedRow());
        }
        else{
            JOptionPane.showMessageDialog(this,"please select row");
        }
        String filePath = "D:\\My APU stuff\\Year 2 APU sem 1\\assignment\\OODJ\\CarRentalAssignemnt\\CarRentalAssignemnt\\BookCar.txt";
        File file = new File(filePath);
        try
        {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i=0;i<cartable.getRowCount();i++)
            {
                for(int j=0;j<cartable.getColumnCount();j++)
                {
                    bw.write(cartable.getValueAt(i,j).toString()+":");
                }
                bw.newLine(); 
            }
            JOptionPane.showMessageDialog(null, "Booking has been rejected");
            
            bw.close();
            fw.close();
        }       
        catch (IOException ex)
        {
            
        }
    }//GEN-LAST:event_RejectActionPerformed

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
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Reject;
    private javax.swing.JTextField brand;
    private javax.swing.JTable cartable;
    private javax.swing.JTextField endday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField regnum;
    private javax.swing.JTextField startdate;
    // End of variables declaration//GEN-END:variables
}
