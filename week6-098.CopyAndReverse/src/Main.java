
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
  
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
            
        for(int a = 0; a < array.length; a++) {
            copy[a] = array[a];
        }
        return copy;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] copyReverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            copyReverse[j] = array[i];

        }
        return copyReverse;
    }
}
