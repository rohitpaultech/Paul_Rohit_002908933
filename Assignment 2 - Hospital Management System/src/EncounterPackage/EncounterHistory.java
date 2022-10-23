/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncounterPackage;

import PersonPackage.Person;
import java.util.ArrayList;

/**
 *
 * @author Rohit Paul G
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterList;

    public EncounterHistory() {
        encounterList = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public Encounter addNewEncounter(Person person, String patientId, String listOfDoctors, String bloodType, String admitDate, String symptoms){
        Encounter enc = new Encounter(person, patientId, listOfDoctors, bloodType, admitDate, symptoms);
        encounterList.add(enc);
        return enc;
    }
    

        
    
    
    
}
