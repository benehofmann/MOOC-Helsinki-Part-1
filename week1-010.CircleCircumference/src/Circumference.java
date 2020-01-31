
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

         System.out.print("Type the radius: ");
         int zahlEins = Integer.parseInt(reader.nextLine());

        double volume = (double)zahlEins * Math.PI * 2;
        
        System.out.print("Circumference of the circle: " + volume);// Program your solution here 
    }
}
