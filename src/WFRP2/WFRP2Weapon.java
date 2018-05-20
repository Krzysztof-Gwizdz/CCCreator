/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WFRP2;

/**
 *
 * @author bajur
 */
public class WFRP2Weapon {
    String name;
    int encumbrance;
    boolean twoHanded;
    
    
    //enum section
    public static enum Type{
        melee, ranged
    }
    public static enum Group{
        ordinary, parrying, cavalry, flail, fencing, twoHanded, entangling,
        crossbow, longbow, sling, throwing
    }
    public static enum Damage{
        //TO DO
    }
    public static enum Reload{
        none,half,full, free
    }
    public static enum Qualities{
        none,impact,pummelling, armourPiercing, slow, defensive, tiring,
        balanced, fast, precise, special, snare, 
    }
}
