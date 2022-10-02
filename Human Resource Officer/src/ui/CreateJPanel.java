/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.HumanResources;
import model.HumanResourcesHistory;
import java.util.regex.*;

/**
 *
 * @author Rohit Paul G
 */
public class CreateJPanel extends javax.swing.JPanel {

    HumanResourcesHistory history;
    String getSelectedImage;
    String imgOk;
     
    public CreateJPanel(HumanResourcesHistory history) {
        
        initComponents();
        
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGendr = new javax.swing.JLabel();
        lblStrtDate = new javax.swing.JLabel();
        lblLvl = new javax.swing.JLabel();
        lblTmInfo = new javax.swing.JLabel();
        lblPosTitle = new javax.swing.JLabel();
        lblCellPhn = new javax.swing.JLabel();
        lblEmailAdd = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGendr = new javax.swing.JTextField();
        txtStrtDate = new javax.swing.JTextField();
        txtLvl = new javax.swing.JTextField();
        txtTmInfo = new javax.swing.JTextField();
        txtPosTitle = new javax.swing.JTextField();
        txtCellPhn = new javax.swing.JTextField();
        txtEmailAdd = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        lblPhotoDisplay = new javax.swing.JLabel();
        msgLabel3 = new javax.swing.JLabel();
        msgLabel1 = new javax.swing.JLabel();
        msgLabel2 = new javax.swing.JLabel();
        msgLabel4 = new javax.swing.JLabel();
        msgLabel5 = new javax.swing.JLabel();
        msgLabel6 = new javax.swing.JLabel();
        msgLabel8 = new javax.swing.JLabel();
        msgLabel7 = new javax.swing.JLabel();
        msgLabel9 = new javax.swing.JLabel();
        msgLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("~ Employee Creation ~");

        lblName.setText("Name:");

        lblEmpId.setText("Employee ID:");

        lblAge.setText("Age:");

        lblGendr.setText("Gender:");

        lblStrtDate.setText("Start Date (MM/DD/YYYY):");

        lblLvl.setText("Level:");

        lblTmInfo.setText("Team Info:");

        lblPosTitle.setText("Position Title:");

        lblCellPhn.setText("Cell Phone Number:");

        lblEmailAdd.setText("Email Address:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyReleased(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtGendr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGendrKeyReleased(evt);
            }
        });

        txtStrtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStrtDateKeyReleased(evt);
            }
        });

        txtLvl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLvlKeyReleased(evt);
            }
        });

        txtTmInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTmInfoKeyReleased(evt);
            }
        });

        txtPosTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPosTitleKeyReleased(evt);
            }
        });

        txtCellPhn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCellPhnKeyReleased(evt);
            }
        });

        txtEmailAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailAddKeyReleased(evt);
            }
        });

        lblPhoto.setText("Photo:");

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        lblPhotoDisplay.setBackground(new java.awt.Color(255, 255, 255));
        lblPhotoDisplay.setOpaque(true);

        msgLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel3.setForeground(new java.awt.Color(255, 51, 0));

        msgLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel1.setForeground(new java.awt.Color(255, 51, 0));

        msgLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel2.setForeground(new java.awt.Color(255, 51, 0));

        msgLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel4.setForeground(new java.awt.Color(255, 51, 0));

        msgLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel5.setForeground(new java.awt.Color(255, 51, 0));

        msgLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel6.setForeground(new java.awt.Color(255, 51, 0));

        msgLabel8.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel8.setForeground(new java.awt.Color(255, 51, 0));

        msgLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel7.setForeground(new java.awt.Color(255, 51, 0));

        msgLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel9.setForeground(new java.awt.Color(255, 51, 0));

        msgLabel10.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel10.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmailAdd)
                            .addComponent(lblAge)
                            .addComponent(lblEmpId)
                            .addComponent(lblName)
                            .addComponent(lblGendr)
                            .addComponent(lblStrtDate)
                            .addComponent(lblLvl)
                            .addComponent(lblTmInfo)
                            .addComponent(lblPosTitle)
                            .addComponent(lblCellPhn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtEmpId)
                            .addComponent(txtAge)
                            .addComponent(txtGendr)
                            .addComponent(txtStrtDate)
                            .addComponent(txtLvl)
                            .addComponent(txtTmInfo)
                            .addComponent(txtPosTitle)
                            .addComponent(txtCellPhn)
                            .addComponent(txtEmailAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(msgLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(msgLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(msgLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(msgLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(msgLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(47, 47, 47)))
                                .addComponent(lblPhotoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(msgLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(msgLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(msgLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPhoto)
                                .addGap(44, 44, 44)
                                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(msgLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(msgLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 268, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnSave)))
                .addGap(260, 260, 260))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPhoto)
                        .addComponent(btnBrowse)
                        .addComponent(msgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpId)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGendr)
                            .addComponent(txtGendr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msgLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStrtDate)
                            .addComponent(txtStrtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msgLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLvl)
                            .addComponent(txtLvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msgLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTmInfo)
                            .addComponent(txtTmInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msgLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosTitle)
                            .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msgLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPhotoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellPhn)
                    .addComponent(txtCellPhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAdd)
                    .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        String name = txtName.getText();
        String empId = txtEmpId.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gendr = txtGendr.getText();
        String strtDate = txtStrtDate.getText();
        String lvl = txtLvl.getText();
        String tmInfo = txtTmInfo.getText();
        String posTitle = txtPosTitle.getText();
        long cellPhn = Long.parseLong(txtCellPhn.getText());
        String emailAdd = txtEmailAdd.getText();
        String photo = getSelectedImage;

        HumanResources hr = history.addNewHREmp();
        
        hr.setName(name);
        hr.setEmpId(empId);
        hr.setAge(age);
        hr.setGendr(gendr);
        hr.setStrtDate(strtDate);
        hr.setLvl(lvl);
        hr.setTmInfo(tmInfo);
        hr.setPosTitle(posTitle);
        hr.setCellPhn(cellPhn);
        hr.setEmailAdd(emailAdd);
        hr.setPhoto(photo);
       
        
        JOptionPane.showMessageDialog(this, "New Employee Added!");
        
        txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        txtGendr.setText("");
        txtStrtDate.setText("");
        txtLvl.setText("");
        txtTmInfo.setText("");
        txtPosTitle.setText("");
        txtCellPhn.setText("");
        txtEmailAdd.setText("");
        ImageIcon img = new ImageIcon();
        lblPhotoDisplay.setIcon(img);
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
                          
        
        //below is code for getting browse button to display directories of files and images in the computer
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Some extensions Supported",".jpg",".png",".jpeg",".gif");
        fileChooser.setFileFilter(filter);
        int selected = fileChooser.showOpenDialog(this);
        if (selected == JFileChooser.APPROVE_OPTION){
            
            File file = fileChooser.getSelectedFile();
            getSelectedImage = file.getAbsolutePath();
            
            JOptionPane.showMessageDialog(null, "Are you sure with this Photo?");  
            
            //below lines 280 to 283 code is for displaying the image in the jPanel in the correct size as per the size of the jLabel
            ImageIcon img = new ImageIcon(getSelectedImage);
            Image imgSizing = img.getImage();
            Image imgOk = imgSizing.getScaledInstance(lblPhotoDisplay.getWidth(), lblPhotoDisplay.getHeight(), Image.SCALE_SMOOTH);
            
            lblPhotoDisplay.setIcon(new ImageIcon(imgOk));
        }
        
        
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // My data validation code for name field:
        String convention = "^[a-z A-Z]{0,30}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtName.getText());
        if(!match.matches()){
            msgLabel1.setText("Name is invalid!");
        }
        else {
            msgLabel1.setText(null);
        }
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmpIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyReleased
        // my data validation code for employee id field:
        String convention = "^[0-9]{0,20}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtEmpId.getText());
        if(!match.matches()){
            msgLabel2.setText("ID is invalid!");
        }
        else {
            msgLabel2.setText(null);
        }
    }//GEN-LAST:event_txtEmpIdKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // my data validation code for employee id field:
        String convention = "^[0-9]{0,2}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtAge.getText());
        if(!match.matches()){
            msgLabel3.setText("Enter a valid age.");
        }
        else {
            msgLabel3.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtGendrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGendrKeyReleased
        // my data validation code for gender field:
        String convention = "^[a-z A-Z]{0,15}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtGendr.getText());
        if(!match.matches()){
            msgLabel4.setText("Specify a valid gender.");
        }
        else {
            msgLabel4.setText(null);
        }
    }//GEN-LAST:event_txtGendrKeyReleased

    private void txtStrtDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStrtDateKeyReleased
        // my data validation code for start date field:
        String convention = "^[0-9]{0,2}/[0-9]{0,2}/[0-9]{0,4}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtStrtDate.getText());
        if(!match.matches()){
            msgLabel5.setText("Input a valid date.");
        }
        else {
            msgLabel5.setText(null);
        }
    }//GEN-LAST:event_txtStrtDateKeyReleased

    private void txtLvlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLvlKeyReleased
        // my data validation code for level field:
        String convention = "^[a-zA-Z0-9]{0,15}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtLvl.getText());
        if(!match.matches()){
            msgLabel6.setText("Input a valid level.");
        }
        else {
            msgLabel6.setText(null);
        }
    }//GEN-LAST:event_txtLvlKeyReleased

    private void txtTmInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTmInfoKeyReleased
        // my data validation code for team info field:
        String convention = "^[a-z A-Z]{0,30}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtTmInfo.getText());
        if(!match.matches()){
            msgLabel7.setText("Enter only valid information.");
        }
        else {
            msgLabel7.setText(null);
        }
    }//GEN-LAST:event_txtTmInfoKeyReleased

    private void txtPosTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPosTitleKeyReleased
        // my data validation code for position title field:
        String convention = "^[a-zA-Z]{0,30}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtPosTitle.getText());
        if(!match.matches()){
            msgLabel8.setText("Invalid Title!");
        }
        else {
            msgLabel8.setText(null);
        }
    }//GEN-LAST:event_txtPosTitleKeyReleased

    private void txtCellPhnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellPhnKeyReleased
        // my data validation code for cellphone number field:
        String convention = "^[0-9]{0,12}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtCellPhn.getText());
        if(!match.matches()){
            msgLabel9.setText("Please enter valid number.");
        }
        else {
            msgLabel9.setText(null);
        }
    }//GEN-LAST:event_txtCellPhnKeyReleased

    private void txtEmailAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAddKeyReleased
        // my data validation code for email field:
        String convention = "^[a-z.A-Z.0-9]{0,50}@[a-z]{0,50}.[a-z]{0,5}$";
        Pattern ptt = Pattern.compile(convention);
        Matcher match = ptt.matcher(txtEmailAdd.getText());
        if(!match.matches()){
            msgLabel10.setText("Please enter valid email.");
        }
        else {
            msgLabel10.setText(null);
        }
    }//GEN-LAST:event_txtEmailAddKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhn;
    private javax.swing.JLabel lblEmailAdd;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGendr;
    private javax.swing.JLabel lblLvl;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    public javax.swing.JLabel lblPhotoDisplay;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblStrtDate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTmInfo;
    private javax.swing.JLabel msgLabel1;
    private javax.swing.JLabel msgLabel10;
    private javax.swing.JLabel msgLabel2;
    private javax.swing.JLabel msgLabel3;
    private javax.swing.JLabel msgLabel4;
    private javax.swing.JLabel msgLabel5;
    private javax.swing.JLabel msgLabel6;
    private javax.swing.JLabel msgLabel7;
    private javax.swing.JLabel msgLabel8;
    private javax.swing.JLabel msgLabel9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhn;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtGendr;
    private javax.swing.JTextField txtLvl;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtStrtDate;
    private javax.swing.JTextField txtTmInfo;
    // End of variables declaration//GEN-END:variables
}
