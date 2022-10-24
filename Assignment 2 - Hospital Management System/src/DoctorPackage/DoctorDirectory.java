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
    
    private ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public Doctor addNewDoctor(){
        Doctor doc = new Doctor();
        doctorList.add(doc);
        return doc;
    }
    
    
    
    
}
