/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonPackage;

/**
 *
 * @author Rohit Paul G
 */
public class Person {
    //my person attributes
    private String fName;
    private String lName;
    private int age;
    private String dateOfBirth;
    private double height;
    private float weight;
    private String mobilePhn;
    private String roles;
    private String hospital;
    private String city;
    private String community;
    private String userName;
    private String passWord;
    private String houseAddress;
    
    
    //creating a constructor for all said attributes

    public Person(String fName, String lName, int age, String dateOfBirth, double height, float weight, String mobilePhn, String roles, String hospital, String city, String community, String userName, String passWord, String houseAddress) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.mobilePhn = mobilePhn;
        this.roles = roles;
        this.hospital = hospital;
        this.city = city;
        this.community = community;
        this.userName = userName;
        this.passWord = passWord;
        this.houseAddress = houseAddress;
    }

    

   
    //creating getters and setters for the said attributes

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getMobilePhn() {
        return mobilePhn;
    }

    public void setMobilePhn(String mobilePhn) {
        this.mobilePhn = mobilePhn;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
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

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

   

    

    
    
    
    
    
            
    
}
