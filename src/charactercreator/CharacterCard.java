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
public abstract class CharacterCard {
    protected BasicInfo basicInfo;
    protected Appearance appearance;

    
    //constructors section
    
    protected CharacterCard(BasicInfo.Gender gender, String name, String gm,
            String owner){
        basicInfo = new BasicInfo(gender, name, gm, owner);
        appearance = new Appearance();
    }
    
}
