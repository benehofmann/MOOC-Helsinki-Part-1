
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String Name = reader.nextLine();
        System.out.print("Length of the first part: ");
        int Länge = reader.nextInt();
        System.out.print("Result: " + Name.substring(0, Länge));
    }
}
