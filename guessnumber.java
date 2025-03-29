import java.util.Random;
import java.util.Scanner;

public class guessnumber {

    public void playGame(int min, int max) {
        Random random = new Random();
        int numberToGuess = random.nextInt(max - min + 1) + min;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("I'm thinking of a number between " + min + " and " + max + ".");

        do {
            System.out.print("Take a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }

    public static void main(String[] args) {
        guessnumber game = new guessnumber();
        game.playGame(1, 100);
    }
}
