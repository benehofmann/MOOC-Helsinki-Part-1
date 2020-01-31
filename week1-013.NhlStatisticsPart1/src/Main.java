
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println(" Sidney Crosby´s Stats");
        NHLStatistics.searchByPlayer("Sidney Crosby)"); 
        
        System.out.println(" Stats of PHI");
        NHLStatistics.teamStatistics("PHI"); 
        NHLStatistics.sortByPoints();
        
        System.out.println("Top 10 in ANA by Points");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        
    }
}
