/**
 * LeetCode 4 - Median of Two Sorted Arrays
 *
 * Merge Approach
 *
 * Problem:
 * Given two sorted arrays nums1 and nums2,
 * return the median of the two sorted arrays.
 *
 * Approach:
 * 1. Merge both sorted arrays into a single array
 * 2. Use two pointers to maintain sorted order
 * 3. Find total length of merged array
 * 4. If total length is odd:
 *      return middle element
 * 5. If total length is even:
 *      return average of two middle elements
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(m + n)
 */

class Solution {

    public double findMedianSortedArrays(
            int[] nums1,
            int[] nums2
    ) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge arrays in sorted order
        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {

                merged[k++] = nums1[i++];
            }

            else {

                merged[k++] = nums2[j++];
            }
        }

        // Remaining elements from nums1
        while (i < m) {

            merged[k++] = nums1[i++];
        }

        // Remaining elements from nums2
        while (j < n) {

            merged[k++] = nums2[j++];
        }

        int totalLength = m + n;

        // Odd length
        if (totalLength % 2 == 1) {

            return merged[totalLength / 2];
        }

        // Even length
        return (
                merged[totalLength / 2]
                + merged[(totalLength / 2) - 1]
        ) / 2.0;
    }
}
