/**
 * LeetCode 152 - Maximum Product Subarray
 *
 * Problem:
 * Given an integer array nums, find the contiguous subarray
 * that has the largest product and return the product.
 *
 * Approach:
 * At every index, maintain:
 * - max: Maximum product ending at the current index.
 * - min: Minimum product ending at the current index.
 *
 * We need min because multiplying a negative number by another
 * negative number can produce a large positive product.
 *
 * If the current number is negative, max and min are swapped
 * before updating them.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(current, max * current);
            min = Math.min(current, min * current);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}
