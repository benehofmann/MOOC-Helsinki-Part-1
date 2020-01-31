/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        
    }
    
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public int priceDifference(Apartment ohterApartment) {
         int price1 = this.pricePerSquareMeter * this.squareMeters;
         int price2 = ohterApartment.pricePerSquareMeter * ohterApartment.squareMeters;
         
         if (price1 >= price2) {
             return price1-price2;
         } else {
              return price2-price1;
         }
         
       
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {

        int a = this.pricePerSquareMeter * this.squareMeters;
        int b = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if (a > b) {
            return true;
        } else {
            return false;
        }
        
        
    }
}

