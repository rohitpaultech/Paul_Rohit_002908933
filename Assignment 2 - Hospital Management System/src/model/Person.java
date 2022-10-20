/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rohit Paul G
 */
public class Person {
    
    private int prsnId;
    private String fName;
    private String lName;
    private int age;
    private String sex;
    private String usrRoles;
    private long mobilePhn;
    private String emailId;
    private String date;
    private String userName;
    private String passWord;

    public Person(int prsnId, String fName, String lName, int age, String sex, String usrRoles, long mobilePhn, String emailId, String date, String userName, String passWord) {
        this.prsnId = prsnId;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.sex = sex;
        this.usrRoles = usrRoles;
        this.mobilePhn = mobilePhn;
        this.emailId = emailId;
        this.date = date;
        this.userName = userName;
        this.passWord = passWord;
    }

    public int getPrsnId() {
        return prsnId;
    }

    public void setPrsnId(int prsnId) {
        this.prsnId = prsnId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsrRoles() {
        return usrRoles;
    }

    public void setUsrRoles(String usrRoles) {
        this.usrRoles = usrRoles;
    }

    public long getMobilePhn() {
        return mobilePhn;
    }

    public void setMobilePhn(long mobilePhn) {
        this.mobilePhn = mobilePhn;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

     
    
}


   