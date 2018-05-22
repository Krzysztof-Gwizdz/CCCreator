package charactercreator;

public class Appearance {
    //enum section

    public static enum Hair {
        blonde, black, brown, red, grey, white
    }

    ;

    public static enum Eyes {
        blue, brown, green
    }

    ;

    public static enum Gender {
        male, female
    }

    private Gender gender;
    private Hair hair;
    private Eyes eyes;
    private int height, weight;

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
    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
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
