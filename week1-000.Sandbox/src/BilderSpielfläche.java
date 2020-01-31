
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ReplicateScaleFilter;

/**
 * Es wird ein Array aus Spielkarten erstellt. Diese Karten sind Canvas-Objekte.
 * Darauf werden Bilder gezeichnet. Hierfür wird vorab ein Bild skaliert und verkleinert.
 * @param image Bild das skaliert und auf die Karten gezeichnet wird.
 * @author User
 */
public class BilderSpielfläche extends Panel {
    private SpielKartenArrayInterface bilderArray;
    
    private SpielkartenEventHandler eventhandler;
    
    public BilderSpielfläche(int rasterZahl, int breiteDesGanzenBildes, Color farbeRueckSeite, Image image) {
        this.setLayout(new GridLayout(rasterZahl, rasterZahl, 1, 1));
        bilderArray = new SpielKartenArray(rasterZahl, rasterZahl);
        eventhandler = new SpielkartenEventHandler(bilderArray);
        
        
        //Bild skalieren auf Teilbarkeit für das Spiel
        if( (breiteDesGanzenBildes % rasterZahl) != 0) 
            breiteDesGanzenBildes = (breiteDesGanzenBildes/rasterZahl) * rasterZahl;
        
        
        int kartenBreite = breiteDesGanzenBildes / rasterZahl; // Breite der SPielkarte
        ImageFilter skalierung = new ReplicateScaleFilter(breiteDesGanzenBildes, breiteDesGanzenBildes);
        Image vollBild = this.createImage(new FilteredImageSource(image.getSource(), skalierung));
        
        //Bilkdkarten-Objekte werden erstellt
        for(int i = 0; i < rasterZahl; i++) {
            for(int j = 0; j < rasterZahl; j++) {
                BildKarte Karte = new BildKarte(i, j, farbeRueckSeite); //Spielkarten-Canvas erstellt
                
                ImageFilter cropImageFilter = new CropImageFilter(j * kartenBreite , i * kartenBreite, kartenBreite - 1, kartenBreite - 1);
                
                Image neuesBild = Karte.createImage(new FilteredImageSource(vollBild.getSource(), cropImageFilter));
                
                Karte.setBild(neuesBild); //durch die "paint-Methode" wird das neue Bild angezeigt!
                Karte.setSize(kartenBreite, kartenBreite);
                Karte.addMouseListener(eventhandler);
                bilderArray.putMObj(i, j, Karte);
                this.add(Karte);
            }
    }
    
    }
    
}
