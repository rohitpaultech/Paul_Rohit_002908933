/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

import java.util.ArrayList;

/**
 *
 * @author Rohit Paul G
 */
public class SystemAdminDirectory {
    
    private ArrayList<SystemAdmin> systemAdminList;

    public SystemAdminDirectory() {
        systemAdminList = new ArrayList<>();
    }

    public ArrayList<SystemAdmin> getSystemAdminList() {
        return systemAdminList;
    }

    public void setSystemAdminList(ArrayList<SystemAdmin> systemAdminList) {
        this.systemAdminList = systemAdminList;
    }
    
    public SystemAdmin addNewSystemAdmin(){
        SystemAdmin sa = new SystemAdmin();
        systemAdminList.add(sa);
        return sa;
    }
    
    
    
}
