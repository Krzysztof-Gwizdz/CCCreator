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
public class WFRP2Info {
    public static enum Race{
        human, elf, dwarf, hafling, gnlome, ogre, orc,
        goblin
        //TO DO
    }
    public static enum Career{
        thief
        //TO DO
    }
    public static enum StarSign{
        //TO DO
    }
    private Race race;
    private Career currentProffession;
    private Career lastProffession;
    private int currentExperience;
    private int totalExperience;
    private String birthPlace;
    private int siblingsCount;
    private String distinguishingMarks;
    
}
