
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your Name: " );
        String Name = reader.nextLine();
        int Länge = Name.length();
        int Start = 0;
        
        while (Start < Länge) {
            Buchstabe(Name, Start);
            ++Start;
            
        }
        
    }
    
    public static char Buchstabe(String Name, int Zähler) {
        int Hilfe = Zähler + 1;
        char Lösung = Name.charAt(Zähler);
        System.out.println(Hilfe + ". character: " + Lösung);
        return Lösung;
    
    }
}
