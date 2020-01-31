
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int anfang;
        int ende;
        int sum = 0;
        System.out.println("First: ");
        anfang = Integer.parseInt(reader.nextLine()); 
        System.out.println("Last: ");
        ende = Integer.parseInt(reader.nextLine());
        
        while (anfang <= ende) {
            sum = anfang + sum;
            ++anfang;
        } 
            System.out.println(sum);
    }
}
