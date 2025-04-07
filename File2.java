class File2{
 public static void main(String[] args) {
 System.out.println(add(2, 2));
 } }

class File2{
    public static int add(int a, int b) {
        File1 file1 = new File1();
        return file1.add(a, b);
    }
    public static void main(String[] args) {
        System.out.println(add(2, 2));
    }
}