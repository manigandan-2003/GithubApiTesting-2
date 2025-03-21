import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumbers {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int start = 2;
        int end = 100; // You can change the range here

        try (FileWriter writer = new FileWriter("primes.txt")) {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    writer.write(i + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}