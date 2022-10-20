/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rohit Paul G
 */
public class Patient {
    
    private int prsnId;  //will be patient ID in viewjpanel as text but prsnId as variable name
    private String fName;
    private String lName;
    private int age;
    private String sex;
    private String bloodType;
    private long mobilePhn;
    private String emailId;
    private String date;
    private String symptom; //for when patient creates an encounter, this will be an attribute
    private String doctrName; //for when patient creates an encounter, this will be an attribute in jtable for doctor
    private String communtyName;
    private String hsptalName;
    
}
