-- LeetCode 181 - Employees Earning More Than Their Managers

/*
Problem:
Find employees whose salary is
greater than their manager's salary.

Approach:
1. Perform a self join on the Employee table
2. Treat one instance as employee (e)
3. Treat another instance as manager (m)
4. Match:
      e.managerId = m.id
5. Return employees whose salary
   exceeds their manager's salary

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;
