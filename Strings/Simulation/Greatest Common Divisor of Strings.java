/**
 * LeetCode 1071 - Greatest Common Divisor of Strings
 *
 * Problem:
 * Given two strings str1 and str2, return the
 * largest string that divides both strings.
 *
 * A string x divides a string y if y can be
 * formed by concatenating x one or more times.
 *
 * Approach:
 * Mathematical Observation + Euclid's Algorithm
 *
 * 1. Check whether both strings are formed by
 *    the same repeating pattern.
 *    If (str1 + str2) != (str2 + str1),
 *    no common divisor exists.
 * 2. Find the GCD of the two string lengths.
 * 3. The first gcdLength characters of str1
 *    form the greatest common divisor string.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

class Solution {

    public String gcdOfStrings(String str1, String str2) {

        // No common divisor string exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of string lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the common prefix
        return str1.substring(0, gcdLength);
    }

    // Euclid's Algorithm
    private int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
