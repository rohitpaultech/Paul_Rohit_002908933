/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import DoctorPackage.Doctor;
import DoctorPackage.DoctorDirectory;
import EncounterPackage.EncounterHistory;
import PatientPackage.Patient;
import PatientPackage.PatientDirectory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static ui.LoginJFrame.doc;

/**
 *
 * @author Rohit Paul G
 */
public class RegistrationJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationJFrame
     */
    
    public static DoctorDirectory docDr = new DoctorDirectory();
    public static PatientDirectory patDr = new PatientDirectory();
    
    
    // the file path -> C:\Users\1BestCsharp\Desktop\java_app
    //String usersFilePath = "C:\\Users\\Rohit Paul G\\OneDrive\\Desktop\\userdata.txt";   
    //array of all usernames
    //ArrayList<String> all_usernames = new ArrayList<>();
    //a hashmap of usernames and password
    //static Map<String, String> usernameANDpassword = new HashMap<>();
    
    public RegistrationJFrame() {
        initComponents();
        
    }
    
    //creating a function to get all users
    //public void getUsers(){
        
        //info structure will look like this:
        /*
        username: aaa
        fullname: bbb ccc
        email: asfasf@xg.com
        password: pass@smalf
        */
        //doing the registration first
        
        
        
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblHideWindow = new javax.swing.JLabel();
        lblCloseWindow = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbluserName = new javax.swing.JLabel();
        lblpassWord = new javax.swing.JLabel();
        txtuserName = new javax.swing.JTextField();
        pwdpassWord = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        lblfName = new javax.swing.JLabel();
        txtfName = new javax.swing.JTextField();
        lbllName = new javax.swing.JLabel();
        txtlName = new javax.swing.JTextField();
        lblage = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        lbldateOfBirth = new javax.swing.JLabel();
        jDateChooserdateOfBirth = new com.toedter.calendar.JDateChooser();
        lblheight = new javax.swing.JLabel();
        txtheight = new javax.swing.JTextField();
        lblweight = new javax.swing.JLabel();
        txtweight = new javax.swing.JTextField();
        lblmobilePhn = new javax.swing.JLabel();
        txtmobilePhn = new javax.swing.JTextField();
        lblroles = new javax.swing.JLabel();
        jComboBoxroles = new javax.swing.JComboBox<>();
        lblhospital = new javax.swing.JLabel();
        jComboBoxroleshospital = new javax.swing.JComboBox<>();
        lblcity = new javax.swing.JLabel();
        jComboBoxcity = new javax.swing.JComboBox<>();
        lblcommunity = new javax.swing.JLabel();
        txtcommunity = new javax.swing.JTextField();
        lblhouseAddress = new javax.swing.JLabel();
        txthouseAddress = new javax.swing.JTextField();
        lblbackToSignIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(205, 209, 228));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 3, 26)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("~ Cristo es Dios General Hospital  ~");

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Resgistration");

        lblHideWindow.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHideWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHideWindow.setText("-");
        lblHideWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHideWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHideWindowMouseClicked(evt);
            }
        });

        lblCloseWindow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCloseWindow.setForeground(new java.awt.Color(255, 51, 0));
        lblCloseWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseWindow.setText("X");
        lblCloseWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCloseWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseWindowMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTitle2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHideWindow)
                .addGap(18, 18, 18)
                .addComponent(lblCloseWindow)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHideWindow)
                    .addComponent(lblCloseWindow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle2)
                .addGap(12, 12, 12))
        );

        jPanel2.setBackground(new java.awt.Color(228, 241, 254));

        lbluserName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbluserName.setText("Username:");

        lblpassWord.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblpassWord.setText("Password:");

        pwdpassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdpassWordActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(3, 201, 169));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblfName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblfName.setText("First Name:");

        lbllName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbllName.setText("Last Name:");

        lblage.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblage.setText("Age:");

        lbldateOfBirth.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbldateOfBirth.setText("Date of Birth:");

        lblheight.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblheight.setText("Height:");

        lblweight.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblweight.setText("Weight:");

        lblmobilePhn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblmobilePhn.setText("Phone:");

        lblroles.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblroles.setText("Role:");

        jComboBoxroles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "System Admin", "Hospital Admin" }));

        lblhospital.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblhospital.setText("Hospital:");

        jComboBoxroleshospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cristo Es Dios GH", "Cristo Es Dios GH subsidiary" }));

        lblcity.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblcity.setText("City:");

        jComboBoxcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Los Angeles", "New York", "San Francisco" }));

        lblcommunity.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblcommunity.setText("Community:");

        lblhouseAddress.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblhouseAddress.setText("House Address:");

        lblbackToSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbackToSignIn.setText("Click here to sign in");
        lblbackToSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblbackToSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbackToSignInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbldateOfBirth)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooserdateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbllName)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblfName)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(lblage)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblroles)
                                            .addComponent(lblmobilePhn)
                                            .addComponent(lblcity)
                                            .addComponent(lblcommunity)
                                            .addComponent(lblhouseAddress))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtmobilePhn, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                                    .addComponent(jComboBoxcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtcommunity)
                                                    .addComponent(txthouseAddress)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBoxroles, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblhospital)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxroleshospital, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblweight)
                                .addGap(18, 18, 18)
                                .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblheight)
                                .addGap(18, 18, 18)
                                .addComponent(txtheight, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpassWord)
                            .addComponent(lbluserName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuserName)
                            .addComponent(pwdpassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btnRegister))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(lblbackToSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfName)
                    .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmobilePhn)
                    .addComponent(txtmobilePhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllName)
                    .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhospital)
                    .addComponent(jComboBoxroleshospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblage)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblroles)
                    .addComponent(jComboBoxroles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbldateOfBirth)
                                    .addComponent(jDateChooserdateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblheight)
                                    .addComponent(txtheight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblcity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblcommunity)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblweight)
                            .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(lblhouseAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbluserName)
                            .addComponent(txtuserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpassWord)
                            .addComponent(pwdpassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btnRegister)
                        .addGap(18, 18, 18)
                        .addComponent(lblbackToSignIn)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBoxcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txthouseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHideWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideWindowMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblHideWindowMouseClicked

    private void lblCloseWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseWindowMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblCloseWindowMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        if (jComboBoxroles.getSelectedItem().toString().equals("Doctor")){
            //Doctor doc = new Doctor();
            
            doc.setfName(txtfName.getText());
            doc.setlName(txtlName.getText());
            doc.setAge(Integer.parseInt(txtage.getText()));
            doc.setDateOfBirth(jDateChooserdateOfBirth.getDateFormatString());
            doc.setHeight(Double.parseDouble(txtheight.getText()));
            doc.setWeight(Float.parseFloat(txtweight.getText()));
            doc.setMobilePhn(Long.parseLong(txtmobilePhn.getText()));
            doc.setRoles(jComboBoxroles.getSelectedItem().toString());
            doc.setHospital(jComboBoxroleshospital.getSelectedItem().toString());
            doc.setCity(jComboBoxcity.getSelectedItem().toString());
            doc.setCommunity(txtcommunity.getText());
            doc.setHouseAddress(txthouseAddress.getText());
            doc.setUserName(txtuserName.getText());
            doc.setPassWord(String.valueOf(pwdpassWord.getPassword()));
            docDr.addNewDoctor(doc);
            //PatientWorkAreaJFrame.txtPatientListOfDoctors.addItem(txtfName.getText());
            
        }
        else if (jComboBoxroles.getSelectedItem().toString().equals("Patient")){
            Patient pat = new Patient();

            pat.setfName(txtfName.getText());
            pat.setlName(txtlName.getText());
            pat.setAge(Integer.parseInt(txtage.getText()));
            pat.setDateOfBirth(jDateChooserdateOfBirth.getDateFormatString());
            pat.setHeight(Double.parseDouble(txtheight.getText()));
            pat.setWeight(Float.parseFloat(txtweight.getText()));
            pat.setMobilePhn(Long.parseLong(txtmobilePhn.getText()));
            pat.setRoles(jComboBoxroles.getSelectedItem().toString());
            pat.setHospital(jComboBoxroleshospital.getSelectedItem().toString());
            pat.setCity(jComboBoxcity.getSelectedItem().toString());
            pat.setCommunity(txtcommunity.getText());
            pat.setHouseAddress(txthouseAddress.getText());
            pat.setUserName(txtuserName.getText());
            pat.setPassWord(String.valueOf(pwdpassWord.getPassword()));
            patDr.addNewPatient(pat);
        }
        
        JOptionPane.showMessageDialog(this, "New entity Added!");
        
        vanishData();
        
        

