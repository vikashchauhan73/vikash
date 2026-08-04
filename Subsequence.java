import java.util.Scanner;

public class Subsequence {

    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string (s): ");
        String s = sc.nextLine();

        System.out.print("Enter second string (t): ");
        String t = sc.nextLine();

        Subsequence obj = new Subsequence();

        boolean result = obj.isSubsequence(s, t);

        System.out.println("Result: " + result);

        sc.close();
    }
}