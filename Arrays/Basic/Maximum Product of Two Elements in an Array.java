/**
 * LeetCode 1464 - Maximum Product of Two Elements in an Array
 *
 * Problem:
 * Given an integer array nums, choose two different indices i and j
 * such that the value of (nums[i] - 1) * (nums[j] - 1) is maximized.
 *
 * Approach:
 * 1. Sort the array in non-decreasing order.
 * 2. The two largest elements will be at the end of the sorted array.
 * 3. Compute the product:
 *      (largest - 1) * (secondLargest - 1)
 * 4. Return the result.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * (Ignoring the space used by the sorting algorithm.)
 */

import java.util.Arrays;

class Solution {

    public int maxProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }
}
