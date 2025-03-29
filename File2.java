// Existing working code in File2.java
public class File2 {

    public static void main(String[] args) {
        System.out.println("This is File2.java with working code.");
    }

    public void existingMethod() {
        System.out.println("Existing method in File2.java");
    }
}

// Adding new functionality: random number generation
import java.util.Random;

class RandomNumberGenerator {
    public int generateRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int randomNumber = generator.generateRandomNumber(100);
        System.out.println("Random number: " + randomNumber);
    }
}