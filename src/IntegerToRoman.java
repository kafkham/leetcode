/* 20/05/2022

12. Integer to Roman

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply
X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same
principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.

Given an integer, convert it to a roman numeral.
*/

public class IntegerToRoman {

    static String s = "";

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {

        if (num / 1000 >= 1) {
            num = theMath(1000, num, "M");
        }
        if (num / 900 >= 1) {
            num = theMath(900, num, "CM");
        }
        if (num / 500 >= 1) {
            num = theMath(500, num, "D");
        }
        if (num / 400 >= 1) {
            num = theMath(400, num, "CD");
        }
        if (num / 100 >= 1) {
            num = theMath(100, num, "C");
        }
        if (num / 90 >= 1) {
            num = theMath(90, num, "XC");
        }
        if (num / 50 >= 1) {
            num = theMath(50, num, "L");
        }
        if (num / 40 >= 1) {
            num = theMath(40, num, "XL");
        }
        if (num / 10 >= 1) {
            num = theMath(10, num, "X");
        }
        if (num / 9 >= 1) {
            num = theMath(9, num, "IX");
        }
        if (num / 5 >= 1) {
            num = theMath(5, num, "V");
        }
        if (num / 4 >= 1) {
            num = theMath(4, num, "IV");
        }
        if (num / 1 >= 1) {
            num = theMath(1, num, "I");
        }
        return s;
    }

    public static int theMath(int value, int num, String c) {
        int numOfNums = num / value;
        for (int j = 0; j < numOfNums; j++) {
            s += c;
        }
        return num % value;
    }
}