/**
 * This class takes in the students answers telling if the student passed, 
 * how many questions the student got correct, incorrect, and missed.
 * @author Kolby Miller
 */
import java.util.Scanner;
public class DemoProgram_KM {

	/*
	 * The program only accepts the letters A, B, C, or D as answers 
	 * and performs input validation to verify this.
	 */
	public static void userInput(char[] Answers)
	{
		Scanner kb = new Scanner(System.in);
		
		for(int i = 0; i < Answers.length; i++)
		{
			char choice;
			System.out.println("Please Answer #" + (i + 1) + ": ");
			choice = kb.next().charAt(0);
			
			while(! (choice == 'A' || choice == 'a' || choice == 'B' || choice == 'b' || choice == 'C' || choice == 'c' || choice == 'D' || choice == 'd')){
				System.out.println("Expected A,B,C,D!");
				System.out.println("Student Answer: " + (i + 1));
				choice = kb.next().charAt(0);
			}
			
			Answers[i] = choice;
		}
	}
	
	/*
	 *  The program displays the results returned from the DriverExam class methods.
	 */
	public static void examResults(DriverExam_KM DE)
	{
		System.out.println("Correct Answers: " + DE.totalCorrect() + "\nIncorrect Answers: "+ DE.totalIncorrect());
		for(int i = 0; i < DE.questionsMissed().length; i++)
		{
			if(DE.questionsMissed()[i] != 0){
				System.out.print("You missed question #" + DE.questionsMissed()[i] + "\n");
			}
		}
		
		if(DE.passed()){
			System.out.println("Congrats fam you passed, have fun hitting the road!!");
		}
		else{
			System.out.println("Woops looks like you failed better luck next time.");
		}
	}
	
	public static void main(String[] args)
	{
		char[] userAnswers = new char[20];
		userInput(userAnswers);
		DriverExam_KM exam = new DriverExam_KM(userAnswers);
		examResults(exam);
	}
}
