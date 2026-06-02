/***
 * LeetCode 2843 - Count Symmetric Integers
 *
 * Problem:
 * A number is symmetric if:
 *
 * 1. It has an even number of digits
 * 2. Sum of first half digits
 *    equals sum of second half digits
 *
 * Given low and high,
 * return the count of symmetric integers
 * in the range [low, high].
 *
 * Approach:
 * 1. Traverse all numbers from low to high
 * 2. Convert each number to string
 * 3. Ignore numbers with odd digit length
 * 4. Compute:
 *      - left half digit sum
 *      - right half digit sum
 * 5. Count numbers where both sums are equal
 *
 * Time Complexity: O(n × d)
 * where d = number of digits
 *
 * Space Complexity: O(d)
 */

class Solution {

    public int countSymmetricIntegers(
            int low,
            int high
    ) {

        int count = 0;

        // Traverse range
        for (int number = low;
             number <= high;
             number++) {

            if (isSymmetric(number)) {

                count++;
            }
        }

        return count;
    }

    // Check whether number is symmetric
    private boolean isSymmetric(int number) {

        String str =
                Integer.toString(number);

        int length = str.length();

        // Odd digit count cannot be symmetric
        if (length % 2 != 0) {

            return false;
        }

        int leftSum = 0;
        int rightSum = 0;

        int half = length / 2;

        // Calculate digit sums
        for (int i = 0; i < half; i++) {

            leftSum += str.charAt(i) - '0';

            rightSum +=
                    str.charAt(i + half) - '0';
        }

        return leftSum == rightSum;
    }
}
