import java.io.FileWriter; 
import java.io.IOException;

public class PrimeFinder {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("primes.txt")) {
            for (int i = 2; i <= 100; i++) { // Adjust the range as needed
                if (isPrime(i)) {
                    writer.write(i + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}