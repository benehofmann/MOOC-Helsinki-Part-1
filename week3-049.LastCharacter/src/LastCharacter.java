import java.util.Scanner;


public class LastCharacter {
    
    public static char lastCharacter(String text) {
        char Ende = text.charAt(text.length()-1);
        System.out.println("Last character " + Ende);
        return Ende;
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your Name");
        String Name = reader.nextLine();
        lastCharacter(Name);
    }
}
