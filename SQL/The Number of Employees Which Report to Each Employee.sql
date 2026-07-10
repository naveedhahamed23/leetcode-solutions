-- LeetCode 1731 - The Number of Employees Which Report to Each Employee

/*
Problem:
For each manager, return:
1. Employee ID
2. Name
3. Number of direct reports
4. Average age of direct reports
   (rounded to the nearest integer)

Approach:
1. Perform a self join on Employees.
2. Match each manager with employees
   reporting to them.
3. Group by manager.
4. Count direct reports.
5. Compute the average age.
6. Sort by employee_id.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    e1.employee_id,
    e1.name,
    COUNT(e2.employee_id) AS reports_count,
    ROUND(AVG(e2.age)) AS average_age
FROM Employees e1
JOIN Employees e2
    ON e1.employee_id = e2.reports_to
GROUP BY
    e1.employee_id,
    e1.name
ORDER BY e1.employee_id;
