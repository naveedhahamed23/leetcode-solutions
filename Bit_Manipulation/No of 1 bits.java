/**
 * LeetCode 191 - Number of 1 Bits
 *
 * Problem:
 * Write a function that takes an unsigned integer
 * and returns the number of '1' bits
 * it has (also known as Hamming weight).
 *
 * Approach:
 * 1. Check the last bit using:
 *      n & 1
 *
 * 2. If last bit is 1:
 *      increment count
 *
 * 3. Unsigned right shift the number
 *      by one position
 *
 * 4. Repeat until all bits are processed
 *
 * Time Complexity: O(32)
 * Space Complexity: O(1)
 */

class Solution {

    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            // Check last bit
            if ((n & 1) == 1) {

                count++;
            }

            // Unsigned right shift
            n = n >>> 1;
        }

        return count;
    }
}
