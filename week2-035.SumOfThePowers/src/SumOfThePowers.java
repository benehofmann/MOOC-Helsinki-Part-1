
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
// 2^0 = 1
// 2^1 = 2
// 2^2 = 4
// 2^3 = 8
        int start;
        int ergebnis = 0;
        double zwei = 2;
        System.out.println("Type a number");
        double ende = Integer.parseInt(reader.nextLine());
//z.B 3

for (start = 0;start <= ende; ++start) {
    
    int zwischenergebnis = (int)Math.pow(zwei,start);
     ergebnis = ergebnis + zwischenergebnis;
} System.out.println("The result is " + ergebnis);
        
// Zwischenergebnis = (int)Math.pow(zwei,x)        
// Zwischenergenis = 2^x (x = 0 am Anfang wird aber inkrementiet bis es gleich Eingabe ist)        
// Ergebnis = Ergebis + Zwischenergebnis

        

    }
}
