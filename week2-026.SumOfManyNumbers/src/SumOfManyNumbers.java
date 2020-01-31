
import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.println("Type an number");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                System.out.println("Sum in the end: " + sum);
                break;
            }

            else if (read != 0) { 
// do something here
            sum = read + sum;
            System.out.println("Sum now: " + sum);
        }
        
        
    }
}}
