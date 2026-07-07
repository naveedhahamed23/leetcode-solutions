/**
 * Problem: Sum and Multiply
 *
 * Given an integer n:
 * 1. Remove all zero digits.
 * 2. Form a new number using the remaining digits
 *    while preserving their original order.
 * 3. Compute the sum of the non-zero digits.
 * 4. Return:
 *        newNumber × digitSum
 *
 * Approach:
 * 1. Traverse the digits from right to left.
 * 2. Ignore zeros.
 * 3. Construct the new number using place value.
 * 4. Simultaneously compute the sum of non-zero digits.
 * 5. Return the product of the new number and the digit sum.
 *
 * Example:
 * Input:  n = 10520
 *
 * New Number = 152
 * Digit Sum  = 1 + 5 + 2 = 8
 *
 * Output:
 * 152 × 8 = 1216
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 *
 * where d = number of digits in n.
 */

class Solution {

    public long sumAndMultiply(int n) {

        if (n <= 0) {
            return n;
        }

        long newNumber = 0;
        long digitSum = 0;
        long placeValue = 1;

        while (n > 0) {

            int digit = n % 10;

            if (digit != 0) {
                newNumber += digit * placeValue;
                digitSum += digit;
                placeValue *= 10;
            }

            n /= 10;
        }

        return newNumber * digitSum;
    }
}
