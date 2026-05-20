/**
 * LeetCode 167 - Two Sum II - Input Array Is Sorted
 *
 * Problem:
 * Given a 1-indexed array of integers numbers
 * sorted in non-decreasing order,
 * find two numbers such that:
 *
 * numbers[index1] + numbers[index2] == target
 *
 * Return the indices of the two numbers
 * (1-indexed).
 *
 * You may assume exactly one solution exists.
 *
 * Approach:
 * Two Pointer Technique
 *
 * 1. Place one pointer at beginning
 *    and another at end
 *
 * 2. Calculate current sum
 *
 * 3. If sum equals target:
 *      return indices
 *
 * 4. If sum is smaller than target:
 *      move left pointer forward
 *
 * 5. If sum is larger than target:
 *      move right pointer backward
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int[] twoSum(
            int[] numbers,
            int target
    ) {

        int left = 0;
        int right = numbers.length - 1;

        // Two-pointer traversal
        while (left < right) {

            int sum =
                    numbers[left]
                    + numbers[right];

            // Target found
            if (sum == target) {

                return new int[] {
                        left + 1,
                        right + 1
                };
            }

            // Need larger sum
            else if (sum < target) {

                left++;
            }

            // Need smaller sum
            else {

                right--;
            }
        }

        return new int[] {-1, -1};
    }
}
