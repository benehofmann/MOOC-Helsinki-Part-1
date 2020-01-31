
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what");
        int ende = Integer.parseInt(reader.nextLine()); 
        int zähler = 1;
        int summe = 1;
       while (zähler < ende) {
           zähler = ++zähler;
           summe = summe + zähler;
            
       } System.out.println("Sum is " + summe);
        
        
    }
}
