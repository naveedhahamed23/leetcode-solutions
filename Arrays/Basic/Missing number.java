/**
 * LeetCode 268 - Missing Number
 *
 * Problem:
 * Given an array nums containing n distinct numbers
 * in the range [0, n],
 * return the only number missing from the array.
 *
 * Approach:
 * Mathematical Sum Formula
 *
 * 1. Calculate expected sum of numbers from 0 to n:
 *
 *      n × (n + 1) / 2
 *
 * 2. Calculate actual sum of array elements
 *
 * 3. Missing number =
 *      expected sum - actual sum
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int actualSum = 0;

        // Expected sum from 0 to n
        int expectedSum =
                n * (n + 1) / 2;

        // Calculate actual array sum
        for (int num : nums) {

            actualSum += num;
        }

        // Missing number
        return expectedSum - actualSum;
    }
}
