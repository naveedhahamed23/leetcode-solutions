/**
 * LeetCode 3548 - Maximize Expression of Three Elements
 *
 * Problem:
 * Given an integer array nums, maximize the value:
 *
 *      largest + secondLargest - smallest
 *
 * by selecting three elements from the array.
 *
 * Approach:
 * Single Pass
 *
 * 1. Track the smallest element.
 * 2. Track the largest element.
 * 3. Track the second largest element.
 * 4. Return:
 *      largest + secondLargest - smallest
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maximizeExpressionOfThree(int[] nums) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : nums) {

            // Update smallest
            smallest = Math.min(smallest, value);

            // Update largest and second largest
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest) {
                secondLargest = value;
            }
        }

        return largest + secondLargest - smallest;
    }
}
