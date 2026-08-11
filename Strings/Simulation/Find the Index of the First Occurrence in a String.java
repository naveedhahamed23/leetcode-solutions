/**
 * LeetCode 28 - Find the Index of the First Occurrence in a String
 *
 * Problem:
 * Given two strings haystack and needle, return the index of the first
 * occurrence of needle in haystack.
 * Return -1 if needle does not occur in haystack.
 *
 * Approach:
 * 1. Get the lengths of haystack and needle.
 * 2. Traverse haystack only up to the point where needle can fully fit.
 * 3. Extract a substring of the same length as needle.
 * 4. Compare it with needle.
 * 5. Return the current index if they match.
 * 6. If no match is found, return -1.
 *
 * Time Complexity: O((h - n + 1) * n)
 * Space Complexity: O(n)
 *
 * where h is the length of haystack and n is the length of needle.
 */

class Solution {

    public int strStr(String haystack, String needle) {

        int h = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= h - n; i++) {

            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
