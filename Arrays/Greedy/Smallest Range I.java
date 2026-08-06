/**
 * LeetCode 908 - Smallest Range I
 *
 * Problem:
 * Given an integer array nums and an integer k, you may add or subtract
 * k from each element exactly once.
 *
 * Return the minimum possible difference between the maximum and minimum
 * values of the array after the modification.
 *
 * Approach:
 * 1. Find the minimum and maximum elements in the array.
 * 2. After modification:
 *    - The minimum value can increase by at most k.
 *    - The maximum value can decrease by at most k.
 * 3. The new range becomes:
 *      (max - k) - (min + k)
 *      = max - min - 2 * k
 * 4. If the range becomes negative, return 0 since the minimum difference
 *    cannot be negative.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int smallestRangeI(int[] nums, int k) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return Math.max(0, max - min - 2 * k);
    }
}
