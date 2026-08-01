import java.util.Scanner;

public class numberoddeven1922{

    static long MOD = (long) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        long n = sc.nextLong();

        Solution obj = new Solution();
        int result = obj.countGoodNumbers(n);

        System.out.println("Answer = " + result);

        sc.close();
    }
}

class Solution {

    long MOD = (long) Math.pow(10, 9) + 7;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = (power(5, even) * power(4, odd)) % MOD;
        return (int) ans;
    }

    public long power(long x, long n) {
        long ans = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                ans = (ans * x) % MOD;
            }

            x = (x * x) % MOD;
            n = n / 2;
        }

        return ans;
    }
}