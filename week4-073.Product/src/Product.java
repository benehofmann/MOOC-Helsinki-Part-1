/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */



public class Product {
    private double price;
    private int amount;
    private String name;
        public Product(String name, double price, int amount) {
            this.price = price;
            this.amount = amount;
            this.name = name;
        }
       public void printProduct(){
           System.out.println("Name" + this.name+", price "+this.price+", amount "+this.amount);
       
        } 
}
