/**
 * LeetCode 1141 - User Activity for the Past 30 Days I
 *
 * Problem:
 * Find the number of active users for each day during the
 * 30-day period ending on 2019-07-27.
 *
 * Approach:
 * 1. Select activity_date as the day.
 * 2. Count DISTINCT user_id to avoid counting the same user
 *    multiple times on the same day.
 * 3. Filter dates from 2019-06-28 through 2019-07-27.
 * 4. GROUP BY activity_date to calculate active users per day.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

SELECT
    activity_date AS day,
    COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE activity_date > '2019-06-27'
  AND activity_date <= '2019-07-27'
GROUP BY activity_date;
