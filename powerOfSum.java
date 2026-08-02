import java.util.Scanner;

public class powerOfSum {

    public boolean ispowerOfSum(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        powerOfSum obj = new powerOfSum();

        System.out.println(obj.ispowerOfSum(n));

        sc.close();
    }
}