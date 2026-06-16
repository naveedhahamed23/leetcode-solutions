-- LeetCode 577 - Employee Bonus

/*
Problem:
Find employees whose bonus is:
1. Less than 1000
2. Or NULL (no bonus record)

Approach:
1. LEFT JOIN Employee and Bonus
2. Keep all employees
3. Filter bonuses:
      bonus < 1000
      OR bonus IS NULL

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    e.name,
    b.bonus
FROM Employee e
LEFT JOIN Bonus b
    ON e.empId = b.empId
WHERE b.bonus < 1000
   OR b.bonus IS NULL;
