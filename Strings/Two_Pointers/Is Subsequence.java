/**
 * LeetCode 392 - Is Subsequence
 *
 * Problem:
 * Given two strings s and t,
 * determine whether s is a subsequence of t.
 *
 * A subsequence can be formed by deleting
 * some (or no) characters from a string
 * without changing the relative order
 * of the remaining characters.
 *
 * Approach:
 * Two Pointers
 *
 * 1. Use one pointer for s
 * 2. Use another pointer for t
 * 3. Traverse t from left to right
 * 4. Whenever characters match:
 *      move pointer in s
 * 5. If pointer in s reaches the end,
 *      s is a subsequence of t
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * where n = length of t
 */

class Solution {

    public boolean isSubsequence(
            String s,
            String t
    ) {

        // Empty string is always a subsequence
        if (s.length() == 0) {

            return true;
        }

        int sPointer = 0;
        int tPointer = 0;

        while (tPointer < t.length()) {

            if (s.charAt(sPointer)
                    ==
                t.charAt(tPointer)) {

                sPointer++;
            }

            // All characters matched
            if (sPointer == s.length()) {

                return true;
            }

            tPointer++;
        }

        return false;
    }
}
