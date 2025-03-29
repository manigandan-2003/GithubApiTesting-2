import java.util.Random;

class File2 {
    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));

        // Calling guessNumber function from guessNumber.js (requires a JavaScript environment)
        // This part needs a bridge between Java and JavaScript (e.g., using a scripting engine like Nashorn (deprecated) or GraalVM)
        // Example using a hypothetical JavaScript integration:
        // int guessedNumber = callJavascriptFunction("guessNumber", 1, 100);
        // System.out.println("Guessed Number: " + guessedNumber);
    }
}