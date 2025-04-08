// Step 1: Create a new file named 'NumberGuesser.java'.
// Step 2: Define a class named 'NumberGuesser' in 'NumberGuesser.java'.
public class NumberGuesser {

    // Step 3: Inside the NumberGuesser class, create a method named 'guessNumber' that takes the minimum and maximum range as input.
    public int guessNumber(int min, int max) {
        // Step 4: Within the 'guessNumber' method, implement the logic to guess a random number between the given range using Math.random().
        // Ensure min is less than max
        if (min >= max) {
            throw new IllegalArgumentException("Min must be less than max");
        }

        // Generate a random number within the range [min, max]
        int range = max - min + 1;
        int randomNumber = (int) (Math.random() * range) + min;

        // Step 5: Return the guessed number from the 'guessNumber' method.
        return randomNumber;
    }
}