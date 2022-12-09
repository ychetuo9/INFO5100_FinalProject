/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.CityDao;
import dao.EnterpriseDao;
import dao.UserDao;
import java.util.ArrayList;
import java.util.Iterator;
import model.City;
import model.Enterprise;
import model.User;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import javax.swing.event.MouseInputListener;

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

import map.*;
import util.*;

/**
 *
 * @author yanyanchen
 */
public class SugnUp extends javax.swing.JFrame {
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern="^[0-9]*$"; 
    public String namePattern="^\\w+$";
    
    /**
     * Creates new form SugnUp
     */
    public SugnUp() {
        initComponents();
        lblHint.setVisible(false);
        lblRight.setVisible(false);
        lblRight1.setVisible(false);
        lblWrongHint.setVisible(false);
    }
    
    public void validateFields(){
        String name=txtName.getText();
        String email=txtEmail.getText();
        String mobileNumber=txtMobileNumber.getText();
        String password=txtPassword.getText();
        String city=(String)cbbCity.getSelectedItem();
        String organization=(String)cbbOrganization.getSelectedItem();
        String carrier=(String)cbbCarrier.getSelectedItem();
        String location=txtLocation.getText();
        if(name.matches(namePattern)&&!name.equals("")&&!email.equals("")&&!mobileNumber.equals("")&&!city.equals("")&&!organization.equals("")&&!carrier.equals("")&&!location.equals("")&& email.matches(emailPattern) && mobileNumber.matches(mobileNumberPattern)&& mobileNumber.length()==10 && !password.equals(""))
            lblHint.setVisible(true);
        else
            lblHint.setVisible(false);
    }
    
    public void clear(){
        txtName.setText("");
        txtEmail.setText("");
        txtMobileNumber.setText("");
        txtPassword.setText("");
        lblHint.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cbbOrganization = new javax.swing.JComboBox<>();
        cbbCarrier = new javax.swing.JComboBox<>();
        txtMobileNumber = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbbCity = new javax.swing.JComboBox<>();
        lblRight = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        cbbRole = new javax.swing.JComboBox<>();
        lblRight1 = new javax.swing.JLabel();
        lblWrongHint = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblHint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Organization Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("City");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Enterprise");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, 30));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Carrier");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("MobileNumber");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Location");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 280, -1));

        txtEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 280, -1));

        cbbOrganization.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cbbOrganization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbbOrganization.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbOrganizationItemStateChanged(evt);
            }
        });
        getContentPane().add(cbbOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 280, -1));

        cbbCarrier.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cbbCarrier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AT&T", "Verizon", "T-Mobile" }));
        cbbCarrier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbCarrierItemStateChanged(evt);
            }
        });
        getContentPane().add(cbbCarrier, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 280, -1));

        txtMobileNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 280, -1));

        txtLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocationKeyReleased(evt);
            }
        });
        getContentPane().add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 280, -1));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setText("Set Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, -1, -1));

        cbbCity.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cbbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbbCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbCityItemStateChanged(evt);
            }
        });
        getContentPane().add(cbbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 280, -1));

        lblRight.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right.png"))); // NOI18N
        getContentPane().add(lblRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 280, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Role");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        cbbRole.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cbbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Car Admin", "Hospital Admin", "Hotel Head", "Vaccinate Head", "Driver", "Doctor", "Community Head" }));
        cbbRole.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbRoleItemStateChanged(evt);
            }
        });
        getContentPane().add(cbbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 280, -1));

        lblRight1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblRight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right.png"))); // NOI18N
        lblRight1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lblRight1ComponentShown(evt);
            }
        });
        getContentPane().add(lblRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        lblWrongHint.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblWrongHint.setText("Your input should consist of numbers, letters or underscores ");
        getContentPane().add(lblWrongHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, -1, 20));

        btnSignUp.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 610, 280, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1152, 25, -1, -1));

        lblHint.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblHint.setText("You are all set !!!");
        getContentPane().add(lblHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 670, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
        String email=txtEmail.getText();
        if(email.matches(emailPattern)){
            lblRight.setVisible(true);
        }else{
            lblRight.setVisible(false);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();
        String name=txtName.getText();
        if(!name.matches(namePattern)){
            lblWrongHint.setVisible(true);
            lblRight1.setVisible(false);
        }else{
            lblWrongHint.setVisible(false);
            lblRight1.setVisible(true);
        }
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtMobileNumberKeyReleased

    private void txtLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtLocationKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ArrayList<Enterprise> enterpriseList = EnterpriseDao.getAllRecords();
        Iterator<Enterprise> itrEnterprise = enterpriseList.iterator();
        while(itrEnterprise.hasNext()){
            Enterprise enterpriseObj = itrEnterprise.next();
            cbbOrganization.addItem(enterpriseObj.getName());
        }
        
        ArrayList<City> cityList = CityDao.getAllRecords();
        Iterator<City> itrCity = cityList.iterator();
        while(itrCity.hasNext()){
            City cityObj = itrCity.next();
            cbbCity.addItem(cityObj.getName());
        }
    }//GEN-LAST:event_formComponentShown

    private void lblRight1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblRight1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRight1ComponentShown

    private void cbbCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbCityItemStateChanged
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_cbbCityItemStateChanged

    private void cbbOrganizationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbOrganizationItemStateChanged
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_cbbOrganizationItemStateChanged

    private void cbbRoleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbRoleItemStateChanged
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_cbbRoleItemStateChanged

    private void cbbCarrierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbCarrierItemStateChanged
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_cbbCarrierItemStateChanged

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        User user = new User();
        user.setName(txtName.getText());
        user.setEmail(txtEmail.getText());
        user.setPassword(txtPassword.getText());
        user.setCity(cbbCity.getSelectedItem().toString());
        user.setOrganization(cbbOrganization.getSelectedItem().toString());
        user.setRole(cbbRole.getSelectedItem().toString()); 
        user.setCarrier(cbbCarrier.getSelectedItem().toString());
        user.setMobileNumber(txtMobileNumber.getText());
        user.setLocation(txtLocation.getText());
        
        UserDao.save(user);
        setVisible(false);
        new SugnUp().setVisible(true);
        GmailUtil.sendEMail("thea.xiaoya@gmail.com","sznrtvyqbnaookum"
                ,user.getEmail(),"Congratulations! Your registration in the Infectious Disease Control System has been successful. The System Admin will verify your account later.","Notification of successful registration");
        
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login in=new Login();
        in.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1G4QUT3RPDBJ1TFBPZ7IT5G91LF01P391VE36M8YIJT021UVPOMGMWAPNHM14R").build();
        Engine engine = Engine.newInstance(options);
        Browser browser = engine.newBrowser();

        SwingUtilities.invokeLater(() -> {
            // Creating Swing component for rendering web content
            // loaded in the given Browser instance.
            BrowserView view = BrowserView.newInstance(browser);

            // Creating and displaying Swing app frame.
            JFrame frame = new JFrame("Hello World");
            // Close Engine and onClose app window
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    engine.close();
                }
            });
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            JTextField addressBar = new JTextField("file:///C://Users//oooo//Documents//GitHub//INFO5100_FinalProject//map4.html");
            addressBar.addActionListener(e ->
                    browser.navigation().loadUrl(addressBar.getText()));
            frame.add(addressBar, BorderLayout.NORTH);
            frame.add(view, BorderLayout.CENTER);
            frame.setSize(800, 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            browser.navigation().loadUrl(addressBar.getText());
           });
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> cbbCarrier;
    private javax.swing.JComboBox<String> cbbCity;
    private javax.swing.JComboBox<String> cbbOrganization;
    private javax.swing.JComboBox<String> cbbRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblRight;
    private javax.swing.JLabel lblRight1;
    private javax.swing.JLabel lblWrongHint;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
