/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WFRP2;
import charactercreator.Appearance;
import charactercreator.BasicInfo;
import charactercreator.CharacterCard;
/**
 *
 * @author bajur
 */
public class WFRP2Character extends CharacterCard {
    private WFRP2Info info;
    private WFRP2Stat statistics[]=new WFRP2Stat[16];
    
    public WFRP2Character(BasicInfo.Gender gender, String name, String gm,
            String owner){
        super(gender, name, gm, owner);
    }
    
    public void setAppearance(Appearance.Eyes eyes, Appearance.Hair hair,
            int weight, int height){
        this.appearance.setEyes(eyes);
    }
}