// getting the text fields data:
        //String fName = txtfName.getText();
        //String lName = txtlName.getText();
        //int age = Integer.parseInt(txtage.getText());
        //SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        //String dateOfBirth = dateformat.format(jDateChooserdateOfBirth.getDate());
        //double height = Double.parseDouble(txtheight.getText());
        //float weight = Float.parseFloat(txtweight.getText());
        //long mobilePhn = Long.parseLong(txtmobilePhn.getText());
        //String roles = jComboBoxroles.getSelectedItem().toString(); //casts the object within the combobox to string
        //String hospital = jComboBoxroleshospital.getSelectedItem().toString(); //same as above
        //String city = jComboBoxcity.getSelectedItem().toString();
        //String community = txtcommunity.getText();
        //String houseAddress = txthouseAddress.getText();
        //String userName = txtuserName.getText();
        //String passWord = String.valueOf(pwdpassWord.getPassword());
        
        
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void lblbackToSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackToSignInMouseClicked
        // TODO add your handling code here:
        LoginJFrame lgf = new LoginJFrame();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lblbackToSignInMouseClicked

    private void pwdpassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdpassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdpassWordActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> jComboBoxcity;
    private javax.swing.JComboBox<String> jComboBoxroles;
    private javax.swing.JComboBox<String> jComboBoxroleshospital;
    private com.toedter.calendar.JDateChooser jDateChooserdateOfBirth;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCloseWindow;
    private javax.swing.JLabel lblHideWindow;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblbackToSignIn;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcommunity;
    private javax.swing.JLabel lbldateOfBirth;
    private javax.swing.JLabel lblfName;
    private javax.swing.JLabel lblheight;
    private javax.swing.JLabel lblhospital;
    private javax.swing.JLabel lblhouseAddress;
    private javax.swing.JLabel lbllName;
    private javax.swing.JLabel lblmobilePhn;
    private javax.swing.JLabel lblpassWord;
    private javax.swing.JLabel lblroles;
    private javax.swing.JLabel lbluserName;
    private javax.swing.JLabel lblweight;
    private javax.swing.JPasswordField pwdpassWord;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcommunity;
    private javax.swing.JTextField txtfName;
    private javax.swing.JTextField txtheight;
    private javax.swing.JTextField txthouseAddress;
    private javax.swing.JTextField txtlName;
    private javax.swing.JTextField txtmobilePhn;
    private javax.swing.JTextField txtuserName;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables

    private void vanishData() {
        txtfName.setText("");
        txtlName.setText("");
        txtage.setText("");
        jDateChooserdateOfBirth.setDateFormatString("");
        txtheight.setText("");
        txtweight.setText("");
        txtmobilePhn.setText("");
        txtcommunity.setText("");
        txthouseAddress.setText("");
        txtuserName.setText("");
        pwdpassWord.setText("");
    }
}
