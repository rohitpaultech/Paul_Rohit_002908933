/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonPackage;

import java.util.ArrayList;

/**
 *
 * @author Rohit Paul G
 */
public class PersonDirectory {
    
    private ArrayList<Person> personlist;

    public PersonDirectory() {
        personlist = new ArrayList<>();   
    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }
    
    //public Person addNewPerson(String fName, String lName, int age, String dateOfBirth, double height, float weight, String mobilePhn, String roles, String hospital, String city, String community, String userName, String passWord, String houseAddress){
        
        //Person np = new Person(fName, lName, age, dateOfBirth, height, weight, mobilePhn, roles, hospital, city, community, userName, passWord, houseAddress);
        //personlist.add(np);
        //return np;
    //}
    
    public Person addNewPerson(){
        Person np = new Person();
        personlist.add(np);
        return np;
    }
    
    
    
}
