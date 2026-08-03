// Problem: 904. Fruit Into Baskets
// Link: https://leetcode.com/problems/fruit-into-baskets/
// Difficulty: Medium

// Approach:
// Use the Sliding Window technique with a HashMap.
// Expand the window by adding fruits to the basket.
// If more than 2 fruit types are present, shrink the window
// from the left until only 2 types remain.
// Track the maximum valid window size.

// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);

                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
