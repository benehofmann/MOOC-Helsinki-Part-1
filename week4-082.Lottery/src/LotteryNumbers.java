import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        int buffer;
          this.numbers = new ArrayList<Integer>();
        while (this.numbers.size() < 7) {
          
            buffer = this.random.nextInt(39) + 1;
            if(!this.containsNumber(buffer)){
                this.numbers.add(buffer);
            }
            
        }
        
        
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        } else {
        return false;
    }
        // Test here if the number is already in the drawn numbers
        
    }
}
