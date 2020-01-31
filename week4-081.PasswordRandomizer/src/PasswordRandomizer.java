import java.util.Random;

public class PasswordRandomizer {
    private int lenght;
    private Random random = new Random();
    
    // Define the variables

    public PasswordRandomizer(int length) {
        this.lenght = length;
        
        // Initialize the variable
    }

    public String createPassword() {
        String buffer = "";
        
        for (int i = 0; i < this.lenght; i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            buffer += symbol;
        }
        
        // write code that returns a randomized password
        return buffer;
    }
}
