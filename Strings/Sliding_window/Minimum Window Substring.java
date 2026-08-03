// Problem: 76. Minimum Window Substring
// Link: https://leetcode.com/problems/minimum-window-substring/
// Difficulty: Hard

// Approach:
// Use the Sliding Window technique with two frequency arrays.
// Store the frequency of characters in the target string.
// Expand the window by moving the right pointer.
// Once all required characters are present, shrink the window
// from the left to find the smallest valid substring.
// Track the minimum window length and starting index.

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        int[] targetCount = new int[128];
        for (char c : t.toCharArray()) {
            targetCount[c]++;
        }

        char[] sChar = s.toCharArray();
        int[] window = new int[128];

        int required = 0;
        for (int count : targetCount) {
            if (count > 0) {
                required++;
            }
        }

        int formed = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < sChar.length; right++) {
            char c = sChar[right];
            window[c]++;

            if (targetCount[c] > 0 && window[c] == targetCount[c]) {
                formed++;
            }

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = sChar[left];
                window[leftChar]--;

                if (targetCount[leftChar] > 0 &&
                    window[leftChar] < targetCount[leftChar]) {
                    formed--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
