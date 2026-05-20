/**
 * LeetCode 283 - Move Zeroes
 *
 * Problem:
 * Given an integer array nums,
 * move all 0's to the end of the array
 * while maintaining the relative order
 * of non-zero elements.
 *
 * The operation must be performed in-place.
 *
 * Approach:
 * 1. Maintain a position pointer for non-zero elements
 * 2. Traverse the array
 * 3. Whenever a non-zero element is found:
 *      place it at current position
 *      increment position pointer
 * 4. Fill remaining positions with zeros
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public void moveZeroes(int[] nums) {

        int position = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                nums[position] = nums[i];

                position++;
            }
        }

        // Fill remaining positions with zeros
        while (position < nums.length) {

            nums[position] = 0;

            position++;
        }
    }
}
