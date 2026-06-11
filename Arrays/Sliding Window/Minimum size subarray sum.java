/**
 * LeetCode 209 - Minimum Size Subarray Sum
 *
 * Problem:
 * Given an array of positive integers nums
 * and a positive integer target,
 * return the minimal length of a subarray
 * whose sum is greater than or equal to target.
 *
 * If no such subarray exists,
 * return 0.
 *
 * Approach:
 * Sliding Window
 *
 * 1. Expand the window using the right pointer
 * 2. Keep adding elements to current sum
 * 3. Once current sum >= target:
 *      - update minimum length
 *      - shrink window from the left
 * 4. Continue until entire array is processed
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int minSubArrayLen(
            int target,
            int[] nums
    ) {

        int left = 0;
        int currentSum = 0;

        int minLength =
                Integer.MAX_VALUE;

        // Expand window
        for (int right = 0;
             right < nums.length;
             right++) {

            currentSum += nums[right];

            // Shrink window
            while (currentSum >= target) {

                minLength = Math.min(
                        minLength,
                        right - left + 1
                );

                currentSum -= nums[left];

                left++;
            }
        }

        return minLength ==
                Integer.MAX_VALUE
                ? 0
                : minLength;
    }
}
