/**
 * LeetCode 67 - Add Binary
 *
 * Problem:
 * Given two binary strings a and b,
 * return their sum as a binary string.
 *
 * Approach:
 * Binary Addition Simulation
 *
 * 1. Start from the last character of both strings.
 * 2. Add corresponding bits along with the carry.
 * 3. Append (sum % 2) to the result.
 * 4. Update carry as (sum / 2).
 * 5. Reverse the result since it is built
 *    from right to left.
 *
 * Time Complexity: O(max(n, m))
 * Space Complexity: O(max(n, m))
 */

class Solution {

    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}
