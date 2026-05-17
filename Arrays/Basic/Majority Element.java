import java.util.Arrays;

/**
 * LeetCode 169 - Majority Element
 *
 * Problem:
 * Given an integer array nums of size n,
 * return the majority element.
 *
 * The majority element is the element
 * that appears more than ⌊n / 2⌋ times.
 *
 * You may assume that the majority element
 * always exists in the array.
 *
 * Approach:
 * Sorting
 *
 * 1. Sort the array
 * 2. The majority element will always occupy
 *    the middle position after sorting
 * 3. Return the middle element
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * (ignoring sorting space used internally)
 */

class Solution {

    public int majorityElement(int[] nums) {

        // Sort array
        Arrays.sort(nums);

        // Majority element always lies at middle
        return nums[nums.length / 2];
    }
}
