
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Die Spielfläche wird auf den Rahmen gesetzt.
 * Es wird hierbei ein Array aus Spielkarten erstellt.
 * Die Spielkarten werden mithilfe eines Gridlayout auf dem "Rahmen" angeordnet.
 * @author User
 */
public class Spielfläche extends Panel  {
    protected SpielKartenArray spielKartenArray;
    protected SpielkartenEventHandler spielKartenEventHandler;
    
    public Spielfläche(int raster, int breite, Color farbeRueckSeite, Color farbeVorderSeite) {
        //leeres Panel !
        super(null);
        
        //das Array mit den Spielkarten wird frisch erstellt
        spielKartenArray = new SpielKartenArray(raster, raster);
        
        // Der Eventhandler wird dem Array zugeordnet. Dieser verwaltet die Mausklicks und den Farbwechsel
        spielKartenEventHandler = new SpielkartenEventHandler(spielKartenArray);
        
        //das Layout des Panel wird erstellt
        setLayout(new GridLayout(raster, raster, 1, 1));
        int spielKartenBreite = breite / raster;
        
        for(int i = 0; i < raster; i++) {
            for(int j = 0; j < raster; j++) {
                Spielkarte spielkarte = new Spielkarte(i, j, farbeRueckSeite, farbeVorderSeite);
                // enthält den MouseListener
                spielkarte.addMouseListener(spielKartenEventHandler); 
                spielKartenArray.karteHinzufuegen(i, j, spielkarte);
                spielkarte.setSize(spielKartenBreite, spielKartenBreite);
                this.add(spielkarte);
            }
        }
        
    }
}
