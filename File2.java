import java.util.Random;

class File2 {
    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));

        // Mimic guessNumber.js functionality in Java
        int min = 1;
        int max = 100;
        Random random = new Random();
        int guessedNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Guessed number (Java): " + guessedNumber);
    }
}