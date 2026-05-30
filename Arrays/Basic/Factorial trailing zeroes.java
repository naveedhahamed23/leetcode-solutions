/**
 * LeetCode 172 - Factorial Trailing Zeroes
 *
 * Problem:
 * Given an integer n,
 * return the number of trailing zeroes in n!.
 *
 * Approach:
 * Counting Factors of 5
 *
 * 1. A trailing zero is formed by:
 *      2 × 5
 *
 * 2. In factorials, factors of 2 are always more frequent
 *    than factors of 5
 *
 * 3. Therefore, count the number of factors of 5
 *
 * 4. Repeatedly divide n by 5:
 *      - n / 5
 *      - n / 25
 *      - n / 125
 *      ...
 *
 * 5. Sum all quotients
 *
 * Time Complexity: O(log₅ n)
 * Space Complexity: O(1)
 */

class Solution {

    public int trailingZeroes(int n) {

        int count = 0;

        // Count factors of 5
        while (n > 0) {

            n = n / 5;

            count += n;
        }

        return count;
    }
}
