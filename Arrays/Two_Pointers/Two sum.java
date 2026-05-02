// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Difficulty: Easy

// Approach:
// Use HashMap to store visited elements
// Check if (target - current) exists

// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
