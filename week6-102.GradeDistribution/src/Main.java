import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
   
        Grade grade = new Grade();
        System.out.println("Type exam scores, -1 completes:");
        int score;
        while (true) {
            score = reader.nextInt();
            if(score <= -1) break;
              if (score >= 0 && score <= 60) grade.addScore(score);
        }
    
       grade.getGrades();
       
       grade.printGradeDistribution();
       
        System.out.println("Acceptance percentage: " + grade.acceptancePercentage());
        
    }
}
