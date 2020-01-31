import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.Hashtable;
import java.util.Enumeration;


/**
 * Es wird eine Referenz des Eventhandlers auf das Spielkarten-Array vorgenommen !
 * Das Array gespeichert wird einer Hashtable zugeordnet.
 * anhand des Keys lässt sich jedes Objekt in der Hashtable identifizieren
 * @author User
 */
public class SpielkartenEventHandler implements MouseListener {
    private int spalte;
    private int zeile;
    
    Object key;
    Hashtable modelTable;
    
    
    public SpielkartenEventHandler(SpielKartenArrayInterface spielKartenArray) {
        modelTable = new Hashtable();
        key = new Integer(spielKartenArray.hashCode());
        modelTable.put(key, spielKartenArray);
    }
    
    public void addSpielKartenverwaltung(SpielKartenArrayInterface spielKartenverwaltung) {
        key = new Integer(spielKartenverwaltung.hashCode());
        modelTable.put(key, spielKartenverwaltung);
    }
    
    public SpielKartenArrayInterface removeModel(SpielKartenArrayInterface mosaikModel) {
        key = new Integer(mosaikModel.hashCode());
        return (SpielKartenArrayInterface)modelTable.remove(key);
        }

    
    //Implementierung der Methoden des Interface MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // zieht sich die Zeile/Spalte der angeklickten Karte
        zeile = ((SpielKartenInterface)e.getSource()).getZeile();
        spalte = ((SpielKartenInterface)e.getSource()).getSpalte();
        // Es wird eine Aufzählung aus allen Schlüsseln der Karten des Array erstellt.
        Enumeration enuma = modelTable.keys();
        while(enuma.hasMoreElements()) {
            key = enuma.nextElement();
            //Anhand des Schlüssel wird die richtige Karte gefunden und die dort definierte "action" wird ausgeführt
             ((SpielKartenArrayInterface)modelTable.get(key)).action(zeile, spalte);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
}
