/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncounterPackage;

//import PatientPackage.Patient;
//import PersonPackage.Person;
import VitalsPackage.VitalSigns;

/**
 *
 * @author Rohit Paul G
 */
public class Encounter extends VitalSigns {
        
    //private Person person;
    private String encounterId;
    private String encounterTime;

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

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getEncounterTime() {
        return encounterTime;
    }

    public void setEncounterTime(String encounterTime) {
        this.encounterTime = encounterTime;
    }

    
    
    
    
}
