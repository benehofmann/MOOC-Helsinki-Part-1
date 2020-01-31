/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public interface SpielKartenArrayInterface {
    public void action(int zeile, int spalte);
    public void putMObj(int zeile, int spalte, SpielKartenInterface mObj);
    public SpielKartenInterface getMObj(int zeile, int spalte);
}

