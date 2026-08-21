/**
 * LeetCode 185 - Department Top Three Salaries
 *
 * Problem:
 * Find employees who have one of the top three distinct salaries
 * in their department.
 *
 * Approach:
 * 1. Join Employee with Department to get the department name.
 * 2. For each employee, count how many distinct salaries in the
 *    same department are greater than their salary.
 * 3. If fewer than 3 distinct salaries are greater, the employee
 *    belongs to the top three salaries.
 * 4. Sort the result by department and salary in descending order.
 *
 * Example:
 * Salaries in a department:
 * 100000
 * 90000
 * 80000
 * 70000
 *
 * For salary 80000:
 * Higher distinct salaries = 2
 * 2 < 3 -> Include
 *
 * For salary 70000:
 * Higher distinct salaries = 3
 * 3 < 3 -> Exclude
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

SELECT
    d.name AS Department,
    e.name AS Employee,
    e.salary AS Salary
FROM Employee e
LEFT JOIN Department d
    ON e.departmentId = d.id
WHERE 3 > (
    SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2
    WHERE e2.salary > e.salary
      AND e2.departmentId = e.departmentId
)
ORDER BY Department, Salary DESC;
