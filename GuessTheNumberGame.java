import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        int tries = 0;
        int guess;
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I've picked a number between 1 and 100. Let's see if you can find it.");
        do {
            System.out.print("Your guess: ");
            guess = input.nextInt();
            tries++;
            if (guess < target) {
                System.out.println("Too low, try again!");
            } else if (guess > target) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + tries + " attempts.");
            }
        } while (guess != target);
        input.close();
    }
}
