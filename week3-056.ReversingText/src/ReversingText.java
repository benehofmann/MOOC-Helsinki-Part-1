
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String Lösung = text;
        
        
        String help = "";
        
        
        for(int a = Lösung.length() - 1; a >= 0; a--) {
     
    help = help + Lösung.charAt(a);
}
//          System.out.println("In Reverse order: " + help);
      
        // adiing a character to the hep variable
        
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
