
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class Rahmen extends Frame {
   private int zahlDerRaster;
   private String bildName; 
   private Image bild;
   private BilderSpielfläche bilderspielfläche;
   private Color farbeRueckSeite;
    
    public Rahmen(int zahlDerRaster) {
        this.zahlDerRaster = zahlDerRaster;
        farbeRueckSeite = new Color(230, 30, 50);
        
        //Image Objekt
        bild = Toolkit.getDefaultToolkit().getImage("quadratische-fotos-iphone.jpg");
        
        //Mediatracking im ImageHandler
        bild = BilderVerwaltung.bilderZuordnen(bild, this);
        int bildBreite = bild.getWidth(this); //zeichen erforderlich!!!
        System.out.println("bildBreite = "+ bildBreite);
        bilderspielfläche = new BilderSpielfläche(zahlDerRaster, bildBreite, farbeRueckSeite, bild); 
        add(bilderspielfläche);
        
        setSize(700, 700);
        setVisible(true);
        
         //die Methode bewirkt ein Schließen des Frame-Fensters
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev)
            {dispose();
            System.exit( 0) ;
            }
        }
        ); 
        
        
        
    }
   
   public static void main(String args[]) {
       int raster;
       
       //Raster Parameter einlesen
       if(args.length == 0)
            raster = 3;
       else {
           try {
               raster = Integer.parseInt(args[0]);
           }
           catch(NumberFormatException nfe) {
               raster = 4;
               System.out.println("Ratser auf default = " + raster + " gesetzt" + nfe.getMessage());
           } // ende try catch
       } // ende if else
       Rahmen rahmen = new Rahmen(raster);
   }
   
   
   
   
   
   
   
}  
   
//    public static void main(String[] args) {
//        int raster;
//        
//        // Rasteranzahl = 3, wenn keine Vorgabe gemacht wird
//        if(args.length == 0) 
//            raster = 3;
//         else {
//          try {  raster = Integer.parseInt(args[0]);
//        } catch(NumberFormatException nfe) {
//            raster = 4;
//             System.out.println("Raster auf default-Wert " + raster + " gesetzt" + nfe.getMessage());
//        } // Ende try catch
//        
//    }
//        // Erstellung des Rahmens
//        Rahmen rahmen = new Rahmen(raster);
//    
//}
//    public Rahmen(int zahlDerRaster) {
//        //Spielparameter
//        this.zahlDerRaster = zahlDerRaster;
//        farbeRueckSeite = new Color(230, 30, 50);
//        
//        //Image Objekt wird erstellt
//        bild = Toolkit.getDefaultToolkit().getImage("quadratische-fotos-iphone.jpg");
//        //Mediatracking für das Bild
//        bild = BilderVerwaltung.bilderZuordnen(bild, this);
//        int bildBreite = bild.getWidth(this);
//        
//        //Spielfläche wird erstellt
//        bilderspielfläche = new BilderSpielfläche(zahlDerRaster, bildBreite, farbeRueckSeite, bild);
//        add(bilderspielfläche);
//        setSize(700, 700);
//        setVisible(true);
//        
//                //die Methode bewirkt ein Schließen des Frame-Fensters
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent ev)
//            {dispose();
//            System.exit( 0) ;
//            }
//        }
//        ); 
//        
//    }
//    
//    
//}
