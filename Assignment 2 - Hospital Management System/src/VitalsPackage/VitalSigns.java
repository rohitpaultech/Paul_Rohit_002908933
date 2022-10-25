/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VitalsPackage;

//import EncounterPackage.EncounterHistory;
import PatientPackage.Patient;
//import PersonPackage.Person;

/**
 *
 * @author Rohit Paul G
 */
public class VitalSigns extends Patient {
    
    //private EncounterHistory encounterHistory;
    //private Person person;
    //private String diagnosis;
    private String temperature;
    private String bloodPressure;
    private int heartRate; 
    //private String medicines;

    //public VitalSigns(EncounterHistory encounterHistory, Person person, String diagnosis, String temperature, String bloodPressure, String medicines) {
      //  this.encounterHistory = encounterHistory;
        //this.person = person;
        //this.diagnosis = diagnosis;
        //this.temperature = temperature;
        //this.bloodPressure = bloodPressure;
        //this.medicines = medicines;
    //}

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

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    
    
}
