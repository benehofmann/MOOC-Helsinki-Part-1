
public class Main {

    public static void main(String[] args) {
  
NightSky NightSky = new NightSky(1.0, 40, 10);
NightSky.print();
System.out.println("Number of stars: " + NightSky.starsInLastPrint());
System.out.println("");

NightSky = new NightSky(0.2, 15, 6);
NightSky.print();
System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
