/**
 * LeetCode 3536 - Maximum Product of Two Digits
 *
 * Problem:
 * Given an integer n, find the two largest digits in the number
 * and return their product.
 *
 * Approach:
 * 1. Traverse each digit of the number using modulo (%) and division (/).
 * 2. Maintain the largest (firstMax) and second largest (secondMax) digits.
 * 3. If the current digit is greater than firstMax, update both maximums.
 * 4. Otherwise, if it is greater than secondMax, update secondMax.
 * 5. Return the product of the two largest digits.
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 *
 * where d is the number of digits in n.
 */

class Solution {

    public int maxProduct(int n) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        while (n > 0) {

            int digit = n % 10;

            if (digit > firstMax) {
                secondMax = firstMax;
                firstMax = digit;
            } else if (digit > secondMax) {
                secondMax = digit;
            }

            n /= 10;
        }

        return firstMax * secondMax;
    }
}
