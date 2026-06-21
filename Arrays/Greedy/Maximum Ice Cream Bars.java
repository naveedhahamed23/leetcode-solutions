/**
 * LeetCode 1833 - Maximum Ice Cream Bars
 *
 * Problem:
 * Given an array of ice cream costs and an integer coins,
 * return the maximum number of ice cream bars that can
 * be purchased.
 *
 * Approach:
 * Greedy + Sorting
 *
 * 1. Sort the costs in ascending order.
 * 2. Buy the cheapest ice cream first.
 * 3. Stop when there are not enough coins.
 * 4. Return the total number of bars purchased.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * (Ignoring the space used by the sorting algorithm.)
 */

import java.util.Arrays;

class Solution {

    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        int count = 0;

        for (int cost : costs) {

            if (coins < cost) {
                break;
            }

            coins -= cost;
            count++;
        }

        return count;
    }
}
