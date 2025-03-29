import java.util.Random;
import java.util.Scanner;

class File2 {
    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println("2 + 2 = " + obj.add(2, 2));

        guessNumber(); // Start the number guessing game
    }

    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates random number between 1 and 100
        int attempts = 0;
        int guess;

        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Take a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }
        scanner.close();
    }
}