import java.util.Random;
import java.util.Scanner;

class File2 {
    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));

        guessNumber(1, 100); // Example: Guess a number between 1 and 100
    }

    public static void guessNumber(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(max - min + 1) + min;
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between " + min + " and " + max + ":");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }
}