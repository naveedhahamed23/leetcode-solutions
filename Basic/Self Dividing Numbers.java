/**
 * LeetCode 728 - Self Dividing Numbers
 *
 * Problem:
 * A self-dividing number is divisible by every
 * digit it contains.
 *
 * A self-dividing number cannot contain the digit 0.
 *
 * Return all self-dividing numbers in the
 * range [left, right].
 *
 * Approach:
 * 1. Iterate through every number in the range.
 * 2. Extract each digit using modulo (% 10).
 * 3. If a digit is 0 or does not divide the number,
 *    mark it as invalid.
 * 4. Otherwise, add the number to the result.
 *
 * Time Complexity: O((right - left + 1) × d)
 * Space Complexity: O(1)
 *
 * where d is the number of digits.
 */

import java.util.*;

class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        for (int number = left; number <= right; number++) {

            int temp = number;
            boolean isValid = true;

            while (temp != 0) {

                int digit = temp % 10;

                if (digit == 0 || number % digit != 0) {
                    isValid = false;
                    break;
                }

                temp /= 10;
            }

            if (isValid) {
                result.add(number);
            }
        }

        return result;
    }
}
