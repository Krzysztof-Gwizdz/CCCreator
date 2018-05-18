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
    private WFRP2Stat statistics[]=new WFRP2Stat[16];
    
    WFRP2Character(BasicInfo.Gender gender, String name, String gm, String owner, 
            Appearance.Eyes eyes, Appearance.Hair hair, int height, int weight){
        super(gender, name, gm, owner, eyes, hair, height, weight);
    }
}
