/**
 * LeetCode 541 - Reverse String II
 *
 * Problem:
 * Given a string s and an integer k:
 *
 * - Reverse the first k characters
 *   for every 2k characters counting from the start
 *
 * - If remaining characters are fewer than k:
 *      reverse all remaining characters
 *
 * - If remaining characters are between k and 2k:
 *      reverse first k characters only
 *
 * Approach:
 * 1. Convert string into character array
 * 2. Traverse array in steps of 2k
 * 3. Reverse first k characters in each block
 * 4. Use two pointers for in-place reversal
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public String reverseStr(
            String s,
            int k
    ) {

        char[] arr = s.toCharArray();

        // Traverse every 2k block
        for (int i = 0;
             i < arr.length;
             i += 2 * k) {

            int left = i;

            int right =
                    Math.min(
                            i + k - 1,
                            arr.length - 1
                    );

            // Reverse characters
            while (left < right) {

                char temp = arr[left];

                arr[left] = arr[right];

                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
