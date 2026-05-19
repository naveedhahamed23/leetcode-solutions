/**
 * LeetCode 2540 - Minimum Common Value
 *
 * Problem:
 * Given two sorted integer arrays nums1 and nums2,
 * return the minimum integer common to both arrays.
 *
 * If there is no common integer,
 * return -1.
 *
 * Approach:
 * Two Pointer Technique
 *
 * 1. Use two pointers:
 *    - i for nums1
 *    - j for nums2
 *
 * 2. Compare current elements:
 *    - If equal:
 *          return common value
 *    - If nums1[i] < nums2[j]:
 *          move i forward
 *    - Otherwise:
 *          move j forward
 *
 * 3. If no common value exists,
 *    return -1
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

class Solution {

    public int getCommon(
            int[] nums1,
            int[] nums2
    ) {

        int i = 0;
        int j = 0;

        // Traverse both arrays
        while (i < nums1.length &&
               j < nums2.length) {

            // Common value found
            if (nums1[i] == nums2[j]) {

                return nums1[i];
            }

            // Move smaller value pointer
            else if (nums1[i] < nums2[j]) {

                i++;
            }

            else {

                j++;
            }
        }

        return -1;
    }
}
