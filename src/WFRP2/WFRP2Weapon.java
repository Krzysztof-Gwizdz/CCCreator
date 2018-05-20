/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WFRP2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bajur
 */
public class WFRP2Weapon {
    private String name;
    private int encumbrance;
    private boolean twoHanded;
    private Type type;
    private Group group;
    private Damage damage;
    private Reload reload;
    private List<Qualities> qualities= new ArrayList<Qualities>();
    
    
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
