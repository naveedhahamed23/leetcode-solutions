/**
 * LeetCode 2784 - Check if Array is Good
 *
 * Problem:
 * An array nums is considered good if:
 *
 * 1. It contains integers from 1 to n - 1 exactly once
 * 2. The integer n appears exactly twice
 *
 * Return true if nums is a good array,
 * otherwise return false.
 *
 * Approach:
 * 1. Find the maximum value in the array
 * 2. Verify array size equals n + 1
 * 3. Use a frequency array to count occurrences
 * 4. Check:
 *      - numbers 1 to n - 1 appear once
 *      - number n appears twice
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public boolean isGood(int[] nums) {

        int n = 0;

        // Find maximum value
        for (int num : nums) {

            n = Math.max(n, num);
        }

        // Size validation
        if (nums.length != n + 1) {

            return false;
        }

        // Frequency count
        int[] count = new int[n + 1];

        for (int num : nums) {

            count[num]++;
        }

        // Check numbers from 1 to n-1
        for (int i = 1; i < n; i++) {

            if (count[i] != 1) {

                return false;
            }
        }

        // Largest number must appear twice
        return count[n] == 2;
    }
}
