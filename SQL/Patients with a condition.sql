-- LeetCode 1527 - Patients With a Condition

/*
Problem:
Find all patients whose conditions
contain a condition code that starts
with "DIAB1".

Approach:
1. Match conditions starting with DIAB1
2. Also match DIAB1 appearing after a space
3. Return all matching patient records

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT *
FROM Patients
WHERE conditions LIKE 'DIAB1%'
   OR conditions LIKE '% DIAB1%';
