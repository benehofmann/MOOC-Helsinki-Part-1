import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsprinted;
    
    public NightSky(){
        
    }
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
                
    }
    
    public NightSky(int width, int height) {
        this.density = 0.1;
        this.height = height;
        this.width = width;
    }
    
    public NightSky(double densitiy, int width, int height) {
        this.density = densitiy;
        this.width = width;
        this.height = height;
    }
    
    public double getRandom() {
        Random randomNumber = new Random();
        
        return randomNumber.nextDouble();
    }
    
    public void printLine() {
        for(int a = 0; a < this.width; a++) {
           double zufall = getRandom();
           if(zufall < this.density) {
               System.out.print("*");
               starsprinted++;
           } else {
               System.out.print(" ");
           }
        }
        System.out.println("");
    }
    
    public int starsInLastPrint() {
        return starsprinted;
    }
    
    public void print() {
        starsprinted = 0;
        for(int a = 0; a < this.height; a++) {
            printLine();
        }
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
}
