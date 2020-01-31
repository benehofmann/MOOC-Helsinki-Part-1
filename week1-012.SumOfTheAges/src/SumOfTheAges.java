
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

       System.out.println("Type your Name: ");
       String nameOne = reader.nextLine();
       
        System.out.println("Type your Age:");
        int ageOne = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String nameTwo = reader.nextLine();
        
        System.out.println("Type your Age: ");
        int ageTwo = Integer.parseInt(reader.nextLine());
        
        int Summe = ageOne + ageTwo;
        
        System.out.println(nameOne + " and " + nameTwo + " are " + (ageOne + ageTwo) + " years old in total");
// Implement your program here
    }
}
