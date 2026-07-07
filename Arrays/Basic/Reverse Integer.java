/**
 * LeetCode 7 - Reverse Integer
 *
 * Problem:
 * Reverse the digits of a signed 32-bit integer.
 * If reversing the integer causes overflow,
 * return 0.
 *
 * Approach:
 * Mathematical Reversal
 *
 * 1. Extract the last digit using % 10.
 * 2. Before adding the digit, check whether
 *    multiplying the current answer by 10
 *    would overflow.
 * 3. If safe, append the digit.
 * 4. Continue until all digits are processed.
 *
 * Time Complexity: O(log10 n)
 * Space Complexity: O(1)
 */

class Solution {

    public int reverse(int x) {

        int ans = 0;

        while (x != 0) {

            int rem = x % 10;

            // Positive overflow
            if (ans > Integer.MAX_VALUE / 10 ||
               (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            // Negative overflow
            if (ans < Integer.MIN_VALUE / 10 ||
               (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            ans = ans * 10 + rem;
            x /= 10;
        }

        return ans;
    }
}
