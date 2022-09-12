/* 25/05/2022

14. Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""

* */

public class longestCommonPrefix {
    public static void main(String[] args) {
        String [] strs ={"dog","dogecar","dogkcar"};
        System.out.println(findLongestCommonPrefix(strs));
    }

    public static String findLongestCommonPrefix(String[] strs) {

        String[] prefixes = new String[strs.length];

        boolean matchingPrefixes = true;

        while (matchingPrefixes) {
            for (int i = 0; i < strs.length; i++) {
                prefixes[i] = "" + strs[i].charAt(i);
            }
            for (int j = 0; j < prefixes.length; j++) {
                if (!(String.valueOf(prefixes[j]) == String.valueOf(prefixes[j+1]))) {
                    matchingPrefixes = false;
                }
            }
        }
        return "test";
    }
}