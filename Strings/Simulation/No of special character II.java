/**
 * LeetCode 3121 - Count the Number of Special Characters II
 *
 * Problem:
 * A character is considered special if:
 *
 * 1. Both lowercase and uppercase forms exist
 * 2. Every lowercase occurrence appears
 *    before the first uppercase occurrence
 *
 * Return the number of special characters.
 *
 * Approach:
 * 1. Traverse characters from 'a' to 'z'
 * 2. Find:
 *      - last occurrence of lowercase character
 *      - first occurrence of uppercase character
 * 3. A character is special if:
 *      - both exist
 *      - lowercase appears before uppercase
 *
 * Time Complexity: O(26 × n)
 * Space Complexity: O(1)
 */

class Solution {

    public int numberOfSpecialChars(String word) {

        int count = 0;

        // Traverse lowercase letters
        for (char ch = 'a';
             ch <= 'z';
             ch++) {

            int lastLower =
                    word.lastIndexOf(ch);

            int firstUpper =
                    word.indexOf(
                            Character.toUpperCase(ch)
                    );

            // Valid special character
            if (lastLower != -1
                    &&
                firstUpper != -1
                    &&
                lastLower < firstUpper) {

                count++;
            }
        }

        return count;
    }
}
