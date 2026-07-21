/**
 * LeetCode 3000 - Maximum Area of Longest Diagonal Rectangle
 *
 * Problem:
 * Given a list of rectangles represented by
 * [length, width], return the area of the
 * rectangle having the longest diagonal.
 *
 * If multiple rectangles have the same
 * diagonal length, return the one with the
 * maximum area.
 *
 * Approach:
 * 1. Traverse each rectangle.
 * 2. Compute the squared diagonal:
 *        length² + width²
 * 3. Compute its area:
 *        length × width
 * 4. Update the answer if:
 *      - A longer diagonal is found, or
 *      - The diagonal is the same but the area
 *        is larger.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int areaOfMaxDiagonal(int[][] dimensions) {

        int maxDiagonal = 0;
        int maxArea = 0;

        for (int[] rectangle : dimensions) {

            int length = rectangle[0];
            int width = rectangle[1];

            int diagonalSquared = length * length + width * width;
            int area = length * width;

            if (diagonalSquared > maxDiagonal) {

                maxDiagonal = diagonalSquared;
                maxArea = area;

            } else if (diagonalSquared == maxDiagonal) {

                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
