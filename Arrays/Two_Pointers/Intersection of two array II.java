import java.util.ArrayList;
import java.util.Arrays;

/**
 * LeetCode 350 - Intersection of Two Arrays II
 *
 * Problem:
 * Given two integer arrays nums1 and nums2,
 * return an array of their intersection.
 *
 * Each element in the result should appear
 * as many times as it appears in both arrays.
 *
 * The result may be returned in any order.
 *
 * Approach:
 * 1. Sort both arrays
 * 2. Use two pointers to traverse arrays
 * 3. If elements match:
 *      add to result list
 *      move both pointers
 * 4. Move pointer of smaller element forward
 * 5. Convert ArrayList into array
 *
 * Time Complexity:
 * O(n log n + m log m)
 *
 * Space Complexity:
 * O(min(n, m))
 */

class Solution {

    public int[] intersect(
            int[] nums1,
            int[] nums2
    ) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        ArrayList<Integer> list =
                new ArrayList<>();

        // Two-pointer traversal
        while (i < nums1.length &&
               j < nums2.length) {

            // Common element found
            if (nums1[i] == nums2[j]) {

                list.add(nums1[i]);

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

        // Convert list to array
        int[] result =
                new int[list.size()];

        for (int k = 0; k < list.size(); k++) {

            result[k] = list.get(k);
        }

        return result;
    }
}
