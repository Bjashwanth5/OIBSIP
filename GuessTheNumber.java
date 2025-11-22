import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        // Create input and random number objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int userGuess;

        System.out.println("🎯 Welcome to the Guess the Number Game!");
        System.out.println("I’ve chosen a number between 1 and 100 — can you guess it?");

        // Game loop
        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try a higher number.\n");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try a lower number.\n");
            } else {
                System.out.println("\n🎉 Congratulations! You guessed it in " + attempts + " attempts.");
                break;
            }
        }
        scanner.close();
        System.out.println("Thanks for playing!");
    }
}
