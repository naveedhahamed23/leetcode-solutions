/**
 * Maximum Total Value
 *
 * Problem:
 * Given an integer array nums and an integer k,
 * find the maximum possible value difference
 * between the largest and smallest elements,
 * then multiply it by k.
 *
 * Return the maximum total value.
 *
 * Approach:
 * 1. Traverse the array
 * 2. Track:
 *      - minimum element
 *      - maximum element
 * 3. Calculate difference:
 *
 *      max - min
 *
 * 4. Multiply difference by k
 * 5. Return result as long
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public long maxTotalValue(
            int[] nums,
            int k
    ) {

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        // Find minimum and maximum
        for (int num : nums) {

            if (num < minimum) {

                minimum = num;
            }

            if (num > maximum) {

                maximum = num;
            }
        }

        long maxValue =
                (long) maximum - minimum;

        return maxValue * k;
    }
}
