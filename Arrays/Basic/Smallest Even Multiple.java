/**
 * LeetCode 2413 - Smallest Even Multiple
 *
 * Problem:
 * Given a positive integer n,
 * return the smallest positive integer
 * that is a multiple of both n and 2.
 *
 * Approach:
 * Mathematical Observation
 *
 * - If n is even, it is already divisible by 2.
 *   Therefore, the answer is n.
 *
 * - If n is odd, multiply it by 2 to obtain
 *   the smallest even multiple.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int smallestEvenMultiple(int n) {

        if (n % 2 == 0) {
            return n;
        }

        return n * 2;
    }
}
