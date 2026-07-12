-- LeetCode 610 - Triangle Judgement

/*
Problem:
Determine whether three side lengths
can form a valid triangle.

Approach:
1. Apply the Triangle Inequality Theorem.
2. If the sum of any two sides is greater
   than the third side, return 'Yes'.
3. Otherwise, return 'No'.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    x,
    y,
    z,
    CASE
        WHEN x + y > z
         AND x + z > y
         AND y + z > x
        THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM Triangle;
