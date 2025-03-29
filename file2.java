import java.util.Random;
import java.util.Scanner;

class File2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange, maxRange, randomNumber, userGuess, attempts = 0;

        System.out.print("Enter the minimum range: ");
        minRange = scanner.nextInt();
        System.out.print("Enter the maximum range: ");
        maxRange = scanner.nextInt();

        randomNumber = random.nextInt(maxRange - minRange + 1) + minRange; // Generates random number within the range

        System.out.println("Guess a number between " + minRange + " and " + maxRange + ":");

        do {
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (userGuess != randomNumber);

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        scanner.close();
    }
}