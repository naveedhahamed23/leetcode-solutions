/**
 * LeetCode 177 - Nth Highest Salary
 *
 * Problem:
 * Find the Nth highest distinct salary from the Employee table.
 *
 * Approach:
 * 1. Use DISTINCT so duplicate salaries are counted only once.
 * 2. Sort salaries in descending order.
 * 3. LIMIT N - 1, 1 skips the first N - 1 salaries and returns
 *    the Nth highest salary.
 *
 * Example:
 * N = 1 -> LIMIT 0, 1 -> Highest salary
 * N = 2 -> LIMIT 1, 1 -> Second highest salary
 * N = 3 -> LIMIT 2, 1 -> Third highest salary
 *
 * If the Nth highest salary does not exist, the query returns NULL.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

CREATE FUNCTION getNthHighestSalary(N INT)
RETURNS INT
BEGIN
    DECLARE offset_value INT;

    SET offset_value = N - 1;

    RETURN (
        SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT offset_value, 1
    );
END;
