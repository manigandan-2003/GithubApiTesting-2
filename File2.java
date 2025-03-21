import java.io.FileWriter; 
import java.io.IOException;
import java.util.ArrayList;

class File2 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = findPrimes(1, 100); // Adjust range as needed

        try (FileWriter writer = new FileWriter("primes.txt")) {
            for (int prime : primes) {
                writer.write(prime + "\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file:" + e.getMessage());
        }
    }

    public static ArrayList<Integer> findPrimes(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

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
}