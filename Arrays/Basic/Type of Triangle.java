/**
 * LeetCode 3024 - Type of Triangle
 *
 * Problem:
 * Given an integer array nums of size 3, determine whether the three
 * side lengths can form a triangle.
 *
 * If they can form a triangle, return:
 * - "equilateral" if all three sides are equal.
 * - "isosceles" if exactly two sides are equal.
 * - "scalene" if all three sides are different.
 *
 * Otherwise, return "none".
 *
 * Approach:
 * 1. Check the triangle inequality:
 *    - a + b > c
 *    - a + c > b
 *    - b + c > a
 * 2. If any condition fails, the sides cannot form a triangle.
 * 3. If all three sides are equal, return "equilateral".
 * 4. If any two sides are equal, return "isosceles".
 * 5. Otherwise, return "scalene".
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public String triangleType(int[] nums) {

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        // Check triangle inequality
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        // All three sides are equal
        if (a == b && b == c) {
            return "equilateral";
        }

        // Exactly two sides are equal
        if (a == b || b == c || a == c) {
            return "isosceles";
        }

        // All three sides are different
        return "scalene";
    }
}
