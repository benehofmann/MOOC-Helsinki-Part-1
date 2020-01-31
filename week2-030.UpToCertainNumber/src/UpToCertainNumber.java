
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Type a number");
        int userNumber = Integer.parseInt(reader.nextLine()); 
        int start = 0;
        
        while (start < userNumber) {
            start = ++start;
            System.out.println(start);
        }
        
    }
}
