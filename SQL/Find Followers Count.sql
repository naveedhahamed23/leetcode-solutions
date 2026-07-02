-- LeetCode 1729 - Find Followers Count

/*
Problem:
For each user, return the number
of followers they have.

Approach:
1. Group rows by user_id.
2. Count the number of followers.
3. Sort by user_id in ascending order.

Time Complexity: O(n)
Space Complexity: O(n)
*/

SELECT
    user_id,
    COUNT(*) AS followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id;
