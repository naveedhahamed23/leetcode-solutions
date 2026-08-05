/**
 * LeetCode 1480 - Running Sum of 1d Array
 *
 * Problem:
 * Given an array nums, return the running sum of the array.
 *
 * The running sum at index i is defined as:
 * nums[0] + nums[1] + ... + nums[i].
 *
 * Approach:
 * 1. Start from the second element.
 * 2. Add the previous running sum to the current element.
 * 3. Update the current element in-place.
 * 4. Return the modified array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
