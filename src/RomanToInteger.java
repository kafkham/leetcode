/* 20/05/2022

13. Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII,
which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same
principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
*/

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCV"));
    }

    public static int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length()-1) {
                switch (s.charAt(i)) {
                    case 'I' -> total += 1;
                    case 'V' -> total += 5;
                    case 'X' -> total += 10;
                    case 'L' -> total += 50;
                    case 'C' -> total += 100;
                    case 'D' -> total += 500;
                    case 'M' -> total += 1000;
                }
            }
            else {
                switch (s.charAt(i)) {
                    case 'I' -> {
                        if (s.charAt(i + 1) == 'V') {
                            total += 4;
                            i++;
                            break;
                        }
                        if (s.charAt(i + 1) == 'X') {
                            total += 9;
                            i++;
                        } else total += 1;
                    }
                    case 'V' -> total += 5;
                    case 'X' -> {
                        if (s.charAt(i + 1) == 'L') {
                            total += 40;
                            i++;
                            break;
                        }
                        if (s.charAt(i + 1) == 'C') {
                            total += 90;
                            i++;
                        } else total += 10;
                    }
                    case 'L' -> total += 50;
                    case 'C' -> {
                        if (s.charAt(i + 1) == 'D') {
                            total += 400;
                            i++;
                            break;
                        }
                        if (s.charAt(i + 1) == 'M') {
                            total += 900;
                            i++;
                        } else total += 100;
                    }
                    case 'D' -> total += 500;
                    case 'M' -> total += 1000;
                }
            }
        }
        return total;
    }
}