import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        boolean start = true;
        
        while(start) {
        System.out.println("Type numbers: ");
        int input = reader.nextInt();
            
            
      
            if(input == -1 ) {
                start = false;
            } else {
                
                if (input % 2 == 0) {
                    even.addNumber(input);
                    all.addNumber(input);
                }
                if(input % 2 != 0) {
                  all.addNumber(input);  
                  odd.addNumber(input);
                }
                
            }
        }
            System.out.println("Sum: " + all.sum());
            System.out.println("Sum of even : " + even.sum());
            System.out.println("Sum of odd: " + odd.sum());
        
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    }
}
