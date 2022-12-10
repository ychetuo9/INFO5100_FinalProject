/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.CommunityRequestDao;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import map.SwingWaypoint;
import map.SwingWaypointOverlayPainter;
import model.Request;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.cache.FileBasedLocalCache;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.PanKeyListener;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;
/**
 *
 * @author yanyanchen
 */
public class HotelHeadWrokArea extends javax.swing.JFrame {

    /**
     * Creates new form HotelHeadWrokArea
     */
    public HotelHeadWrokArea(String name) {
        initComponents();
        lblUsername.setText(name);
        btnAccept.setEnabled(false);
            btnReject.setEnabled(false);
            btnProcess.setEnabled(false);
            btnComplete.setEnabled(false);
    }
    
    public void validateFields(){
        String name = lblName.getText();
        
//        &&!date.equals("--")&&!patientNumber.equals("--")&&!victim.equals("--")&&!location.equals("--")&&!descriiption.equals("--")
        if(!name.equals("--")){
            btnAccept.setEnabled(true);
            btnReject.setEnabled(true);
            btnProcess.setEnabled(true);
            btnComplete.setEnabled(true);
        }else{
            btnAccept.setEnabled(false);
            btnReject.setEnabled(false);
            btnProcess.setEnabled(false);
            btnComplete.setEnabled(false);
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        lblRequestObject = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        lblVictim = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lblPatientNumber = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Name", "Patient Num", "Victim", "Location", "Description", "Request Object", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, 1296, 238));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Hotel Head Work Area");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 15, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Hello,");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 15, -1, -1));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setText("--");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 15, -1, -1));

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, -1, -1));

        lblRequestObject.setText("--");
        getContentPane().add(lblRequestObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 540, -1, -1));

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, -1, -1));

        lblVictim.setText("--");
        getContentPane().add(lblVictim, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Location");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Patient Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, -1));

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        getContentPane().add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, -1, -1));

        lblId.setText("--");
        lblId.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblIdPropertyChange(evt);
            }
        });
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        lblName.setText("--");
        lblName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblNamePropertyChange(evt);
            }
        });
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("# of Potentially infected");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        lblDescription.setText("--");
        getContentPane().add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 500, -1, -1));

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 600, -1, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setText("Date");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        lblPatientNumber.setText("--");
        getContentPane().add(lblPatientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

        lblDate.setText("--");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, -1));

        jLabel11.setText("Request Log ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel13.setText("Description");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Current Request Object");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        lblLocation.setText("--");
        getContentPane().add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, -1, -1));

        jButton2.setText("View in map");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String id =model.getValueAt(index,0).toString();
        lblId.setText(id);
        String date = model.getValueAt(index,2).toString();
        lblDate.setText(date);
        String name = model.getValueAt(index,1).toString();
        lblName.setText(name);
        String patientNumber = model.getValueAt(index,3).toString();
        lblPatientNumber.setText(patientNumber);
        String victim = model.getValueAt(index,4).toString();
        lblVictim.setText(victim);
        String location = model.getValueAt(index,5).toString();
        lblLocation.setText(location);
        String description = model.getValueAt(index,6).toString();
        lblDescription.setText(description);
        String requestObject = model.getValueAt(index, 7).toString();
        lblRequestObject.setText(requestObject);
    }//GEN-LAST:event_jTable1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String name=lblUsername.getText();
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        ArrayList<Request> requestList = CommunityRequestDao.getAssociatedRecords(name);
        Iterator<Request> itrRequest = requestList.iterator();
        while(itrRequest.hasNext()){
            Request requestObj = itrRequest.next();
            dtm.addRow(new Object[]{requestObj.getId(),requestObj.getName(),requestObj.getDate(),requestObj.getPatientNumber(),requestObj.getVictim(),requestObj.getLocation(),requestObj.getDescription(),requestObj.getRequestObject(),requestObj.getStatus()});
        }
    }//GEN-LAST:event_formComponentShown

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("accept")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Accepted</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to accept this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"accept",name);
                setVisible(false);
                new HotelHeadWrokArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to reject this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"process",name);
                setVisible(false);
                new HotelHeadWrokArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("accept")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Accepted</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to reject this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"reject",name);
                setVisible(false);
                new HotelHeadWrokArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void lblNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblNamePropertyChange
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_lblNamePropertyChange

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to reject this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"complete",name);
                setVisible(false);
                new DriverWorkArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Do you want to exit this page ?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            this.dispose();
            Login in=new Login();
            in.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblIdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblIdPropertyChange
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_lblIdPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String location = model.getValueAt(index,5).toString();
        double latitude = Double.parseDouble(location.split(",")[0]);
        double longtitude = Double.parseDouble(location.split(",")[1]);

        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        tileFactory.setThreadPoolSize(8);

        // Setup local file cache
        File cacheDir = new File(System.getProperty("user.home") + File.separator + ".jxmapviewer2");
        tileFactory.setLocalCache(new FileBasedLocalCache(cacheDir, false));

        // Setup JXMapViewer
        JXMapViewer mapViewer = new JXMapViewer();
        mapViewer.setTileFactory(tileFactory);

        GeoPosition frankfurt = new GeoPosition((int)latitude,  7, 0, (int)longtitude, 41, 0);

        // Set the focus
        mapViewer.setZoom(10);
        mapViewer.setAddressLocation(frankfurt);

        // Add interactions
        MouseInputListener mia = new PanMouseInputListener(mapViewer);
        mapViewer.addMouseListener(mia);
        mapViewer.addMouseMotionListener(mia);
        mapViewer.addMouseListener(new CenterMapListener(mapViewer));
        mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(mapViewer));
        mapViewer.addKeyListener(new PanKeyListener(mapViewer));

        // Create waypoints from the geo-positions
        Set<SwingWaypoint> waypoints = new HashSet<SwingWaypoint>(Arrays.asList(
            new SwingWaypoint("Request", frankfurt)));

    // Set the overlay painter
    WaypointPainter<SwingWaypoint> swingWaypointPainter = new SwingWaypointOverlayPainter();
    swingWaypointPainter.setWaypoints(waypoints);
    mapViewer.setOverlayPainter(swingWaypointPainter);

    // Add the JButtons to the map viewer
    for (SwingWaypoint w : waypoints) {
        mapViewer.add(w.getButton());
        }

        // Display the viewer in a JFrame
        JFrame frame = new JFrame("Current Request");
        frame.getContentPane().add(mapViewer);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientNumber;
    private javax.swing.JLabel lblRequestObject;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVictim;
    // End of variables declaration//GEN-END:variables
}
