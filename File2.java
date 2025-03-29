class File2{
    public static void main(String[] args) {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));

        // Call the number guessing game
        guessnumber numberGuesser = new guessnumber();
        numberGuesser.playGame(1, 100); // You can adjust the range here
    }
}