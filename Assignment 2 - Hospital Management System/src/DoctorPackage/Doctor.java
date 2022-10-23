/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoctorPackage;

import EncounterPackage.EncounterHistory;

/**
 *
 * @author Rohit Paul G
 */
public class Doctor {
    
    private EncounterHistory encounterHistory;

    public Doctor(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    
    
}
