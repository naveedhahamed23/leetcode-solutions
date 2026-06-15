-- LeetCode 178 - Rank Scores

/*
Problem:
Rank scores in descending order.

Requirements:
- Same scores receive the same rank
- No gaps between ranks

Approach:
1. Sort scores in descending order
2. Use DENSE_RANK() window function
3. Assign ranks without gaps

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

SELECT
    score,
    DENSE_RANK() OVER (
        ORDER BY score DESC
    ) AS rank
FROM Scores;
