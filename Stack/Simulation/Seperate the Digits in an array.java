import java.util.Stack;

/**
 * LeetCode 2553 - Separate the Digits in an Array
 *
 * Problem:
 * Given an array of positive integers nums,
 * separate the digits of each integer
 * in the same order they appear.
 *
 * Return an array containing all separated digits.
 *
 * Approach:
 * 1. Traverse array from right to left
 * 2. Extract digits using modulo and division
 * 3. Push digits into stack to preserve order
 * 4. Pop all elements into result array
 *
 * Time Complexity: O(n × d)
 * where d = number of digits
 *
 * Space Complexity: O(n × d)
 */

class Solution {

    public int[] separateDigits(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        int n = nums.length;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            int current = nums[i];

            // Extract digits
            while (current > 0) {

                stack.push(current % 10);

                current /= 10;
            }
        }

        // Build result array
        int[] result =
                new int[stack.size()];

        int index = 0;

        while (!stack.isEmpty()) {

            result[index++] = stack.pop();
        }

        return result;
    }
}
