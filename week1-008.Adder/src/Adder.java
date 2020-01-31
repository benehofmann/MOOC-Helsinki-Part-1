
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

// Implement your program here. Remember to ask the input from user
System.out.print("Type a number: ");
int zahlEins = Integer.parseInt(reader.nextLine());

System.out.print("Type another number: ");
int zahlZwei = Integer.parseInt(reader.nextLine());

System.out.print("Sum of the numbers: " + (zahlEins + zahlZwei));
    }
}
