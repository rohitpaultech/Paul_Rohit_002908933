/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VitalsPackage;

import EncounterPackage.EncounterHistory;
import PatientPackage.Patient;
import PersonPackage.Person;

/**
 *
 * @author Rohit Paul G
 */
public class VitalSigns extends Patient {
    
    private EncounterHistory encounterHistory;
    private Person person;
    private String diagnosis;
    private String temperature;
    private String bloodPressure;
    private String medicines;

    //public VitalSigns(EncounterHistory encounterHistory, Person person, String diagnosis, String temperature, String bloodPressure, String medicines) {
      //  this.encounterHistory = encounterHistory;
        //this.person = person;
        //this.diagnosis = diagnosis;
        //this.temperature = temperature;
        //this.bloodPressure = bloodPressure;
        //this.medicines = medicines;
    //}

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }
    
    
    
}
