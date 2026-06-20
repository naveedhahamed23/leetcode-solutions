-- LeetCode 1378 - Replace Employee ID With The Unique Identifier

/*
Problem:
Replace each employee's id with their
corresponding unique identifier.

If an employee does not have a unique_id,
return NULL.

Approach:
1. Use Employees as the left table
2. LEFT JOIN EmployeeUNI using id
3. Return unique_id and employee name

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    u.unique_id,
    e.name
FROM Employees e
LEFT JOIN EmployeeUNI u
    ON e.id = u.id;
