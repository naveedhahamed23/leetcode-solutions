-- LeetCode 1075 - Project Employees I

/*
Problem:
Calculate the average years of experience
of employees assigned to each project.

Approach:
1. Join Project with Employee using employee_id.
2. Group records by project_id.
3. Compute the average experience.
4. Round the result to 2 decimal places.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    p.project_id,
    ROUND(AVG(e.experience_years), 2) AS average_years
FROM Project p
JOIN Employee e
    ON p.employee_id = e.employee_id
GROUP BY p.project_id;
