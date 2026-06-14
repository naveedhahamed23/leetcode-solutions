/**
 * Check Good Integer
 *
 * Problem:
 * Given an integer n,
 * calculate:
 *
 *     sum of squares of digits
 *     -
 *     sum of digits
 *
 * Return true if the result is
 * greater than or equal to 50,
 * otherwise return false.
 *
 * Approach:
 * 1. Compute the sum of digits
 * 2. Compute the sum of squares of digits
 * 3. Compare:
 *
 *      squareSum - digitSum >= 50
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 *
 * where d = number of digits
 */

class Solution {

    public boolean checkGoodInteger(int n) {

        return squareSum(n) - digitSum(n) >= 50;
    }

    private static int digitSum(int n) {

        int sum = 0;

        while (n > 0) {

            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    private static int squareSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += digit * digit;

            n /= 10;
        }

        return sum;
    }
}
