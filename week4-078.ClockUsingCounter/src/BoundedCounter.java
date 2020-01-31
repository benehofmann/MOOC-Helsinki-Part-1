/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BoundedCounter {
    private int value;
    private int upperlimit;
    
        public BoundedCounter(int upperlimit) {
            this.upperlimit = upperlimit;
            this.value = 0;
        }
        
        public void next() {
                   if (this.value < this.upperlimit) {
                this.value++;
            } 
            
                   else {
                this.value = 0;
            }

        }
        
        public String toString() {
            if (this.value <= 9) {
            return "" + 0 + this.value;    
            }
            else {
                return "" + this.value;
            }
        }
        
        public int getValue() {
            return this.value;
        }
        
        public void setValue(int newValue) {
            if(newValue >= 0 && newValue <= this.upperlimit) {
                this.value = newValue;
            }
        }
        
}
