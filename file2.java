import java.util.Random;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int guess;

        System.out.println("Guess a number between " + lowerBound + " and " + upperBound);

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else{
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (guess != randomNumber);
        scanner.close();
    }
}