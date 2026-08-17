/**
 * LeetCode 443 - String Compression
 *
 * Problem:
 * Compress the given character array in-place.
 * For each group of consecutive repeating characters,
 * write the character followed by its count if the count
 * is greater than 1.
 *
 * Approach:
 * Use two pointers:
 * - right: Finds the end of each group.
 * - left: Writes the compressed result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) in the worst case due to
 * converting the count into a character array.
 */

class Solution {
    public int compress(char[] chars) {
        int left = 0;
        int right = 0;

        while (right < chars.length) {
            char current = chars[right];
            int start = right;

            while (right < chars.length && chars[right] == current) {
                right++;
            }

            chars[left++] = current;

            int count = right - start;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[left++] = c;
                }
            }
        }

        return left;
    }
}
