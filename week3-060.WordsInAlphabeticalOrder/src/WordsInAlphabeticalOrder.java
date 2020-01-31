
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        // create here an ArrayList
                
        boolean start = true;
        int place = 0;
        int Zähler = -1;
        
        while (start = true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            if (word.equals("")) {
                
                break;

                
            }
            else {
                words.add(word);
                ++Zähler;
            }
            
        }
                Collections.sort(words);
                System.out.println("You typed the following words");
                while (place <= Zähler) {
                    System.out.println(words.get(place));
                    ++place;
                }
                }
                
    }
//}
