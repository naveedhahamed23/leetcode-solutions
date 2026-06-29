/**
 * LeetCode 1967 - Number of Strings That Appear as Substrings in Word
 *
 * Problem:
 * Given an array of strings patterns and a string word,
 * return the number of patterns that appear as
 * substrings in word.
 *
 * Approach:
 * String Matching
 *
 * 1. Traverse each pattern.
 * 2. Check whether it exists in word using contains().
 * 3. Count every matching pattern.
 *
 * Time Complexity: O(n × m)
 * where:
 * n = number of patterns
 * m = average pattern length (internally depends on contains())
 *
 * Space Complexity: O(1)
 */

class Solution {

    public int numOfStrings(String[] patterns, String word) {

        int count = 0;

        for (String pattern : patterns) {

            if (word.contains(pattern)) {
                count++;
            }
        }

        return count;
    }
}
