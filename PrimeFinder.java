import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        try (FileWriter writer = new FileWriter("primes.txt")) {
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isPrime(i)) {
                    writer.write(i + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
        scanner.close();
    }
}