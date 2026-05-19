import java.util.Arrays;
import java.util.HashSet;

/**
 * LeetCode 349 - Intersection of Two Arrays
 *
 * Problem:
 * Given two integer arrays nums1 and nums2,
 * return an array of their intersection.
 *
 * Each element in the result must be unique,
 * and the result may be returned in any order.
 *
 * Approach:
 * 1. Sort both arrays
 * 2. Use two pointers to traverse arrays
 * 3. If elements are equal:
 *      add to HashSet for uniqueness
 * 4. Move pointer of smaller element forward
 * 5. Convert HashSet into result array
 *
 * Time Complexity:
 * O(n log n + m log m)
 *
 * Space Complexity:
 * O(n)
 */

class Solution {

    public int[] intersection(
            int[] nums1,
            int[] nums2
    ) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashSet<Integer> set =
                new HashSet<>();

        int i = 0;
        int j = 0;

        // Two-pointer traversal
        while (i < nums1.length &&
               j < nums2.length) {

            // Common element found
            if (nums1[i] == nums2[j]) {

                set.add(nums1[i]);

                i++;
                j++;
            }

            // Move smaller pointer
            else if (nums1[i] < nums2[j]) {

                i++;
            }

            else {

                j++;
            }
        }

        // Convert set to array
        int[] result =
                new int[set.size()];

        int k = 0;

        for (Integer num : set) {

            result[k++] = num;
        }

        return result;
    }
}
