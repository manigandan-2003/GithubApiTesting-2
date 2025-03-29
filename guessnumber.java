import java.util.Random;
import java.util.Scanner;

public class guessnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange, maxRange, randomNumber, guess;

        System.out.print("Enter the minimum range: ");
        minRange = scanner.nextInt();
        System.out.print("Enter the maximum range: ");
        maxRange = scanner.nextInt();

        if (minRange >= maxRange) {
            System.out.println("Invalid range. Minimum range must be less than maximum range.");
            return;
        }

        randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

        do {
            System.out.print("Take a guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " +  + " tries.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}