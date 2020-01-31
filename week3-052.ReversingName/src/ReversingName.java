import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String strInput = reader.nextLine();
//        firstLetter(name);

        String reverseString = "";
        
for(int a = strInput.length() - 1; a >= 0; a--) {
     
    reverseString = reverseString + strInput.charAt(a);
}
        System.out.println("In Reverse order: " + reverseString);

    } }
    
//public static char letter(String text, int Hilfe) {
//    char Lösung = text.charAt(Hilfe);
//    System.out.print(Lösung);
//    return Lösung;
//}
//    
//        public static char firstLetter(String Text) {
//        char firstLetter = Text.charAt(Text.length()-1);
//        System.out.print(firstLetter);
//        return firstLetter;
//}
//}

