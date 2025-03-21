import java.io.FileWriter; 
import java.io.IOException;
import java.util.ArrayList;

public class File2 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = findPrimes(2, 100); // Adjust range as needed
        try (FileWriter writer = new FileWriter("primes.txt")) {
            for (int prime : primes) {
                writer.write(prime + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<Integer> findPrimes(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                primes.add(n);
            }
        }
        return primes;
    }

    static boolean isPrime(int n) {
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
}