/**
 * LeetCode 43 - Multiply Strings
 *
 * Problem:
 * Given two non-negative integers num1 and num2
 * represented as strings,
 * return their product as a string.
 *
 * Note:
 * - Do not use any built-in BigInteger library
 * - Do not convert the inputs directly to integers
 *
 * Approach:
 * 1. Simulate elementary school multiplication
 * 2. Multiply digits from right to left
 * 3. Store results in an integer array
 * 4. Handle carry using positional indices
 * 5. Build final answer using StringBuilder
 *
 * Time Complexity: O(m × n)
 * Space Complexity: O(m + n)
 */

class Solution {

    public String multiply(String num1, String num2) {

        // Edge case
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        // Maximum possible digits = m + n
        int[] result = new int[m + n];

        // Multiply digits from right to left
        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int multiplication =
                        digit1 * digit2;

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum =
                        multiplication + result[p2];

                // Store carry
                result[p1] += sum / 10;

                // Store current digit
                result[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        // Skip leading zeros
        for (int num : result) {

            if (sb.length() != 0 || num != 0) {

                sb.append(num);
            }
        }

        return sb.toString();
    }
}
