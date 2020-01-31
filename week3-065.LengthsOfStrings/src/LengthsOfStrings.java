import java.util.ArrayList;

public class LengthsOfStrings {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>(); // das wird das neue Array, welches als Ergebnis ausgegeben wird.
        // write code here
        int a = 0;
        boolean start = true;
        int Ende = list.size();
        
        while ( a < Ende ) {
        String Wort = list.get(a);
        int Länge = Wort.length();
        lengthList.add(Länge);    
        ++a;
        }

        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
}
