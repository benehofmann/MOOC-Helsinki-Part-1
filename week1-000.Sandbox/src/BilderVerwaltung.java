
import java.awt.*;
import java.awt.event.*;

public class BilderVerwaltung {
	
	public static Image bilderZuordnen(Image pic, Component component) {
		MediaTracker mediaTracker = new MediaTracker(component);
		mediaTracker.addImage(pic, 0);
		
		try {
			mediaTracker.waitForID(0);
			return pic;
	} catch(InterruptedException ie) {
		System.out.println("Bildladevorgang abgebrochen : " + ie.getMessage());
		return null;
	}
}
}