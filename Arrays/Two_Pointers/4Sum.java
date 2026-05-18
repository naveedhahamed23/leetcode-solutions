import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 18 - 4Sum
 *
 * Problem:
 * Given an array nums of n integers,
 * return all unique quadruplets:
 *
 * [nums[a], nums[b], nums[c], nums[d]]
 *
 * such that:
 *
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 *
 * Approach:
 * 1. Sort the array
 * 2. Fix first two elements using nested loops
 * 3. Use two pointers for remaining two elements
 * 4. Skip duplicates to avoid repeated quadruplets
 * 5. Store valid quadruplets in result list
 *
 * Time Complexity: O(n³)
 * Space Complexity: O(1)
 * (excluding output list)
 */

class Solution {

    public List<List<Integer>> fourSum(
            int[] nums,
            int target
    ) {

        Arrays.sort(nums);

        List<List<Integer>> result =
                new ArrayList<>();

        int n = nums.length;

        // At least 4 elements required
        if (n < 4) {
            return result;
        }

        // Fix first element
        for (int i = 0; i < n - 3; i++) {

            // Skip duplicates
            if (i > 0 &&
                nums[i] == nums[i - 1]) {

                continue;
            }

            // Fix second element
            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicates
                if (j > i + 1 &&
                    nums[j] == nums[j - 1]) {

                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                // Two-pointer search
                while (left < right) {

                    long sum =
                            (long) nums[i]
                            + nums[j]
                            + nums[left]
                            + nums[right];

                    // Valid quadruplet found
                    if (sum == target) {

                        result.add(
                                Arrays.asList(
                                        nums[i],
                                        nums[j],
                                        nums[left],
                                        nums[right]
                                )
                        );

                        // Skip duplicate left values
                        while (left < right &&
                               nums[left] == nums[left + 1]) {

                            left++;
                        }

                        // Skip duplicate right values
                        while (left < right &&
                               nums[right] == nums[right - 1]) {

                            right--;
                        }

                        left++;
                        right--;
                    }

                    // Need larger sum
                    else if (sum < target) {

                        left++;
                    }

                    // Need smaller sum
                    else {

                        right--;
                    }
                }
            }
        }

        return result;
    }
}
