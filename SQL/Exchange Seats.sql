/**
 * LeetCode 626 - Exchange Seats
 *
 * Problem:
 * Swap the seat IDs of every two consecutive students.
 * If the number of students is odd, the last student remains
 * in the same seat.
 *
 * Approach:
 * - Odd ID  -> move to the next ID.
 * - Even ID -> move to the previous ID.
 * - If the ID is the last odd ID, keep it unchanged.
 *
 * The CASE expression calculates the new seat ID.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

SELECT
    CASE
        WHEN id % 2 != 0
             AND id = (SELECT MAX(id) FROM Seat)
            THEN id
        WHEN id % 2 != 0
            THEN id + 1
        ELSE id - 1
    END AS id,
    student
FROM Seat
ORDER BY id;
