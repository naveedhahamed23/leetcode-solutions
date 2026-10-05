/**
 * LeetCode 118 - Pascal's Triangle
 *
 * Problem:
 * Given an integer numRows, generate the first numRows of Pascal's triangle.
 *
 * Approach:
 * 1. Create each row one by one.
 * 2. The first and last elements of every row are always 1.
 * 3. Every inner element is calculated using the two elements directly
 *    above it from the previous row.
 * 4. Add each completed row to the result.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 */

class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int value = result.get(i - 1).get(j - 1)
                              + result.get(i - 1).get(j);

                    row.add(value);
                }
            }

            result.add(row);
        }

        return result;
    }
}
