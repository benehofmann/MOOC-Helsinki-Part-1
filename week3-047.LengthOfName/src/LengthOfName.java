
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your Name: ");
        String text = reader.nextLine();
        calculateCharacters(text);
        // call your method from here
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text) {
        int a = text.length();
        System.out.println("Number of characters: " + text.length());
        return a; 
    }
}
