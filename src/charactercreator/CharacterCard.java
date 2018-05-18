package charactercreator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krzysztof Gwiżdż
 */
public class CharacterCard {
    private BasicInfo basicInfo;
    private Appearance appearance;

    
    //constructors section
    
    public CharacterCard(BasicInfo.Gender gender, String name, String gm, String owner, 
            Appearance.Eyes eyes, Appearance.Hair hair, int height, int weight){
        basicInfo = new BasicInfo(gender, name, gm, owner);
        appearance = new Appearance(hair, eyes, height, weight);
    }
    
}
