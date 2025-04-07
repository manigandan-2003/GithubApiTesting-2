class File2{
 public static void main(String[] args) {
 System.out.println(add(2, 2));
 } }

class File2 {
    public static int guessnumber(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }

    public static void main(String[] args) {
        int guessedNumber = guessnumber(1, 100);
        System.out.println("Guessed number: " + guessedNumber);
    }
}