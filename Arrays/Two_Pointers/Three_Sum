import java.util.*;

/**
 * LeetCode 15 - 3Sum
 *
 * Approach:
 * 1. Sort the array
 * 2. Fix one element at a time
 * 3. Use two pointers to find remaining two elements
 * 4. Skip duplicates to avoid repeated triplets
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1) excluding output list
 */

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // At least 3 elements are required
        if (nums.length < 3) {
            return result;
        }

        // Sort array for two-pointer approach
        Arrays.sort(nums);

        int n = nums.length;

        // Fix one element
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            // Two-pointer search
            while (left < right) {

                long sum = (long) nums[i] + nums[left] + nums[right];

                // Sum is smaller
                if (sum < 0) {
                    left++;
                }

                // Sum is larger
                else if (sum > 0) {
                    right--;
                }

                // Valid triplet found
                else {

                    result.add(
                        Arrays.asList(nums[i], nums[left], nums[right])
                    );

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right &&
                           nums[left] == nums[left - 1]) {

                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right + 1]) {

                        right--;
                    }
                }
            }
        }

        return result;
    }
}
