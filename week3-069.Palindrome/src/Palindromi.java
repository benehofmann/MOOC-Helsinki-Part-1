import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String Lösung = text;

        String help = "";
        System.out.println(Lösung.length());
        int a = Lösung.length();
        System.out.println(a);
        
        for (a = Lösung.length() - 1; a>= 0; a--){
            help = help + Lösung.charAt(a);
           
        }
        System.out.println(Lösung);
        System.out.println(help);
           if (Lösung.equals(help)) {
               return true;
           }
           else {
             return false;  
           }
//        for(int a = Lösung.length() - 1; a >= 0; a--) {
     
//        help = help + Lösung.charAt(a);
//        System.out.println(help);
        
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
