import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        final int MIN = 1;
        final int MAX = 100;
        final int ATTEMPT_LIMIT = 7;
        final int NUM_ROUNDS = 3;
        
        int totalScore = 0;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Try to guess the number between " + MIN + " and " + MAX + ".");
        System.out.println("You have " + ATTEMPT_LIMIT + " attempts per round.\n");

        for (int round = 1; round <= NUM_ROUNDS; round++) {
            int secretNumber = rand.nextInt(MAX - MIN + 1) + MIN;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("----- Round " + round + " -----");

            while (attempts < ATTEMPT_LIMIT && !guessed) {
                System.out.print("Enter your guess: ");
                int guess;
                // Handle invalid input
                try {
                    guess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid integer!");
                    continue;
                }

                attempts++;

                if (guess == secretNumber) {
                    guessed = true;
                    int points = (ATTEMPT_LIMIT - attempts + 1) * 10;
                    totalScore += points;
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts.");
                    System.out.println("Points for this round: " + points);
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try a higher number.");
                } else {
                    System.out.println("Too high. Try a lower number.");
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + secretNumber);
                System.out.println("Points for this round: 0");
            }
            System.out.println();
        }

        System.out.println("Game Over!");
        System.out.println("Your total score: " + totalScore);
        scanner.close();
    }
}