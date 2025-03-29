import java.util.Random;
import java.util.Scanner;

class File2 {

    public static void guessTheNumber(int min, int max) {
        Random random = new Random();
        int numberToGuess = random.nextInt(max - min + 1) + min;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("I'm thinking of a number between " + min + " and " + max + ".");

        while (true) {
            System.out.print("Take a guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));
        guessTheNumber(1, 100); // You can adjust the range here
    }
}