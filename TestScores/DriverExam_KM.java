/**
 * This class holds all the background information and inner workings of the demoProgram
 * @author Kolby Miller
 *
 */
public class DriverExam_KM {

	private final int SIZE = 20;
	
	private char[] studentAnswers;
	
	//holds the answers to these exams
	private static char[] Answers = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A' };
	
	/**
	 * accumulates number of correct answers.
	 * @return the total number of correctly answered questions.
	 */
	public int totalCorrect() {
		int correct = 0;
		for (int i = 0; i < SIZE; i++) {
			if (Character.toLowerCase(Answers[i]) == Character.toLowerCase(studentAnswers[i])) {
				correct = correct + 1;
			}
		}
		return correct;
	}
	
	/**
	 * accumulates number of incorrect answers.
	 * @return the total number of incorrectly answered questions.
	 */
	public int totalIncorrect() {
		int incorrect = 0;
		for (int i = 0; i < SIZE; i++) {
			if (!(Character.toLowerCase(Answers[i]) == Character.toLowerCase(studentAnswers[i]))) {
				incorrect = incorrect + 1;
			}
		}
		return incorrect;
	}
	
	/**
	 * Student must get above 15 questions right to pass.
	 * @return true if the student passed the exam, or false if the student failed.
	 */
	public boolean passed() {
		int passing = 15;
		if (totalCorrect() >= passing) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculates number of questions missed.
	 * @return an int array containing the question numbers that the student missed.
	 */
	public int[] questionsMissed() {
		int[] questionsMissed = new int[SIZE];

		for(int i = 0; i < questionsMissed.length; i++){
			questionsMissed[i] = 0;
		}

		int missed = 0;

		for (int i = 0; i < SIZE; i++) {
			if (!(Character.toLowerCase(Answers[i]) == Character.toLowerCase(studentAnswers[i]) )) {
				questionsMissed[missed] = i + 1;
				missed++;
			}
		}
		return questionsMissed;
	}

	/**
	 *  builds a string for the student�s answers
	 */
	public String toString() {
		String studentAnswers = "DATA: ";
		for (int i = 0; i < Answers.length; i++) {
			if (i == 0)
				studentAnswers += Answers[i];
			else
				studentAnswers += ", " + Answers[i];
		}
		return studentAnswers;
		// DATA: A, B, C, D
	}
	
	//stores studentAnswers
	public DriverExam_KM(char[] studentAnswers){
		this.studentAnswers = studentAnswers;
	}
}
