-- LeetCode 2356 - Number of Unique Subjects Taught by Each Teacher

/*
Problem:
For each teacher, count the number
of unique subjects they teach.

Approach:
1. Group rows by teacher_id.
2. Use COUNT(DISTINCT subject_id)
   to count unique subjects.

Time Complexity: O(n)
Space Complexity: O(n)
*/

SELECT
    teacher_id,
    COUNT(DISTINCT subject_id) AS cnt
FROM Teacher
GROUP BY teacher_id;
