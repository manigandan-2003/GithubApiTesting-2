class File2{
 public static void main(String[] args) {
  System.out.println(add(2, 2));
		// Step 1: Create an instance of the NumberGuesser class.
        NumberGuesser guesser = new NumberGuesser();

        // Step 2: Call the guessNumber method of the NumberGuesser instance with a specified range (e.g., 1 to 100).
        int guessedNumber = guesser.guessNumber(1, 100);

        // Step 3: Print the number guessed by the NumberGuesser along with any existing outputs.
        System.out.println("Guessed Number: " + guessedNumber);
 }
 }