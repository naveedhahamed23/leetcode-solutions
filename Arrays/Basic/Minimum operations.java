/**
 * Minimum Operations
 *
 * Problem:
 * Given an integer array nums,
 * return the minimum number of operations needed
 * so that every element becomes divisible by 3.
 *
 * One operation is required for each element
 * that is not divisible by 3.
 *
 * Approach:
 * 1. Traverse the array
 * 2. Check whether each number is divisible by 3
 * 3. If not divisible:
 *      increment operation count
 * 4. Return total operations
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int minimumOperations(int[] nums) {

        int operations = 0;

        // Traverse array
        for (int num : nums) {

            // Not divisible by 3
            if (num % 3 != 0) {

                operations++;
            }
        }

        return operations;
    }
}
