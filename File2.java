import java.util.Random;

class File2 {
    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));

        // Call the number guessing function
        guessNumber(1, 100); // Example: Guess a number between 1 and 100
    }

    // Number guessing game function
    public static void guessNumber(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("I'm thinking of a number between " + min + " and " + max + ".");
        // You would typically add code here to get user input and compare it to randomNumber
        // For now, let's just print the number for demonstration purposes
        System.out.println("The number was: " + randomNumber);
    }
}