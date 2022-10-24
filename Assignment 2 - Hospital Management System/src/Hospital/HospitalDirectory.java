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
    
    private ArrayList<HospitalAdmin> hospitalAdminList;

    public HospitalDirectory() {
        
        hospitalAdminList = new ArrayList<>();
        
    }

    public ArrayList<HospitalAdmin> getHospitalAdminList() {
        return hospitalAdminList;
    }

    public void setHospitalAdminList(ArrayList<HospitalAdmin> hospitalAdminList) {
        this.hospitalAdminList = hospitalAdminList;
    }
    
    public HospitalAdmin addNewHospitalAdmin(){
        HospitalAdmin hadmin = new HospitalAdmin();
        hospitalAdminList.add(hadmin);
        return hadmin;
    }
    
    
    
}
