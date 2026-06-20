-- LeetCode 184 - Department Highest Salary

/*
Problem:
Find the employee(s) with the highest
salary in each department.

Approach:
1. Group employees by department.
2. Find the maximum salary in each department.
3. Compare each employee's
   (departmentId, salary) pair with
   the subquery result.
4. Join with Department to retrieve
   department names.

Time Complexity: O(n)
Space Complexity: O(n)
*/

SELECT
    d.name AS Department,
    e.name AS Employee,
    e.salary AS Salary
FROM Employee e
JOIN Department d
    ON e.departmentId = d.id
WHERE (e.departmentId, e.salary) IN (
    SELECT
        departmentId,
        MAX(salary)
    FROM Employee
    GROUP BY departmentId
);
