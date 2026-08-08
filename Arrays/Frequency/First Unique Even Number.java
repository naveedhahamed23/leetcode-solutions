/**
 * LeetCode - First Unique Even Number
 *
 * Problem:
 * Given an integer array nums, find the first even number that appears
 * exactly once in the array.
 *
 * Return -1 if there is no unique even number.
 *
 * Approach:
 * 1. Use a frequency array to count how many times each number appears.
 * 2. Traverse the array again in its original order.
 * 3. If the current number is even and its frequency is exactly 1,
 *    return it.
 * 4. If no unique even number exists, return -1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Note:
 * The frequency array has a fixed size of 101 based on the given
 * constraint that the values are within the range 0 to 100.
 */

class Solution {

    public int firstUniqueEven(int[] nums) {

        int[] count = new int[101];

        // Count frequency of each number
        for (int num : nums) {
            count[num]++;
        }

        // Find the first unique even number
        for (int num : nums) {
            if (num % 2 == 0 && count[num] == 1) {
                return num;
            }
        }

        return -1;
    }
}
