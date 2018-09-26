import java.util.Scanner;

public class DoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = scanner.next();

        if (isPalindrome(s))
            System.out.print("String is Palindrome!");
        else System.out.print("String not Palindrome!");

    }

    public static boolean isPalindrome(String s) {
        int length = s.length();
        int i = 0;
        boolean isLeng = (length == 0 || length == 1);

        if (isLeng) {
            return true;
        } else {
            if (s.charAt(i) == s.charAt(length - 1)) {
                i++;
                return isPalindrome(s.substring(i, length - 1));
            } else return false;
        }
    }
}
