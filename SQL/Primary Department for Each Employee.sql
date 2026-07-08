-- LeetCode 1789 - Primary Department for Each Employee

/*
Problem:
Return the primary department for each employee.

Rules:
1. If an employee has a department with primary_flag = 'Y',
   return that department.
2. If an employee belongs to only one department,
   return that department regardless of the primary_flag.

Approach:
1. Select all employees whose primary department is marked with 'Y'.
2. Find employees assigned to exactly one department using
   GROUP BY and HAVING COUNT() = 1.
3. Combine both result sets using UNION.
   UNION automatically removes duplicates.

Time Complexity: O(n)
Space Complexity: O(n)
*/

SELECT employee_id, department_id
FROM Employee
WHERE primary_flag = 'Y'

UNION

SELECT employee_id, department_id
FROM Employee
GROUP BY employee_id
HAVING COUNT(department_id) = 1;
