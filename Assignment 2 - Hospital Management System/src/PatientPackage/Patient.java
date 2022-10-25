/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatientPackage;


import PersonPackage.Person;


/**
 *
 * @author Rohit Paul G
 */
public class Patient extends Person {
    
    private String patientId;
    private String listOfDoctors;
    private String bloodType;
    private String admitDate;
    private String symptoms;
    
    //private EncounterHistory encounterHistory;
    //private Person person;

    //public Patient(EncounterHistory encounterHistory) {
       // this.patientID = patientID;
        //this.person = person;
        //this.encounterHistory = encounterHistory;
        //this.listOfDoctors = listOfDoctors;
        //this.bloodType = bloodType;
        //this.admitDate = admitDate;
        //this.symptoms = symptoms;
        
    //}

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(String listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    

    

    

    
    
    


   
    
    
    
    
    
}
