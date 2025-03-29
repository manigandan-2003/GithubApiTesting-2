import java.util.Random;
import java.util.Scanner;

class File2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}