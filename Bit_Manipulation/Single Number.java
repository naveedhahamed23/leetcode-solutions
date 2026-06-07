/**
 * LeetCode 136 - Single Number
 *
 * Problem:
 * Given a non-empty integer array nums,
 * every element appears twice except for one.
 *
 * Find that single element.
 *
 * Approach:
 * Bit Manipulation using XOR
 *
 * XOR Properties:
 *
 * 1. a ^ a = 0
 * 2. a ^ 0 = a
 * 3. XOR is commutative and associative
 *
 * Therefore:
 * duplicate numbers cancel each other,
 * leaving only the single number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int singleNumber(int[] nums) {

        int result = 0;

        // XOR all elements
        for (int num : nums) {

            result ^= num;
        }

        return result;
    }
}
