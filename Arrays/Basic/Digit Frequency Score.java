/**
 * Digit Frequency Score
 *
 * Problem:
 * Given an integer n,
 * calculate the sum of its digits
 * and return the result as the digit frequency score.
 *
 * Approach:
 * 1. Extract the last digit using modulo (% 10)
 * 2. Add the digit to score
 * 3. Remove the last digit using division (/ 10)
 * 4. Repeat until number becomes 0
 *
 * Time Complexity: O(d)
 * where d = number of digits
 *
 * Space Complexity: O(1)
 */

class Solution {

    public int digitFrequencyScore(int n) {

        int score = 0;

        // Extract digits
        while (n > 0) {

            score += n % 10;

            n = n / 10;
        }

        return score;
    }
}
