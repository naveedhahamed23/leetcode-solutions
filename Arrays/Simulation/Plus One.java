/**
 * LeetCode 66 - Plus One
 *
 * Problem:
 * You are given a large integer represented
 * as an integer array digits,
 * where each digits[i] is a single digit.
 *
 * Increment the integer by one
 * and return the resulting array.
 *
 * Approach:
 * 1. Traverse digits from right to left
 * 2. If current digit is less than 9:
 *      increment it and return
 * 3. Otherwise:
 *      set current digit to 0
 *      and continue carry propagation
 * 4. If all digits become 0,
 *      create a new array with leading 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * (excluding output array)
 */

class Solution {

    public int[] plusOne(int[] digits) {

        // Traverse from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // No carry needed
            if (digits[i] < 9) {

                digits[i]++;

                return digits;
            }

            // Carry propagation
            digits[i] = 0;
        }

        // Case like 999 -> 1000
        int[] result =
                new int[digits.length + 1];

        result[0] = 1;

        return result;
    }
}
