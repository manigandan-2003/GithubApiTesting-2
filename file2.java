import java.util.Random;
import java.util.Scanner;

public class file2 {

    public static void guessNumber(int min, int max) {
        Random random = new Random();
        int secretNumber = random.nextInt(max - min + 1) + min;
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between " + min + " and " + max + ":");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        guessNumber(1, 100); // You can change the range here
    }
}
