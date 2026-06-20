-- LeetCode 197 - Rising Temperature

/*
Problem:
Find the IDs of days where the
temperature was higher than
the previous day.

Approach:
1. Perform a self join on the Weather table.
2. Match each day's record with
   the previous day's record using DATEDIFF().
3. Compare temperatures.
4. Return the current day's id.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

SELECT
    w.id AS Id
FROM Weather w
JOIN Weather d
    ON DATEDIFF(w.recordDate, d.recordDate) = 1
WHERE w.temperature > d.temperature;
