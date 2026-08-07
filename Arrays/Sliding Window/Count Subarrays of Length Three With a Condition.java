/**
 * LeetCode 3392 - Count Subarrays of Length Three With a Condition
 *
 * Problem:
 * Given an integer array nums, count the number of subarrays of length 3
 * where the middle element is equal to twice the sum of the first and
 * third elements.
 *
 * Condition:
 * nums[i + 1] == 2 * (nums[i] + nums[i + 2])
 *
 * Approach:
 * 1. Traverse the array using a sliding window of size 3.
 * 2. For each window, calculate the sum of the first and third elements.
 * 3. Check if the middle element is equal to twice that sum.
 * 4. If the condition is satisfied, increment the count.
 * 5. Return the total count.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int countSubarrays(int[] nums) {

        if (nums.length < 3) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i + 1] == 2 * (nums[i] + nums[i + 2])) {
                count++;
            }
        }

        return count;
    }
}
