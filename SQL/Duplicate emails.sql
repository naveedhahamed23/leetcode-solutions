-- LeetCode 182 - Duplicate Emails

/*
Problem:
Find all duplicate emails in the Person table.

Approach:
1. Group records by email
2. Count occurrences of each email
3. Return emails appearing more than once

Time Complexity: O(n)
Space Complexity: O(n)
*/

SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
