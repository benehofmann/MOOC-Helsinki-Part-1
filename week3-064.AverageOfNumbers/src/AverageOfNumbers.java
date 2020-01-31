
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        
        int place = 0;
        int a = 0;

        for (int i : list)
        a += i;
        return a; // Ergebnis der Methode AverageOfNumbers
        
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        double average;
        double sum = sum(list); // zieht das Ergebnis "a" aus der Methode (Sum) mit dereingegebenen ArrayListe
        average = sum / list.size(); // teilt das Ergebnis "a" durch die Länge der Liste
        return average; // Ergenis der Methode "average"
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
