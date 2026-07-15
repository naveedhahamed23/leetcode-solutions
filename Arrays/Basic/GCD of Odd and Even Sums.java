/**
 * LeetCode 3658 - GCD of Odd and Even Sums
 *
 * Problem:
 * Find the GCD of:
 * 1. Sum of the first n odd numbers.
 * 2. Sum of the first n even numbers.
 *
 * Mathematical Observation:
 *
 * Sum of first n odd numbers:
 *      n²
 *
 * Sum of first n even numbers:
 *      n(n + 1)
 *
 * gcd(n², n(n + 1))
 * = n × gcd(n, n + 1)
 *
 * Since consecutive integers are always coprime:
 *
 * gcd(n, n + 1) = 1
 *
 * Therefore:
 *
 * gcd(n², n(n + 1)) = n
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}
