import java.util.Random;
import java.util.Scanner;

public class guessnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
        int numberOfTries = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

        while (true) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            numberOfTries++;

            if (playerGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                break;
            } else if (playerGuess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}