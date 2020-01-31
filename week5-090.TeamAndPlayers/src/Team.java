import java.util.ArrayList;



/**
 *
 * @author User
 */
public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public void printPlayers() {
        
        for (Player a : this.players) {
            System.out.println(a);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        if (this.maxSize<this.players.size())
            return this.maxSize;
        else 
    return this.players.size();
    } 
    
    public int goals() {
        int buffer = 0;
        for (Player a : this.players) {
            buffer += a.goals();
        }
        return buffer;
    }
}
