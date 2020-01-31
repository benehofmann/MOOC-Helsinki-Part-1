import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {

        int place = 0;
        int sum = 0;

        for (int i : list)
        sum += i;
        return sum;
        
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average;
        double sum = sum(list); // zieht das Ergebnis "a" aus der Methode (Sum) mit dereingegebenen ArrayListe
        average = sum / list.size(); // teilt das Ergebnis "a" durch die Länge der Liste
        return average; // Ergenis der Methode "average"
        
        
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        /* Beispiel
        3
        2
        7
        2
        ==> Summe 14
        ==> average 3.5 (14 / Listengröße(4)
        */
        //  
        int Ende = list.size();
        int a = 0;
        double zahl2 = 0;
        double zahl3 = 0;
        double variance = 0;

        double average = average(list);
      
        
        while (a < Ende ) {
            double zahl1 = list.get(a);
            zahl2 = (zahl1 - average) * (zahl1 - average);
            System.out.println("Zwischenergebnis " + zahl2);
            zahl3 = zahl3 + zahl2;
            System.out.println(zahl3);
            ++a;
        }

            variance = zahl3 / (Ende-1);
        
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
