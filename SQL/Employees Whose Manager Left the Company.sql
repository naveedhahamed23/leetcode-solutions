/**
 * LeetCode 1978 - Employees Whose Manager Left the Company
 *
 * Problem:
 * Find employees whose salary is less than 30000 and whose manager
 * is no longer present in the Employees table.
 *
 * Approach:
 * 1. Select the employee_id from the Employees table.
 * 2. Check that the employee's salary is less than 30000.
 * 3. Check that their manager_id does not exist as an employee_id.
 * 4. Sort the result by employee_id in ascending order.
 *
 * The subquery returns all employee IDs that currently exist.
 * If an employee's manager_id is not found in that list, the manager
 * has left the company.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

SELECT e.employee_id
FROM Employees e
WHERE e.salary < 30000
  AND e.manager_id NOT IN (
      SELECT s.employee_id
      FROM Employees s
  )
ORDER BY e.employee_id ASC;
