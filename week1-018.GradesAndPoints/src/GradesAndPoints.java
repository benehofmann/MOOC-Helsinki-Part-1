
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]");
        int points = Integer.parseInt(reader.nextLine());
        
         if (points >= 0) {
             if (points <= 29) {
                 System.out.println("Grade: failed");
             }
         }
        
         if (points >= 30) {
             if (points <= 34) {
                 System.out.println("Grade: 1");
             }
         }
         
         if (points >= 35) {
             if (points <= 39) {
                 System.out.println("Grade: 2");
              
            }
         }
         if (points >= 40) {
             if (points <= 44) {
                 System.out.println("Grade: 3");
             }
         }
         if (points >= 45) {
             if (points <= 49) {
                 System.out.println("Grade: 4");
             }
         }
         if (points >= 50) {
             if (points <= 60) {
                 System.out.println("Grade: 5");
             }
         }
    }
}
