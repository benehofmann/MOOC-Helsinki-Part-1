
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
  Scanner reader = new Scanner(System.in);
  String name;
  String studentNumber;
  
  while(true) {
      System.out.print("Name: ");
        name = reader.nextLine();
        
        if(name.isEmpty()) {
            break;
           
        }
        System.out.print("studentnumber: ");
        studentNumber = reader.nextLine();
        
        Student buffer = new Student(name, studentNumber);
        list.add(buffer);

        }
  

        for (Student i : list){

            System.out.println(i.toString());

            
        }
  
        String search;
        
        System.out.print("Give the search term: ");
        search = reader.nextLine();

        System.out.println("Result: ");
        
        for (Student a : list) {
            if(a.getName().contains(search)) {
                System.out.print(a.toString());
            }
        }
    }
}
