import java.util.Random;
import java.util.Scanner;

class File2 {
    public static void main(String[] args) {
        guessnumber();
    }

    static void guessnumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int guess;

        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

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