/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactercreator;

/**
 *
 * @author bajur
 */
public abstract class Stat {
    private String name;
    private int value;
    
    //constructors section
    protected Stat(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    //getter setter section
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public void setValue(int value) {
        this.value = value;
    }
    
}
