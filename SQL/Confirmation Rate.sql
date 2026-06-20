-- LeetCode 1934 - Confirmation Rate

/*
Problem:
Calculate the confirmation rate
for each signed-up user.

Confirmation Rate =
confirmed actions / total confirmation attempts

Return:
- user_id
- confirmation_rate (rounded to 2 decimals)

Approach:
1. LEFT JOIN Signups and Confirmations
2. Convert:
      confirmed -> 1
      others -> 0
   using CASE
3. Compute average using AVG()
4. Round to two decimal places
5. Replace NULL with 0 using IFNULL()

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    s.user_id,
    IFNULL(
        ROUND(
            AVG(
                CASE
                    WHEN action = 'confirmed' THEN 1
                    ELSE 0
                END
            ),
            2
        ),
        0
    ) AS confirmation_rate
FROM Signups s
LEFT JOIN Confirmations c
    ON s.user_id = c.user_id
GROUP BY s.user_id;
