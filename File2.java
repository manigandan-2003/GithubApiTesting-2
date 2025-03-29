import java.util.Random;
import java.util.Scanner;

class File2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange, maxRange, guess, randomNumber;

        System.out.print("Enter the minimum range: ");
        minRange = scanner.nextInt();
        System.out.print("Enter the maximum range: ");
        maxRange = scanner.nextInt();

        randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        System.out.println("Guess a number between " + minRange + " and " + maxRange + ":");

        do {
            guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number.");
        scanner.close();
    }
}