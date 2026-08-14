/**
 * LeetCode 2839 - Check if Strings Can be Made Equal With Operations I
 *
 * Problem:
 * Determine whether s1 can be transformed into s2 using the allowed
 * operation of swapping characters at indices that differ by 2.
 *
 * Approach:
 * Characters at even indices (0, 2) can only swap with each other.
 * Characters at odd indices (1, 3) can only swap with each other.
 *
 * Therefore, we check whether the characters at even positions can
 * be rearranged to match s2 and do the same for odd positions.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        boolean evenMatch =
                (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
                (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0));

        boolean oddMatch =
                (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
                (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1));

        return evenMatch && oddMatch;
    }
}
