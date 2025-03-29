import java.util.Random;
import java.util.Scanner;

public class file2 {

    public static int guessNumber(int min, int max) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(max - min + 1) + min; // Generates random number within range [min, max]
        int guess;
        int attempts = 0;

        System.out.println("I'm thinking of a number between " + min + " and " + max + ".");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        scanner.close();
        return randomNumber; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum number: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum number: ");
        int max = scanner.nextInt();
        guessNumber(min, max);
        scanner.close();
    }
}