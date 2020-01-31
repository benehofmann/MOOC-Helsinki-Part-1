
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
 int a;

        if (number1 > number2 && number1 > number3) {
            a = number1;
            return a;
        }
        if (number1 > number2 && number1 == number3) {
            a = number1;
            return a;
        }
        if (number1 == number2 && number1 > number3) {
            a = number1;
            return a;
        }
        
                
                if (number2 > number1 && number2 > number3) {
                    a = number2;
                    return a;
                }
                if (number2 > number1 && number2 == number3) {
                    a = number2;
                    return a;
                }
                if (number2 == number1 && number2 > number3) {
                    a = number2;
                    return a;
                }
                        
                        if (number3 > number1 && number3 > number2) {
                            a = number3;
                            return a;
                        }
                        if (number3 > number1 && number3 ==number2) {
                            a = number3;
                            return a;
                        }
                        if (number3 == number1 && number3 > number2) {
                            a = number3;
                            return a;
                        }
        return number3;

    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
