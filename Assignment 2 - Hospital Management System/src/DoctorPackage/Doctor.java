/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoctorPackage;

//import EncounterPackage.EncounterHistory;
import PersonPackage.Person;

/**
 *
 * @author Rohit Paul G
 */
public class Doctor extends Person {
    
    //private EncounterHistory encounterHistory;
    private String diagnosis;
    private String medicines;

    //public Doctor(EncounterHistory encounterHistory) {
      //  this.encounterHistory = encounterHistory;
    //}

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    
    
    
    
}
