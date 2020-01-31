
public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int Summe = sum(number1, number2, number3, number4);
        double Hilfe = 4;
        double Ergebnis = (double)(Summe / Hilfe);
      
        return Ergebnis;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
