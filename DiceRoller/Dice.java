import java.util.Random;

/***
 * The dice class helps us simulates rolling a die.
 *
 * @author Kolby Miller
 *
 */
public class Dice {

    private int numSides; // The number of sides
    private int value; // The value shown on the die
    private Random rg; // The random generator

    /**
     * Constructor
     */
    // Task #1 - Create constructor here.
    public Dice(int numSide) {
        numSides = numSide;
        value = 1;
        rg = new Random();
    }

    /**
     * Getter for the value
     * 
     * @return The value shown on the dice
     */
    public int getValue() {
        return value;
    }

    /***
     * Rolls the die. Changes the value to a random #1 to the approriate number,
     * depending on the total sides of the die.
     */
    // Task #2 - Complete the Roll method here
    public int roll() {
        value = rg.nextInt(numSides) + 1;
        int val = value;

        return val;
    }
}
