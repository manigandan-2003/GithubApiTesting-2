import java.util.Random;
import java.util.Scanner;

class File2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 5; // You can adjust the number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

        while (attempts > 0) {
            System.out.println("You have " + attempts + " attempts left.");
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + "!");
                return;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attempts--;
        }

        System.out.println("You ran out of attempts. The number was " + randomNumber + ".");
        scanner.close();
    }
}