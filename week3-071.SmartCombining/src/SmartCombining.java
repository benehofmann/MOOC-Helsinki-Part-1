import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SmartCombining {
    
      public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
    
//          System.out.println(first);
//          
//          System.out.println(second);
//System.out.println("Anfang" + first);

 first.addAll(second); // Ergänz alle Werte aus "second" hinten dran in "first" 
        
 System.out.println("Vor Sortierung" +first);
 Collections.sort(first);       
          System.out.println("Nach Sortierung " + first);
    
          HashSet hs = new HashSet();
          
          hs.addAll(first);
          first.clear();
          first.addAll(hs);
          
          
/* Model Solution
          for (Integer number : list2) {
             if (!list1.contains(number)) {
                 list1.add(number);

          */


}
    
    
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
//        System.out.println(list1);
//        System.out.println(list2);
    }

}
