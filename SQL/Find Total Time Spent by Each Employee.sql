/**
 * LeetCode 1741 - Find Total Time Spent by Each Employee
 *
 * Problem:
 * Calculate the total time each employee spent working on each day.
 *
 * Approach:
 * 1. Calculate the duration of each task using:
 *      out_time - in_time
 * 2. GROUP BY event_day and emp_id to combine all tasks
 *    performed by the same employee on the same day.
 * 3. SUM the durations to get the total time spent.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

SELECT
    event_day AS day,
    emp_id,
    SUM(out_time - in_time) AS total_time
FROM Employees
GROUP BY event_day, emp_id;
