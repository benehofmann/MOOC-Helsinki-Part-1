import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int Ergebnis= 1;
        int Zähler;
        System.out.println("Type a number: ");
        int Ende = Integer.parseInt(reader.nextLine());
        
       for (Zähler = 2;Zähler <= Ende; ++Zähler) {
           Ergebnis = Ergebnis * Zähler;
       
        
    }  System.out.println("Factorial is "+ Ergebnis);
            
        
        
        
    }
}
