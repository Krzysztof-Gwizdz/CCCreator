package charactercreator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Krzysztof Gwiżdż
 */
public abstract class CharacterCard {
    protected Appearance appearance;
    protected String name, gm, owner;


    //constructors section

    protected CharacterCard(String name) {
        this.name = name;
    }

    //getter setter section
    protected String getGm() {
        return gm;
    }

    protected String getName() {
        return name;
    }

    protected String getOwner() {
        return owner;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setGm(String gm) {
        this.gm = gm;
    }

    protected void setOwner(String owner) {
        this.owner = owner;
    }

}
