/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WFRP2;
import charactercreator.Stat;
/**
 *
 * @author bajur
 */
public class WFRP2Stat extends Stat{
    private int progression;
    private int actual;
    boolean isPercentage;
    
    //constructors section

    /*public WFRP2Stat() {
        super("",0);
        progression=0;
        actual=0;
    }*/

    public WFRP2Stat(String name, int value, int progression, int actual, boolean percentage) {
        super(name,value);
        this.isPercentage=percentage;
        this.progression = progression;
        this.actual = actual;
    }
    

    //getter setter section
    public int getProgression() {
        return progression;
    }

    public int getActual() {
        return actual;
    }

    public void setProgression(int progression) {
        this.progression = progression;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    
}
