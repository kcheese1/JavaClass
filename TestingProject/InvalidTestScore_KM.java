/**
 * Write an exception class named InvalidTestScore. Modify the TestScores class you wrote
 * in Programming Challenge 1 so it throws an InvalidTestScore exception if any of the test
 * scores in the array are invalid.
 * @author Kolby Miller
 */
public class InvalidTestScore_KM extends IllegalArgumentException{
    public InvalidTestScore_KM(String message){
        super(message);
    }
}
