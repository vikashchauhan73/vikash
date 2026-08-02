import java.util.Scanner;

public class Climb70 {

    public static int climbStairs(int n) {

        if (n <= 0) {
            return 0;
        }

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        int result = climbStairs(n);

        System.out.println("Number of ways = " + result);

        sc.close();
    }
}