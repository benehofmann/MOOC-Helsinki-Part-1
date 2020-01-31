import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String Name = reader.nextLine();
        firstCharacter(Name);
        
    }
    
        public static char firstCharacter(String text) {
        char Anfang = text.charAt(0);
            System.out.println("First character: " + Anfang);
        return Anfang;
}
}

