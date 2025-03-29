import java.util.Random;

public class File2 {
    public static int guessnumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));
        int randomNumber = guessnumber(1, 100); // Guess a number between 1 and 100
        System.out.println("Random number between 1 and 100: " + randomNumber);
    }
}