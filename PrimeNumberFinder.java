import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {

    public static List<Integer> findPrimesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    private static boolean isPrime(int n) {
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
        int end = 50;
        List<Integer> primes = findPrimesInRange(start, end);
        System.out.println("Prime numbers between " + start + " and " + end + ": " + primes);
    }
}