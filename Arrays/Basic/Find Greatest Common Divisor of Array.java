/**
 * LeetCode 1979 - Find Greatest Common Divisor of Array
 *
 * Problem:
 * Given an integer array nums,
 * return the greatest common divisor (GCD)
 * of the smallest and largest elements.
 *
 * Approach:
 * 1. Traverse the array to find the
 *    minimum and maximum elements.
 * 2. Use Euclid's Algorithm to compute
 *    the GCD of the minimum and maximum.
 *
 * Euclid's Algorithm:
 * gcd(a, b)
 * = gcd(b, a % b)
 *
 * Repeat until b becomes 0.
 *
 * Time Complexity: O(n + log(max))
 * Space Complexity: O(1)
 */

class Solution {

    public int findGCD(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return gcd(max, min);
    }

    private int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
