/**
 * LeetCode 607 - Sales Person
 *
 * Problem:
 * Find the names of all salespeople who have not made any sales
 * to the company named 'RED'.
 *
 * Approach:
 * 1. Join Orders with Company to identify orders made to 'RED'.
 * 2. Get the sales_id of every salesperson who sold to 'RED'.
 * 3. Use NOT IN to exclude those salespeople.
 *
 * Time Complexity: Depends on the database indexing and execution plan.
 * Space Complexity: Depends on the database execution plan.
 */

SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (
    SELECT o.sales_id
    FROM Orders o
    JOIN Company c
        ON o.com_id = c.com_id
    WHERE c.name = 'RED'
);
