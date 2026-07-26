/**
 * LeetCode 628 - Maximum Product of Three Numbers
 *
 * Problem:
 * Given an integer array nums, return the maximum product that can be
 * obtained from any three numbers in the array.
 *
 * Approach:
 * 1. Traverse the array once while maintaining:
 *    - Three largest numbers (firstMax, secondMax, thirdMax).
 *    - Two smallest numbers (firstMin, secondMin).
 * 2. The maximum product can be obtained in two ways:
 *    - Product of the three largest numbers.
 *    - Product of the two smallest (possibly negative) numbers and the largest number.
 * 3. Return the maximum of these two products.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maximumProduct(int[] nums) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax) {
                thirdMax = num;
            }

            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin) {
                secondMin = num;
            }
        }

        return Math.max(
                firstMax * secondMax * thirdMax,
                firstMin * secondMin * firstMax
        );
    }
}
