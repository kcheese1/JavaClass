/**
 * This class simulates rolling a pair of dice 10,000 times and determines the
 * number of times doubles are rolled.
 * 
 * @author Kolby Miller
 */

public class DoublesDriver {
    public static void main(String[] args) {

        int totalRounds = 10000; // Total number of dice rolls
        int snakeEyes = 0; // Number of snake eyes rolls
        int twos = 0; // Number of double two rolls
        int threes = 0; // Number of double three rolls
        int fours = 0; // Number of double four rolls
        int fives = 0; // Number of double five rolls
        int sixes = 0; // Number of double six rolls
        int doubles = 0; // Number of doubles (of any kind) rolled

        // Task #3: Initialize two Dice objects
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(6);
        // TASK #4 Enter your code for the algorithm here

        for (int rounds = 0; rounds <= totalRounds; rounds++) {
            die1.roll();
            die2.roll();
            if (die1.getValue() == die2.getValue()) {
                doubles++;
                if (die1.getValue() == 1) {
                    snakeEyes++;
                }
                if (die1.getValue() == 2) {
                    twos++;
                }
                if (die1.getValue() == 3) {
                    threes++;
                }
                if (die1.getValue() == 4) {
                    fours++;
                }
                if (die1.getValue() == 5) {
                    fives++;
                }
                if (die1.getValue() == 6) {
                    sixes++;
                }
            }
        }
        // Display the results
        System.out.println("Results of For Loop:");
        doubles = (snakeEyes + twos + threes + fours + fives + sixes);
        printResults(snakeEyes, twos, threes, fours, fives, sixes, doubles, totalRounds);

        // TASK #6 Enter your code using a while loop here
        // Hint: Don't forget to reinitialize certain variables back to 0!
        // And don't forget to print the results out!
        int rounds = 0;
        while (rounds <= totalRounds) {
            {
                die1.roll();
                die2.roll();
                if (die1.getValue() == die2.getValue()) {
                    doubles++;
                    if (die1.getValue() == 1) {
                        snakeEyes++;
                    }
                    if (die1.getValue() == 2) {
                        twos++;
                    }
                    if (die1.getValue() == 3) {
                        threes++;
                    }
                    if (die1.getValue() == 4) {
                        fours++;
                    }
                    if (die1.getValue() == 5) {
                        fives++;
                    }
                    if (die1.getValue() == 6) {
                        sixes++;
                    }
                }
            }
            rounds++;
        }
        // Display the results of the while loop
        System.out.println("\nResults of while Loop:");
        doubles = (snakeEyes + twos + threes + fours + fives + sixes);
        printResults(snakeEyes, twos, threes, fours, fives, sixes, doubles, totalRounds);
        // TASK #7 Enter your code using a do-while loop here
        // Hint: Don't forget to reinitialize certain variables back to 0!
        // And don't forget to print the results out!
        rounds = 0;
        do {
            die1.roll();
            die2.roll();
            if (die1.getValue() == die2.getValue()) {
                doubles++;
                if (die1.getValue() == 1) {
                    snakeEyes++;
                }
                if (die1.getValue() == 2) {
                    twos++;
                }
                if (die1.getValue() == 3) {
                    threes++;
                }
                if (die1.getValue() == 4) {
                    fours++;
                }
                if (die1.getValue() == 5) {
                    fives++;
                }
                if (die1.getValue() == 6) {
                    sixes++;
                }
            }
            rounds++;
        } while (rounds <= totalRounds);

        // Display the results of the do-while loop
        System.out.println("\nResults of do-while Loop:");
        doubles = (snakeEyes + twos + threes + fours + fives + sixes);
        printResults(snakeEyes, twos, threes, fours, fives, sixes, doubles, totalRounds);
    }

    /***
     * Prints the totals from all the rounds
     * 
     * @param snakeEyes   Number of times we saw 1,1
     * @param twos        Number of times we saw 2,2
     * @param threes      Number of times we saw 3,3
     * @param fours       Number of times we saw 4,4
     * @param fives       Number of times we saw 5,5
     * @param sixes       Number of times we saw 6,6
     * @param doubles     Number of times we saw doubles of any kind
     * @param totalRounds Number of rounds
     */
    public static void printResults(int snakeEyes, int twos, int threes, int fours, int fives, int sixes, int doubles,
            int totalRounds) {

        System.out.printf("You rolled snake eyes %d out of %d rolls.\n" + "You rolled double twos %d out of %d rolls.\n"
                + "You rolled double threes %d out of %d rolls.\n" + "You rolled double fours %d out of %d rolls.\n"
                + "You rolled double fives %d out of %d rolls.\n" + "You rolled double sixes %d out of %d rolls.\n"
                + "You didn't roll doubles on %d out of %d rolls.\n", snakeEyes, totalRounds, twos, totalRounds, threes,
                totalRounds, fours, totalRounds, fives, totalRounds, sixes, totalRounds, (totalRounds - doubles),
                totalRounds);

        // Task#5: Calculate the approximate probabilities!
        System.out.printf("This suggests the probability of getting doubles is about %.2f%%,\n", doubles / 100.0);

        System.out.printf("and that the probability of NOT getting doubles is about %.2f%%.\n",
                (totalRounds - doubles) / 100.0);

    }

}
