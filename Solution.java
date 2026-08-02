public class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int n = 6; 
        int result = solver.fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result); 
    }
}