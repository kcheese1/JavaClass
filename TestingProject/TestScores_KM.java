/**
 * Write a class named TestScores. The class constructor should accept an array of test scores as
 * it's argument.
 * @author Kolby Miller
 *
 */
public class TestScores_KM{
    double[] scores;
    
    public TestScores_KM(double[] scores){
        this.scores = scores; // may require a deep copy
        this.checkArray();
    }
/**
 * The class should have a method that returns the average of the test scores.
 * @return The avreage of the test scores.
 */
    public double genAverage(){
        double sum = 0;
        for(int i = 0; i < this.scores.length; i++){
            sum += this.scores[i];           
        }

        return sum / this.scores.length;
    } 
/**
 * if any test score in the array is negative or greater than 100, the class should throw an 
 * IllegalArgumentException.
 * @throws InvalidTestScore_KM
 */
    private void checkArray() throws InvalidTestScore_KM{
        for(int i = 0; i < this.scores.length; i++){
            if(this.scores[i] > 100 || this.scores[i] < 0){
                throw new InvalidTestScore_KM("All scores must be between 0-100");
            }           
        }
    }
    
}
