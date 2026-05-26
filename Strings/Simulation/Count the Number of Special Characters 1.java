/**
 * LeetCode 3120 - Count the Number of Special Characters I
 *
 * Problem:
 * A character is considered special if:
 * - both its lowercase and uppercase forms
 *   appear in the string.
 *
 * Return the number of special characters in word.
 *
 * Approach:
 * 1. Traverse all uppercase English letters
 * 2. Convert each uppercase letter to lowercase
 * 3. Check whether both forms exist in the string
 * 4. Increment count if both are present
 *
 * Time Complexity: O(26 × n)
 * Space Complexity: O(1)
 */

class Solution {

    public int numberOfSpecialChars(String word) {

        String alphabets =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int count = 0;

        // Traverse uppercase letters
        for (int i = 0;
             i < alphabets.length();
             i++) {

            char upperChar =
                    alphabets.charAt(i);

            char lowerChar =
                    Character.toLowerCase(
                            upperChar
                    );

            // Check if both cases exist
            if (word.indexOf(upperChar) != -1
                    &&
                word.indexOf(lowerChar) != -1) {

                count++;
            }
        }

        return count;
    }
}
