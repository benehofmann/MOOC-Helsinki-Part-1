
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String Wort1 = reader.nextLine();
        System.out.print("Type the second word: ");
        String Wort2 = reader.nextLine();

    if (Wort1.indexOf(Wort2) != -1 ) {
        System.out.println("The word " + Wort2 + " is found in the word " + "'" + Wort1 + "'");
    }
    else {
        System.out.println("The word " + Wort2 + " is not found in the word " + "'" + Wort1 + "'");
    }
    }
}
