/**
 * LeetCode 4000 - Largest Integer With Given Digit Sum
 *
 * Problem:
 * Given two integers n and s, construct the largest possible n-digit integer
 * whose digits sum to s.
 *
 * Return:
 * - The largest possible integer if it exists.
 * - 0 if s == 0.
 * - -1 if it is impossible to construct such an integer.
 *
 * Approach:
 * 1. Handle the edge cases:
 *    - If s == 0, return 0.
 *    - If s > 9 * n, it is impossible to form an n-digit number.
 * 2. Greedily place the largest possible digit at each position.
 * 3. For each digit:
 *    - Choose min(9, s).
 *    - Append it to the result.
 *    - Reduce the remaining digit sum.
 * 4. Continue until all n digits are constructed.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int largestInteger(int n, int s) {

        if (s == 0) {
            return 0;
        }

        if (s > 9 * n) {
            return -1;
        }

        int result = 0;

        for (int i = 0; i < n; i++) {

            int digit = Math.min(9, s);

            result = result * 10 + digit;

            s -= digit;
        }

        return result;
    }
}
