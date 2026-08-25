/**
 * LeetCode 627 - Swap Salary
 *
 * Problem:
 * Swap all 'm' values to 'f' and all 'f' values to 'm'
 * in the sex column without using a temporary table.
 *
 * Approach:
 * Use a CASE expression to conditionally update each row:
 * - If sex is 'm', change it to 'f'.
 * - Otherwise, change it to 'm'.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

UPDATE Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;
