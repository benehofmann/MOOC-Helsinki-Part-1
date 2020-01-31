/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ein 2-dimensionales Array aus Spielkarten erstellt
 * Innerhalb der Klasse wird dieses Array verwaltet
 * @author Benedikt Hofmann
 */
public class SpielKartenArray extends java.awt.Panel implements SpielKartenArrayInterface {
    SpielKartenInterface[][] spielkarten;
    
    int zeilen;
    int spalten;
    
/**
 * Erstellung des Arrays der Karten (also die Spielfläche)
 * @author Benedikt Hofmann
 */
        public SpielKartenArray(int zahlDerZeilen, int zahlDerSpalten) {
            zeilen = zahlDerZeilen;
            spalten = zahlDerSpalten;
            spielkarten = new SpielKartenInterface[zeilen][spalten];
        }
        
         public void karteHinzufuegen(int zeile, int spalte, Spielkarte spielkarte) {
            spielkarten[zeile][spalte] = spielkarte;
        }       
        
        private void karteUmdrehen(int zeile, int spalte) {
            getSpielkarte(zeile, spalte).switchNachbarn();
        }        
        
        public void nachbarnDrehen(int zeile, int spalte) {
 	// erste Zeile : Mitte, links, rechts
	if (zeile - 1>= 0) {
		karteUmdrehen(zeile - 1,spalte);
		if (spalte - 1 >=0) 
			karteUmdrehen(zeile - 1,spalte -1);
		if (spalte + 1 < spalten)
			karteUmdrehen(zeile - 1, spalte + 1);
		}
	//zweite Zeile: links rehts
	if (spalte - 1 >= 0) 
		karteUmdrehen(zeile, spalte -1);
			if(spalte + 1 < spalten)
				karteUmdrehen(zeile, spalte +1);
	//dritte Zeile: Mitte links, rechts
			if(zeile + 1 < zeilen) {
                            karteUmdrehen(zeile + 1, spalte);
                                if(spalte - 1 >= 0)
                                    karteUmdrehen(zeile + 1, spalte -1);
                                if(spalte + 1 < spalten)
                                    karteUmdrehen(zeile + 1, spalte + 1);
                        }
            
        }
        
        public SpielKartenInterface getSpielkarte(int zeile, int spalte) {
            return spielkarten[zeile][spalte];
        }

    @Override
    public void action(int zeile, int spalte) {
        nachbarnDrehen(zeile, spalte);
    }

    @Override
    public void putMObj(int zeile, int spalte, SpielKartenInterface mObj) {
        spielkarten[zeile][spalte] = mObj;
    }

    @Override
    public SpielKartenInterface getMObj(int zeile, int spalte) {
        return spielkarten[zeile][spalte];
    }
}
