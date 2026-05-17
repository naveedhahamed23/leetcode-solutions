import java.util.HashSet;

/**
 * LeetCode 202 - Happy Number
 *
 * Problem:
 * A happy number is defined by the following process:
 *
 * 1. Replace the number by the sum of the squares
 *    of its digits
 * 2. Repeat the process until:
 *      - the number becomes 1
 *      - or the process enters a cycle
 *
 * Return true if n is a happy number,
 * otherwise return false.
 *
 * Approach:
 * 1. Use a HashSet to detect cycles
 * 2. Repeatedly calculate:
 *      sum of squares of digits
 * 3. If number becomes 1:
 *      return true
 * 4. If number repeats:
 *      cycle detected -> return false
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(log n)
 */

class Solution {

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            // Cycle detected
            if (set.contains(n)) {
                return false;
            }

            set.add(n);

            int sum = 0;

            // Calculate square sum of digits
            while (n > 0) {

                int digit = n % 10;

                sum += digit * digit;

                n /= 10;
            }

            n = sum;
        }

        return true;
    }
}
