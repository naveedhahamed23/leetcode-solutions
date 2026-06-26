-- LeetCode 1211 - Queries Quality and Percentage

/*
Problem:
For each query_name, calculate:
1. Query Quality =
   Average of (rating / position)
2. Poor Query Percentage =
   Percentage of queries with rating < 3

Approach:
1. Group rows by query_name.
2. Compute quality using AVG(rating / position).
3. Use the boolean expression (rating < 3),
   where TRUE = 1 and FALSE = 0.
4. Multiply the average by 100 to obtain
   the percentage.
5. Round both values to 2 decimal places.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    query_name,
    ROUND(AVG(rating / position), 2) AS quality,
    ROUND(AVG(rating < 3) * 100, 2) AS poor_query_percentage
FROM Queries
GROUP BY query_name;
