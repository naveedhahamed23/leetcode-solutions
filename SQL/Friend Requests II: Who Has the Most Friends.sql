/**
 * LeetCode 602 - Friend Requests II: Who Has the Most Friends
 *
 * Problem:
 * Find the person who has the most friends.
 *
 * Approach:
 * 1. A person appears as a requester in requester_id.
 * 2. A person appears as an accepter in accepter_id.
 * 3. Use UNION ALL to combine both columns into one list.
 * 4. GROUP BY id and count how many times each person appears.
 * 5. Sort by the friend count in descending order.
 * 6. LIMIT 1 returns the person with the most friends.
 *
 * UNION ALL is used because every accepted request represents
 * one friendship for both people.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

WITH AllFriends AS (
    SELECT requester_id AS id
    FROM RequestAccepted

    UNION ALL

    SELECT accepter_id AS id
    FROM RequestAccepted
)

SELECT
    id,
    COUNT(*) AS num
FROM AllFriends
GROUP BY id
ORDER BY num DESC
LIMIT 1;
