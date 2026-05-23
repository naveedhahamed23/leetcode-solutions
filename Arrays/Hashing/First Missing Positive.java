import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 41 - First Missing Positive
 *
 * Problem:
 * Given an unsorted integer array nums,
 * return the smallest missing positive integer.
 *
 * The algorithm should ideally run in:
 * - O(n) time
 * - O(1) extra space
 *
 * Approach:
 * HashSet
 *
 * 1. Store all elements in a HashSet
 * 2. Start checking from 1
 * 3. Keep incrementing while number exists
 * 4. First missing positive integer is the answer
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public int firstMissingPositive(int[] nums) {

        Set<Integer> set =
                new HashSet<>();

        // Store all elements
        for (int num : nums) {

            set.add(num);
        }

        int smallestPositive = 1;

        // Find first missing positive
        while (set.contains(smallestPositive)) {

            smallestPositive++;
        }

        return smallestPositive;
    }
}
