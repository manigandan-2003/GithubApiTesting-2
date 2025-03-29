import java.util.Random;
import java.util.Scanner;

public class guessnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the minimum number of the range: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum number of the range: ");
        int max = scanner.nextInt();

        int randomNumber = random.nextInt(max - min + 1) + min;
        int guess;

        System.out.println("I'm thinking of a number between " + min + " and " + max + ".");

        do {
            System.out.print("Take a guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number.");
        scanner.close();
    }
}