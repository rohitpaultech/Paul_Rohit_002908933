/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatientPackage;

import EncounterPackage.EncounterHistory;
import java.util.ArrayList;

/**
 *
 * @author Rohit Paul G
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientlist;

    public PatientDirectory() {
        
        patientlist = new ArrayList<>();
        
    }

    public ArrayList<Patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }
    
    public void addNewPatient(Patient patient){ // (Patient patient)
        
        patientlist.add(patient); //patientlist.add(patient)
        
    }
    
    
    
}
