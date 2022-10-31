/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncounterPackage;

//import PersonPackage.Person;
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
    
    public void addNewEncounter(Encounter encounter){
        //Encounter enc = new Encounter();
        encounterList.add(encounter);
        //return enc;
    }
    

        
    
    
    
}
