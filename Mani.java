public class Mani {

    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0.0;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m * m == n) {
                return m;
            } else if (m * m < n) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.printf("%.3f", sqrt(2, 3));
    }
}
