import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BildKarte extends Canvas implements SpielKartenInterface {
    private Image bild;
    private Color farbeRueckseite;
    private boolean isVorderSeite;
    private int zeile;
    private int spalte;
    
    public BildKarte(int zeile, int spalte, Color farbeRueckSeite) {
        this.zeile = zeile;
        this.spalte = spalte;
        this.farbeRueckseite = farbeRueckSeite;
    }
    
    public void setBild(Image image) {
        bild = image;
    }
    
    public void paint(Graphics g) {
        if(isVorderSeite) { //wahr Bild wird gezeichnet
            g.drawImage(bild, 0, 0, this);
        } else { //Rückseitenfarbe wird gezeichnet
            g.setColor(getFarbe());
            g.fillRect(0, 0, getSize().width - 1, getSize().height - 1);
        }
    }
    
    public Color getFarbeRueckseite() {
        return farbeRueckseite;
    }
    
    public void setFarbe(Color eingabeFarbe) {
      this.farbeRueckseite = eingabeFarbe;
    }
    
    public Color getFarbe() {
        return farbeRueckseite;
    }
    
    @Override
    public boolean isVorderSeite() {
        return isVorderSeite;
    }

    @Override
    public int getZeile() {
        return zeile;
    }
    
    public void setZeile(int eingabeWert) {
        zeile = eingabeWert;
    }

    @Override
    public int getSpalte() {
        return spalte;
    }
    
    public void setSpalte(int eingabeWert) {
        spalte = eingabeWert;
    }

    @Override
    public void switchNachbarn() {
        isVorderSeite =! isVorderSeite;
        repaint();
    }
    
}
