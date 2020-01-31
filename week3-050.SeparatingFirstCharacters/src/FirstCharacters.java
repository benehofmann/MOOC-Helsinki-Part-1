import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String Name = reader.nextLine();
        
        if (Name.length() > 2) {
                Buchstabe(Name);    
        }

        
        

    }
    
    public static void Buchstabe (String text) {
        char Lösung1 = text.charAt(0);
        System.out.println("1. character: " + Lösung1);
        char Lösung2 = text.charAt(1);
        System.out.println("2. character: " + Lösung2);
        char Lösung3 = text.charAt(2);
        System.out.println("3. character: " + Lösung3);
        
    }
}
