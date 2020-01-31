/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Person {
    private String Name;
    private String phone;
    
        public Person(String Name, String Number) {
            this.Name = Name;
            this.phone = Number;
        }
        
    
    public String toString() {
       return this.Name + "  number: " + this.phone;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Number
     */
    public String getNumber() {
        return this.phone;
    }

    /**
     * @param Number the Number to set
     */
    public void setNumber(String Number) {
        this.phone = Number;
    }
    
    public void changeNumber(String newNumber) {
        this.phone = newNumber;
    }
    
    
}
