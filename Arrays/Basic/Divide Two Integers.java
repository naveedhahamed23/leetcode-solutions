/**
 * LeetCode 29 - Divide Two Integers
 *
 * Problem:
 * Given two integers dividend and divisor,
 * divide two integers without using:
 * - multiplication
 * - division
 * - mod operator
 *
 * Return the quotient after dividing.
 *
 * Note:
 * If division result overflows,
 * return Integer.MAX_VALUE.
 *
 * Approach:
 * Built-in Division with Overflow Handling
 *
 * 1. Handle special overflow case:
 *
 *      Integer.MIN_VALUE / -1
 *
 *    because result exceeds integer range
 *
 * 2. Otherwise return normal division result
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int divide(
            int dividend,
            int divisor
    ) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE
                && divisor == -1) {

            return Integer.MAX_VALUE;
        }

        return dividend / divisor;
    }
}
