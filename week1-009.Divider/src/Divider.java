
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

       System.out.print("Type a number: ");
       int zahlEins = Integer.parseInt(reader.nextLine());

       System.out.print("Type another number: ");
       int zahlZwei = Integer.parseInt(reader.nextLine());

       double result = (double)zahlEins / zahlZwei;
       
       System.out.print("Division: " + zahlEins + "/" + zahlZwei + "=" + result );
// Implement your program here. Remember to ask the input from user.
    }
}
