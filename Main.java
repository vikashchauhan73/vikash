public class Main {

    public static double myPow(double x, int n) {

        long y = n;

        if (y < 0) {
            x = 1 / x;
            y = -y;
        }

        return f(x, y);
    }

    public static double f(double x, long y) {

        if (y == 0) {
            return 1;
        }

        double half = f(x, y / 2);

        if (y % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }

    public static void main(String[] args) {

        double x = 2;
        int n = 10;

        double result = myPow(x, n);

        System.out.println("Answer = " + result);
    }
}