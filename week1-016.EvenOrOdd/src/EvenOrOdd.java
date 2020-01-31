
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

 
System.out.println("Type a number: ");
int numberOne = Integer.parseInt(reader.nextLine());

int indicator = numberOne % 2;

System.out.println(indicator);

    if (indicator == 0) {
        System.out.println("Number " + numberOne + " is even.");
                } else {
        System.out.println("Number " + numberOne + " is odd.");
    }
    }

            
    
        // Type your program here

        // NOTE:
        // Parity of a value can be easily checked with modulo-operator %.
        // Test the following:
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // Systemout.println( 6%2 );
        // System.out.println( 7%2 );
        // int value = 8
        // System.out.println( value%2 );

    }

