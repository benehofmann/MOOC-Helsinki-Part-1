
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

       System.out.print("Type a number ");
       int zahlEins = Integer.parseInt(reader.nextLine());

       System.out.print("Type another number: ");
       int zahlZwei = Integer.parseInt(reader.nextLine());
       System.out.print("The bigger number of the two numbers given was: " + (Math.max(zahlEins, zahlZwei))); // Implement your program here. Remember to ask the input from user
    }
}
