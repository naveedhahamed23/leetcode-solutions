/**
 * LeetCode 1358 - Number of Substrings Containing All Three Characters
 *
 * Problem:
 * Given a string consisting of only 'a', 'b', and 'c',
 * return the number of substrings containing at least
 * one occurrence of all three characters.
 *
 * Approach:
 * Last Seen Indices
 *
 * 1. Maintain the most recent index of 'a', 'b', and 'c'.
 * 2. For every character, update its last seen position.
 * 3. Once all three characters have appeared,
 *    the smallest last seen index determines how many
 *    valid substrings end at the current position.
 * 4. Add (minimum last seen index + 1) to the answer.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int numberOfSubstrings(String s) {

        int[] lastSeen = {-1, -1, -1};
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            lastSeen[s.charAt(i) - 'a'] = i;

            if (lastSeen[0] != -1 &&
                lastSeen[1] != -1 &&
                lastSeen[2] != -1) {

                int minIndex = Math.min(
                        lastSeen[0],
                        Math.min(lastSeen[1], lastSeen[2])
                );

                count += minIndex + 1;
            }
        }

        return count;
    }
}
