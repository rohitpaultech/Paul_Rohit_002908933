/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;

/**
 *
 * @author Rohit Paul G
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList;

    public HospitalDirectory() {
        
        hospitalList = new ArrayList<>();
        
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public Hospital addNewHospital(){
        Hospital h = new Hospital();
        hospitalList.add(h);
        return h;
    }
    
    
    
}
