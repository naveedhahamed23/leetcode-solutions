-- LeetCode 570 - Managers with at Least 5 Direct Reports

/*
Problem:
Find the names of managers who
have at least 5 direct reports.

Approach:
1. Group employees by managerId
2. Count direct reports for each manager
3. Keep managers with count >= 5
4. Return manager names using the IN clause

Time Complexity: O(n)
Space Complexity: O(n)
*/

SELECT name
FROM Employee
WHERE id IN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*) >= 5
);
