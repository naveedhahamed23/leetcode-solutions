/**
 * LeetCode 3731 - Find Missing Elements
 *
 * Problem:
 * Given an integer array nums, return all the missing integers
 * between the minimum and maximum values present in the array.
 *
 * Approach:
 * 1. Sort the array in ascending order.
 * 2. Traverse every integer from the minimum value to the maximum value.
 * 3. Compare the current integer with the current array element.
 *    - If they are equal, move to the next array element.
 *    - Otherwise, the current integer is missing.
 * 4. Store all missing integers in a list and return it.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * (excluding the output list)
 */

import java.util.*;

class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        int j = 0;

        for (int i = min; i < max; i++) {

            if (i != nums[j]) {
                list.add(i);
            } else {
                j++;
            }
        }

        return list;
    }
}
