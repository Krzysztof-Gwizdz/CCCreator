package WFRP2;

import charactercreator.Appearance;
import charactercreator.CharacterCard;

/**
 * @author bajur
 */
public class WFRP2Character extends CharacterCard {

    public static enum Race {
        human, elf, dwarf, hafling, gnlome, ogre, orc,
        goblin
        //TO DO
    }

    public static enum Career {
        thief
        //TO DO
    }

    public static enum StarSign {
        //TO DO
    }

    private WFRP2Stat statistics[] = new WFRP2Stat[16];
    private Race race;
    private Career currentProffession;
    private Career lastProffession;
    private int currentExperience;
    private int totalExperience;
    private int[] combatMovement = new int[3];
    private String birthPlace;
    private int siblingsCount;
    private String distinguishingMarks;
    private WFRP2Weapons weapons;

    public WFRP2Character(String name) {
        super(name);
    }

    public void setAppearance(Appearance.Gender gender, Appearance.Eyes eyes, Appearance.Hair hair,
                              int weight, int height) {
        this.appearance.setGender(gender);
        this.appearance.setEyes(eyes);
        this.appearance.setHair(hair);
        this.appearance.setHeight(height);
        this.appearance.setWeight(weight);
    }
}
