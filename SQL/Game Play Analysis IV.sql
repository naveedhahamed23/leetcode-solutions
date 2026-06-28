-- LeetCode 550 - Game Play Analysis IV

/*
Problem:
Find the fraction of players who logged in again
exactly one day after their first login.

Approach:
1. Find each player's first login date using MIN(event_date).
2. Join the result back with the Activity table.
3. Check if the player has a login exactly one day
   after their first login using DATE_ADD().
4. Count the distinct players who satisfy the condition.
5. Divide by the total number of unique players.
6. Round the result to 2 decimal places.

Time Complexity: O(n)
Space Complexity: O(p)
where p = number of unique players.
*/

SELECT
    ROUND(
        COUNT(DISTINCT a.player_id) * 1.0 /
        (SELECT COUNT(DISTINCT player_id) FROM Activity),
        2
    ) AS fraction
FROM Activity AS a
JOIN (
    SELECT
        player_id,
        MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id
) AS first_logins
ON a.player_id = first_logins.player_id
AND a.event_date = DATE_ADD(first_logins.first_login, INTERVAL 1 DAY);
