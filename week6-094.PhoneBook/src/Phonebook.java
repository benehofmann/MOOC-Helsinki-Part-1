import java.util.ArrayList;


public class Phonebook {
    private ArrayList<Person> entries = new ArrayList<Person>();
    
        public Phonebook() {
            this.entries.clear();
        }
        
        public void add(String Name, String number) {
            Person buffer = new Person(Name, number);
            this.entries.add(buffer);
        }
        
        public void printAll() {
            for(Person a : this.entries) {
                System.out.println(a.toString());
            }
        }
        
        public String searchNumber(String name) { // durchsucht die Arraylist nach der Nummber
           for (Person P : this.entries) { // sucht die Liste ab nach dem Suchbegriff
               if(P.getName().equals(name)) { // wenn gleich dann wirddie getName Methode aufgerufen
                   return P.getNumber();
               } 
           }
           
                   return "number not known"; // wenn nix gefunden wird
               
           }
            
            
}
