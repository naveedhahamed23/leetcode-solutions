import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 448 - Find All Numbers Disappeared in an Array
 *
 * Problem:
 * Given an array nums of size n where:
 *
 * - 1 <= nums[i] <= n
 *
 * Return all numbers in the range [1, n]
 * that do not appear in nums.
 *
 * Approach:
 * Index Marking Technique
 *
 * 1. Traverse the array
 * 2. Use each value as an index
 * 3. Mark visited indices as negative
 * 4. Traverse again:
 *      positive indices indicate missing numbers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * (excluding output list)
 */

class Solution {

    public List<Integer> findDisappearedNumbers(
            int[] nums
    ) {

        List<Integer> answer =
                new ArrayList<>();

        // Mark visited indices
        for (int i = 0; i < nums.length; i++) {

            int index =
                    Math.abs(nums[i]);

            // Mark as visited
            if (nums[index - 1] > 0) {

                nums[index - 1] *= -1;
            }
        }

        // Positive indices are missing
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {

                answer.add(i + 1);
            }
        }

        return answer;
    }
}
