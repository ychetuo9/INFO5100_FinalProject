/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.CommunityRequestDao;
import dao.UserDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Request;
import model.User;

/**
 *
 * @author yanyanchen
 */
public class CommunityWorkArea extends javax.swing.JFrame {

    public String numberPattern="^[0-9]*$";
    
    /**
     * Creates new form CommunityWorkArea
     */
    public CommunityWorkArea() {
        initComponents();
        btnSave.setEnabled(false);
        
    }
    
    public CommunityWorkArea(String name) {
        initComponents();
        btnSave.setEnabled(false);
        lblUsername.setText(name);
        
    }
    
    public void validateFields(){
        String name = txtName.getText();
        String date=dataChooser1.getDateFormatString();
        String patientNumber=txtPatientNumber.getText();
        String victim=txtVictim.getText();
        String location=txtLocation.getText();
        String descriiption=txtDescription.getText();
        
        
        String requestObject=(String)cbbRequestObject.getSelectedItem();
        
        
        if(victim.matches(numberPattern)&&patientNumber.matches(numberPattern)&&!name.equals("")&&!date.equals("")&&!patientNumber.equals("")&&!victim.equals("")&&!location.equals("")&&!descriiption.equals("")&&!requestObject.equals(" "))
            btnSave.setEnabled(true);

        else
            btnSave.setEnabled(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPatientNumber = new javax.swing.JTextField();
        txtVictim = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbRequestObject = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        dataChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPatientNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtPatientNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPatientNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtPatientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 296, -1));

        txtVictim.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtVictim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVictimKeyReleased(evt);
            }
        });
        getContentPane().add(txtVictim, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 296, -1));

        txtLocation.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocationKeyReleased(evt);
            }
        });
        getContentPane().add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 296, -1));

        txtDescription.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyReleased(evt);
            }
        });
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 296, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Community Admin Work Area");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Patient Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("# of Potentially infected");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Location");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, -1, -1));

        cbbRequestObject.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        getContentPane().add(cbbRequestObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 296, -1));

        btnSave.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("Request Object");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date", "Patient Num", "Victim", "Location", "Description", "Request Object", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Name");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Date");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Patient Num");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Victim");
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Location");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Description");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Request Object");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Status");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1296, 140));

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton2.setText("Set Location");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Hello,");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1023, 39, -1, -1));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setText("--");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(1084, 39, -1, -1));

        dataChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataChooser1KeyReleased(evt);
            }
        });
        getContentPane().add(dataChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 300, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel17.setText("Date");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 296, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        String name = lblUsername.getText();
        int index = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String id = model.getValueAt(index,0).toString();
        int a = JOptionPane.showConfirmDialog(null,"Do you want to delete this request?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            CommunityRequestDao.delete(id);
            setVisible(false);
            new CommunityWorkArea(name).setVisible(true);
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void dataChooser1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataChooser1KeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_dataChooser1KeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPatientNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPatientNumberKeyReleased

    private void txtVictimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVictimKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtVictimKeyReleased

    private void txtLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtLocationKeyReleased

    private void txtDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtDescriptionKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = lblUsername.getText();
        Request request = new Request();
        request.setName(txtName.getText());
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(dataChooser1.getDate());
        request.setDate(date);
                
        request.setPatientNumber(txtPatientNumber.getText());
        request.setVictim(txtVictim.getText());
        request.setLocation(txtLocation.getText());
        request.setDescription(txtDescription.getText());
        request.setRequestObject(cbbRequestObject.getSelectedItem().toString());
        request.setStatus("Undone");
        
        CommunityRequestDao.saveRequest(request);
        setVisible(false);
        new CommunityWorkArea(name).setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ArrayList<User> userList = UserDao.getAllRecords();
        Iterator<User> itrUser = userList.iterator();
        while(itrUser.hasNext()){
            User userObj = itrUser.next();
            cbbRequestObject.addItem(userObj.getName());
        }
        
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        ArrayList<Request> requestList = CommunityRequestDao.getAllRecords();
        Iterator<Request> itrRequest = requestList.iterator();
        while(itrRequest.hasNext()){
            Request requestObj = itrRequest.next();
            dtm.addRow(new Object[]{requestObj.getId(),requestObj.getName(),requestObj.getDate(),requestObj.getPatientNumber(),requestObj.getVictim(),requestObj.getLocation(),requestObj.getDescription(),requestObj.getRequestObject(),requestObj.getStatus()});
        }
        
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CommunityWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CommunityWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CommunityWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CommunityWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CommunityWorkArea().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbRequestObject;
    private com.toedter.calendar.JDateChooser dataChooser1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientNumber;
    private javax.swing.JTextField txtVictim;
    // End of variables declaration//GEN-END:variables
}
