import java.util.Random;

public class File2 {

    /**
     * Generates a random number within the specified range (inclusive).
     * @param min The minimum value of the range.
     * @param max The maximum value of the range.
     * @return A random number between min and max (inclusive).
     */
    public int guessNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range: min must be less than or equal to max.");
        }

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        File2 numberGuesser = new File2();
        int minRange = 1;
        int maxRange = 100;
        int randomNumber = numberGuesser.guessNumber(minRange, maxRange);
        System.out.println("Guessed number between " + minRange + " and " + maxRange + ": " + randomNumber);
    }
}