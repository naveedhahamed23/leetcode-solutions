-- LeetCode 596 - Classes More Than 5 Students

/*
Problem:
Find all classes that have
at least 5 students.

Approach:
1. Group rows by class
2. Count students in each class
3. Keep classes with count >= 5

Time Complexity: O(n)
Space Complexity: O(n)
*/

SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(*) >= 5;
