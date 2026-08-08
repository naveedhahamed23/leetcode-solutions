/**
 * LeetCode 1295 - Find Numbers with Even Number of Digits
 *
 * Problem:
 * Given an integer array nums, return the number of integers that contain
 * an even number of digits.
 *
 * Approach:
 * 1. Traverse each number in the array.
 * 2. Count the number of digits using modulo (%) and division (/).
 * 3. If the digit count is even, increment the total count.
 * 4. Return the total count.
 *
 * Time Complexity: O(n * d)
 * Space Complexity: O(1)
 *
 * where n is the number of elements and d is the number of digits
 * in each number.
 */

class Solution {

    public int findNumbers(int[] nums) {

        int totalCount = 0;

        for (int num : nums) {

            int count = 0;

            while (num > 0) {
                count++;
                num /= 10;
            }

            if (count % 2 == 0) {
                totalCount++;
            }
        }

        return totalCount;
    }
}
