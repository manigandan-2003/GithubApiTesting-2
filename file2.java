import java.util.Random;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        File1 file1 = new File1();

        int minRange = 1;
        int maxRange = 100;
        int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
        int numberOfTries = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                 //Demonstrate File1 usage:
                System.out.println("Sum of " + numberToGuess + " and " + numberOfTries + " is: " + file1.add(numberToGuess, numberOfTries));
                break;
            }
        }

        scanner.close();
    }
}
