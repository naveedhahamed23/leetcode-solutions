-- LeetCode 1280 - Students and Examinations

/*
Problem:
For every student and every subject,
report how many times the student
attended the examination.

Approach:
1. Generate every student-subject pair
   using CROSS JOIN.
2. LEFT JOIN with Examinations
   using student_id and subject_name.
3. Count examination records.
4. Group by student and subject.
5. Sort by student_id and subject_name.

Time Complexity: O(S × Sub + E)
Space Complexity: O(S × Sub)

where:
S = number of students
Sub = number of subjects
E = number of examination records
*/

SELECT
    s.student_id,
    s.student_name,
    sub.subject_name,
    COUNT(e.subject_name) AS attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT JOIN Examinations e
    ON s.student_id = e.student_id
   AND sub.subject_name = e.subject_name
GROUP BY
    s.student_id,
    s.student_name,
    sub.subject_name
ORDER BY
    s.student_id,
    sub.subject_name;
