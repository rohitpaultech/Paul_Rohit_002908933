/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoctorPackage;

import EncounterPackage.EncounterHistory;
import java.util.ArrayList;



/**
 *
 * @author Rohit Paul G
 */
public class DoctorDirectory {
    
    private static ArrayList<Doctor> doctorList = new ArrayList<>();

    

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public void addNewDoctor(Doctor doctor){ // (Patient patient)
        
        doctorList.add(doctor); //patientlist.add(patient)
        
    }
    
    public void deleteDoc(Doctor doc){
        
        //history.remove(hr);
        //patientlist.remove(pat);
        doctorList.remove(doc);
        
    }

    
    
    
    
}
