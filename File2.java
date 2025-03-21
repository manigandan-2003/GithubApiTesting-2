import java.util.Random;

class File2{
    public static void guessNumber(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Guessed number between " + min + " and " + max + ": " + randomNumber);
    }
    
    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));
        guessNumber(1,100); //Example usage.  Change range as needed.
    }
}