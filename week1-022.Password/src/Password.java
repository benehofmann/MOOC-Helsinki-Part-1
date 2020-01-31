
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

    while (true) {
        System.out.println("Type the password: ");
        String userEingabe = reader.nextLine();
       
     
        if (userEingabe.equals(password)) {
            System.out.println("Right!");
            System.out.println("The secret is: jryy qbar!");
            break;
        }
        else {
                  System.out.println("Wrong!");  // danach springt es zu Type a password!
                    }}
        }
// Write your code here
    }

