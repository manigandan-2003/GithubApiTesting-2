import java.util.Random;

class File2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 100; // You can change this range
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Guessed number between " + min + " and " + max + ": " + randomNumber);
    }
}