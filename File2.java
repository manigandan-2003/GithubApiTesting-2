import java.io.FileWriter; 
import java.io.IOException; 

class File2 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("prime_numbers.txt")) {
            for (int i = 2; i <= 100; i++) { // You can adjust the range as needed
                if (isPrime(i)) {
                    fileWriter.write(i + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}