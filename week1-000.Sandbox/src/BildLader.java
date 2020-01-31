
import java.awt.*;
import java.awt.event.*;

public class BildLader extends Frame {
	private Image pic;
	private int hoehe;
	private int breite;
	
	public BildLader() {
		setSize(800, 800);
		setVisible(true);
		
		        //damit wird der Frame geschlossen!
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we)
        {
            dispose();
            System.exit(0);
        }
        });
	}
	
	public void paint(Graphics g) {
		pic = Toolkit.getDefaultToolkit().getImage("quadratische-fotos-iphone.jpg");
		
		MediaTracker mediatracker = new MediaTracker(this);
		mediatracker.addImage(pic, 0);
		try { mediatracker.waitForID(0); }
		catch (InterruptedException ie) {
			System.out.println("Bildladevorgang abgebrochen: " + ie.getMessage());
		}
		
		
		int hoehe = pic.getHeight(this);
		int breite = pic.getWidth(this);
		g.drawImage(pic, 0, 0 , this);
		System.out.println("Hoehe : " + hoehe + "Breite : " + breite);
	}
	
	public static void main (String[] args) {
		new BildLader();
	}
}