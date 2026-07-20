-- LeetCode 180 - Consecutive Numbers

/*
Problem:
Find all numbers that appear at least
three times consecutively in the Logs table.

Approach:
1. Join the Logs table with itself three times.
2. Match three consecutive IDs.
3. Check whether all three numbers are equal.
4. Use DISTINCT to avoid duplicate outputs.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT DISTINCT
    l1.num AS ConsecutiveNums
FROM Logs l1
JOIN Logs l2
    ON l1.id = l2.id - 1
JOIN Logs l3
    ON l1.id = l3.id - 2
WHERE l1.num = l2.num
  AND l2.num = l3.num;
