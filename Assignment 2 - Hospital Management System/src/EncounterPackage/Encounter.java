/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncounterPackage;

import PatientPackage.Patient;
import PersonPackage.Person;

/**
 *
 * @author Rohit Paul G
 */
public class Encounter extends Patient {
        
    //private Person person;
    private String patientId;
    private String listOfDoctors;
    private String bloodType;
    private String admitDate;
    private String symptoms;

    //public Encounter(Person person, String patientId, String listOfDoctors, String bloodType, String admitDate, String symptoms) {
      //  this.person = person;
        //this.patientId = patientId;
        //this.listOfDoctors = listOfDoctors;
        //this.bloodType = bloodType;
        //this.admitDate = admitDate;
        //this.symptoms = symptoms;
    //}

    //public Person getPerson() {
      //  return person;
    //}

    //public void setPerson(Person person) {
      //  this.person = person;
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
