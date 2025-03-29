import java.util.Random;
import java.util.Scanner;

public class File2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
        int numberOfTries = 5; // You can adjust the number of tries

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

        while (numberOfTries > 0) {
            System.out.println("You have " + numberOfTries + " tries left.");
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number " + numberToGuess + "!");
                return; // End the game
            }

            numberOfTries--;
        }

        System.out.println("You ran out of tries. The number was " + numberToGuess + ".");
        scanner.close();
    }
}