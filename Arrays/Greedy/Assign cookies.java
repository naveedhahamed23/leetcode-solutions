import java.util.Arrays;

/**
 * LeetCode 455 - Assign Cookies
 *
 * Problem:
 * Assume you are an awesome parent
 * and want to give cookies to children.
 *
 * Each child has a greed factor g[i],
 * and each cookie has a size s[j].
 *
 * A child can be satisfied if:
 *
 *      s[j] >= g[i]
 *
 * Return the maximum number
 * of satisfied children.
 *
 * Approach:
 * Greedy + Sorting
 *
 * 1. Sort both greed factors and cookie sizes
 * 2. Use two pointers:
 *      - one for children
 *      - one for cookies
 *
 * 3. If current cookie can satisfy current child:
 *      move child pointer forward
 *
 * 4. Always move cookie pointer forward
 *
 * 5. Total satisfied children equals
 *    child pointer value
 *
 * Time Complexity:
 * O(n log n + m log m)
 *
 * Space Complexity: O(1)
 * (excluding sorting space)
 */

class Solution {

    public int findContentChildren(
            int[] g,
            int[] s
    ) {

        // Sort greed factors
        Arrays.sort(g);

        // Sort cookie sizes
        Arrays.sort(s);

        int childPointer = 0;
        int cookiePointer = 0;

        // Traverse children and cookies
        while (childPointer < g.length
                &&
               cookiePointer < s.length) {

            // Cookie satisfies child
            if (s[cookiePointer]
                    >=
                g[childPointer]) {

                childPointer++;
            }

            // Move to next cookie
            cookiePointer++;
        }

        return childPointer;
    }
}
