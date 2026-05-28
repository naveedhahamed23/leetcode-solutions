/**
 * LeetCode 387 - First Unique Character in a String
 *
 * Problem:
 * Given a string s,
 * return the index of the first non-repeating character.
 *
 * If no such character exists,
 * return -1.
 *
 * Approach:
 * Frequency Counting
 *
 * 1. Use a frequency array to count occurrences
 *    of each character
 *
 * 2. Traverse the string again
 * 3. Return the first index whose frequency is 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int firstUniqChar(String s) {

        int[] frequency = new int[256];

        int n = s.length();

        // Count character frequencies
        for (int i = 0; i < n; i++) {

            frequency[s.charAt(i)]++;
        }

        // Find first unique character
        for (int i = 0; i < n; i++) {

            if (frequency[s.charAt(i)] == 1) {

                return i;
            }
        }

        return -1;
    }
}
