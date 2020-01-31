
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benedikt Hofmann
 */
public class Spielkarte extends Canvas implements SpielKartenInterface{
    private Color farbe;
    private Color farbeRueckSeite;
    private Color farbeVorderSeite;
    
    private boolean seite;
    
    private int zeile;
    private int spalte;
    
    /**
     *
     * @param zeile speichert in welcher Zeile des Spielrasters die Karte erstellt wird
     * @param spalte peichert in welcher Spalte des Spielrasters die Karte erstellt wird
     * @param farbeRueckSeite 
     * @param farbeVorderseite
     */
    public Spielkarte(int zeile, int spalte, Color farbeRueckSeite, Color farbeVorderseite) {
            this.zeile = zeile;
            this.spalte = spalte;
            this.farbeRueckSeite = farbeRueckSeite;
            this.farbeVorderSeite = farbeVorderseite;
            this.setAktuelleFarbe(farbeRueckSeite);
        }
        
     /**
     *
     * @param inValue passt die Farbe der Karte auf die aufgeführte Farbe an
     */
    public void setAktuelleFarbe(Color inValue) {
            farbe = inValue;
        }   
    
    /**
     * Gibt die aktuell zu sehende Farbe der Karte zurück
     * @return
     */
    public Color getAktuelleFarbe() {
            return farbe;
        }
        
    /**
     *
     * @return true = Vorderseite zu sehen
     */
    public boolean isVorderSeite() {
            return seite;
        }
    
    public void setSeite(boolean inValue) {
            seite = inValue;
        }
        
    /**
     *
     * @return
     */
    public int getZeile() {
            return zeile;
        }
        
    /**
     *
     * @return
     */
    public int getSpalte() {
            return spalte;
        }
    
    public void setZeile(int inValue) {
            zeile = inValue;
        }    
    
    public void setSpalte(int inValue) {
            spalte = inValue;
        }
        
    @Override
        public void paint(Graphics g) {
            //gibt die Farbe vor
            g.setColor(getAktuelleFarbe());
            //füllt die Karte mit der vorgegebenen Farbe bis zum Rand
            g.fillRect(0, 0, this.getSize().width - 1, this.getSize().height - 1);
            
        }
   /**
     * Wechselt zwischen den definierten Farben der Karte hin und her
     * @
     */
    @Override
    public void switchNachbarn() {
        seite = !seite;
        farbe = (farbe == farbeRueckSeite)?
                farbeVorderSeite : farbeRueckSeite;
        repaint();
    }
        
}
