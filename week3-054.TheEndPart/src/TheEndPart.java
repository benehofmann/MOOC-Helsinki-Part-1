import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String Wort = reader.nextLine();
        int Wortlänge = Wort.length();
        System.out.print("Length of the end part: ");
        int Länge = reader.nextInt();

        
        System.out.println("Result: " + Wort.substring(Wortlänge - Länge));

        }
        
    }


