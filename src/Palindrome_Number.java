/* 20/05/2022

9. Palindrome Number

Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
*/

public class Palindrome_Number {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1011));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if (s.length() == 1) return true;
        boolean b = false;

        for (int i = 0; i < (s.length()/2); i++) {
            b = (s.charAt(i) == s.charAt(s.length() - 1 - i));
            if (!b) return false;
        }
        return b;
    }
}
