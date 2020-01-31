/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Bird {
    public String Name;
    public String LatinName;
    public int observationCount;
    
    public Bird(String Name, String LatinName) {
        this.Name = Name;
        this.LatinName = LatinName;
    }
    
    public String getName() {
        return this.Name;
    }
    
    public String getLatinName() {
        return this.LatinName;
    }
    
    public void increaseObservation() {
        observationCount++;
    }
    
    public String toString() {
       return Name + "(" + LatinName + "): " + observationCount + " observations";
    }
}
