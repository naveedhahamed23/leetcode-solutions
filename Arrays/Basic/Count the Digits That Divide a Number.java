/**
 * LeetCode 2520 - Count the Digits That Divide a Number
 *
 * Problem:
 * Given an integer num, count how many of its digits
 * evenly divide the number itself.
 *
 * Approach:
 * 1. Store the original number.
 * 2. Extract each digit using modulo (% 10).
 * 3. Ignore digit 0 to avoid division by zero.
 * 4. If the original number is divisible by the digit,
 *    increment the count.
 * 5. Remove the last digit and continue.
 *
 * Time Complexity: O(log10 n)
 * Space Complexity: O(1)
 */

class Solution {

    public int countDigits(int num) {

        int original = num;
        int count = 0;

        while (num != 0) {

            int digit = num % 10;

            if (digit != 0 && original % digit == 0) {
                count++;
            }

            num /= 10;
        }

        return count;
    }
}
