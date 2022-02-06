/**
 * Simulating die throws
 * @author Dilay Yiðit
 * @version 12.12.2019
 */ 

public class Die {

    // Properties

    private int value;

    // Constructors

    public Die(){
        value = (int) (Math.random() * 6 + 1);
    }

    // Methods

    public int roll() {
        value = (int) (Math.random() * 6 + 1);
        return value;
    }
    public int getFaceValue(){
        return value;
    }

    public String toString(){
        return value + "";
    }

}