/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VitalsPackage;

import EncounterPackage.EncounterHistory;
import PersonPackage.Person;
import java.util.ArrayList;

/**
 *
 * @author Rohit Paul G
 */
public class VitalSignsHistory {
    
    private ArrayList<VitalSigns> vitalslist;

    public VitalSignsHistory() {
        vitalslist = new ArrayList<>();  
    }

    public ArrayList<VitalSigns> getVitalslist() {
        return vitalslist;
    }

    public void setVitalslist(ArrayList<VitalSigns> vitalslist) {
        this.vitalslist = vitalslist;
    }
    
    public VitalSigns addNewVitalSigns(EncounterHistory encounterHistory, Person person, String diagnosis, String temperature, String bloodPressure, String medicines){
        VitalSigns vsigns = new VitalSigns(encounterHistory, person, diagnosis, temperature, bloodPressure, medicines);
        vitalslist.add(vsigns);
        return vsigns;
    }
    
    
    
}
