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
public class Appearance {
    public static enum Hair{
        blonde,black,brown,red,grey,white
    };
    public static enum Eyes{
        blue,brown,green
    };
    private Hair hair;
    private Eyes eyes;
    int height, weight;

    //constructors section
    
    public Appearance() {
    }

    public Appearance(Hair hair, Eyes eyes, int height, int weight) {
        this.hair = hair;
        this.eyes = eyes;
        this.height = height;
        this.weight = weight;
    }
    
    
    
    //Getter and setter section
    public Hair getHair(){
        return hair;
    }
    
    public void setHair(Hair hair){
        this.hair=hair;
    }
    
    public Eyes getEyes(){
        return eyes;
    }
    
    public void setEyes(Eyes eyes){
        this.eyes=eyes;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void setHeight(int height){
        if(height>0){
            this.height=height;
        }
    }
    
    public int getWeight(){
        return weight;
    }
    
    public void setWeight(int weight){
        if(weight>0){
            this.weight=weight;
        }
    }
    
    /*
    // toStrings
    // return strings of non-strings values
    
    public String hairToString(){
        return ""+hair;
    }
    
    public String eyesToString(){
        return ""+eyes;
    }
    
    public String weightToString(){
        return ""+weight;
    }
    
    public String heightToString(){
        return ""+height;
    }
    */
}
