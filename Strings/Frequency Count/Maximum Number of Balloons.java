/**
 * LeetCode 1189 - Maximum Number of Balloons
 *
 * Problem:
 * Given a string, determine the maximum number of
 * times the word "balloon" can be formed using
 * the characters in the string.
 *
 * Approach:
 * Frequency Counting
 *
 * 1. Count the occurrences of:
 *      b, a, l, o, n
 * 2. Since 'l' and 'o' appear twice in "balloon",
 *    divide their frequencies by 2.
 * 3. The answer is the minimum frequency among
 *    b, a, l, o and n.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxNumberOfBalloons(String text) {

        int[] freq = new int[5];

        // Count required characters
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == 'b') {
                freq[0]++;
            }
            else if (ch == 'a') {
                freq[1]++;
            }
            else if (ch == 'l') {
                freq[2]++;
            }
            else if (ch == 'o') {
                freq[3]++;
            }
            else if (ch == 'n') {
                freq[4]++;
            }
        }

        // 'l' and 'o' appear twice in "balloon"
        freq[2] /= 2;
        freq[3] /= 2;

        int answer = freq[0];

        for (int i = 1; i < 5; i++) {

            answer = Math.min(answer, freq[i]);
        }

        return answer;
    }
}
