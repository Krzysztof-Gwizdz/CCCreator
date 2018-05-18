/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactercreator;

/**
 *
 * @author Krzysztof Gwiżdż
 */
public class BasicInfo {
    public static enum Gender{
        male,female
    }
    private Gender gender;
    private String name, gm, owner;

    //constructors section
   
    public BasicInfo(Gender gender, String name, String gm, String owner) {
        this.gender = gender;
        this.name = name;
        this.gm = gm;
        this.owner = owner;
    }
    
    //getter and setter section

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getGm() {
        return gm;
    }

    public String getOwner() {
        return owner;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGm(String gm) {
        this.gm = gm;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
}
