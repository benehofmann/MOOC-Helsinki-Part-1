import java.awt.*;
import java.awt.event.*;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import sun.awt.image.FileImageSource;
/**
 * Diese Klasse erstellt ein Vorschaubild, welches auf Karten gezeichnet wird.
 * Im Fest VorschauCanvas genannt
 * @author User
 */
public class BildVorschau extends Canvas {
private Image vorschauBild;

	public BildVorschau(Image image) {
	image = Toolkit.getDefaultToolkit().getImage("quadratische-fotos-iphone.jpg");
	vorschauBild = BilderVerwaltung.bilderZuordnen(image, this); // das Vorschaubild erhält einen Mediatracker
	setSize(image.getWidth(this), image.getHeight(this));
        
        
	}
	
	public void paint(Graphics g) {
		g.drawImage(vorschauBild, 0, 0, this);
	    
	}
        
        
}