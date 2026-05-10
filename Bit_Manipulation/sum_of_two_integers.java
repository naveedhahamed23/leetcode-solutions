/**
 * LeetCode 371 - Sum of Two Integers
 *
 * Problem:
 * Given two integers a and b,
 * return the sum of the two integers
 * without using the operators '+' and '-'.
 *
 * Approach:
 * 1. XOR (^) gives the sum without carry
 * 2. AND (&) finds carry bits
 * 3. Left shift carry by 1 position
 * 4. Repeat until there is no carry left
 *
 * Example:
 * a = 3  -> 011
 * b = 5  -> 101
 *
 * XOR  -> 110  (6)
 * Carry-> 010 << 1 = 100
 *
 * Repeat until carry becomes 0
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int getSum(int a, int b) {

        while (b != 0) {

            // Calculate carry
            int carry = (a & b) << 1;

            // Sum without carry
            a = a ^ b;

            // Update carry
            b = carry;
        }

        return a;
    }
}
