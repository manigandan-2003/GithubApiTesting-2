import java.util.Random;
import java.util.Scanner;

public class File2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int numberOfGuesses = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}