import java.util.Random;

class File2 {
    public static int guessNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));
        int guess = guessNumber(1, 100);
        System.out.println("Guessed number between 1 and 100: " + guess);
    }
}