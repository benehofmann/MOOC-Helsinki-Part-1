/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Counter {
    private boolean check;
    private int startingvalue;
    public int value;
    
    
    public Counter(int startingvalue, boolean check) {
        this.startingvalue = startingvalue;
        
        this.check = check;
        this.value = this.startingvalue;
    }
    
    public Counter(int startingvalue) {
        this.startingvalue = startingvalue;
        this.check = false;
        this.value = this.startingvalue;
    }
    
    public Counter(boolean check) {
        this.check = check;
        this.startingvalue = 0;
    }
    
    public Counter() {
        this.startingvalue = 0;
        this.check = false;
    }
    public int value() {
        return this.value;
    }
    public void increase() {
        this.value++;
        
    }
    public void decrease() {
        if (this.check) {
            if (this.value >= 1) {
              this.value--;  
            } 
        } else {
            this.value--;
        }
        
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.value += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0 ) {
            if (this.check) {
                if (this.value >= decreaseAmount) {
                    this.value -= decreaseAmount;
                } else {
                    this.value =0;
                }
            } else {
                this.value -= decreaseAmount;
            }
        }
    }
}
