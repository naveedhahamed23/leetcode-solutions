/**
 * LeetCode 1204 - Last Person to Fit in the Bus
 *
 * Problem:
 * Find the last person who can board the bus without the
 * total weight exceeding 1000.
 *
 * Approach:
 * 1. Join the Queue table with itself.
 * 2. For each person q1, select all people q2 who have
 *    a turn less than or equal to q1's turn.
 * 3. SUM(q2.weight) calculates the total weight of people
 *    who would be on the bus up to that person.
 * 4. HAVING keeps only people whose total weight is <= 1000.
 * 5. ORDER BY turn DESC and LIMIT 1 gives the last person
 *    who can fit.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

SELECT q1.person_name
FROM Queue q1
JOIN Queue q2
    ON q1.turn >= q2.turn
GROUP BY q1.turn, q1.person_name
HAVING SUM(q2.weight) <= 1000
ORDER BY q1.turn DESC
LIMIT 1;
