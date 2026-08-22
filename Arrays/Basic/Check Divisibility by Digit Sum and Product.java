/**
 * LeetCode 3622 - Check Divisibility by Digit Sum and Product
 *
 * Problem:
 * Check whether n is divisible by the sum of its digits
 * plus the product of its digits.
 *
 * Approach:
 * 1. Extract each digit using modulo 10.
 * 2. Calculate the digit sum.
 * 3. Calculate the digit product.
 * 4. Add the sum and product.
 * 5. Check whether n is divisible by the resulting value.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            sum += digit;
            product *= digit;

            temp /= 10;
        }

        int divisor = sum + product;

        return n % divisor == 0;
    }
}
