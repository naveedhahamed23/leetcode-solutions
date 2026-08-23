/**
 * LeetCode 1179 - Reformat Department Table
 *
 * Problem:
 * Convert the monthly revenue data from rows into separate
 * columns for each month.
 *
 * Approach:
 * 1. Group the records by department ID.
 * 2. Use conditional aggregation for each month.
 * 3. IF checks whether the row belongs to a specific month.
 * 4. SUM returns the revenue for that month.
 *
 * If a department has no revenue for a particular month,
 * the corresponding column returns NULL.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

SELECT
    id,
    SUM(IF(month = 'Jan', revenue, NULL)) AS Jan_Revenue,
    SUM(IF(month = 'Feb', revenue, NULL)) AS Feb_Revenue,
    SUM(IF(month = 'Mar', revenue, NULL)) AS Mar_Revenue,
    SUM(IF(month = 'Apr', revenue, NULL)) AS Apr_Revenue,
    SUM(IF(month = 'May', revenue, NULL)) AS May_Revenue,
    SUM(IF(month = 'Jun', revenue, NULL)) AS Jun_Revenue,
    SUM(IF(month = 'Jul', revenue, NULL)) AS Jul_Revenue,
    SUM(IF(month = 'Aug', revenue, NULL)) AS Aug_Revenue,
    SUM(IF(month = 'Sep', revenue, NULL)) AS Sep_Revenue,
    SUM(IF(month = 'Oct', revenue, NULL)) AS Oct_Revenue,
    SUM(IF(month = 'Nov', revenue, NULL)) AS Nov_Revenue,
    SUM(IF(month = 'Dec', revenue, NULL)) AS Dec_Revenue
FROM Department
GROUP BY id;
