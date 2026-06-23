-- LeetCode 196 - Delete Duplicate Emails

/*
Problem:
Delete duplicate email records,
keeping only the row with
the smallest id.

Approach:
1. Perform a self join on email.
2. Match rows having the same email.
3. Delete the row with the larger id.
4. The smallest id is preserved.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

DELETE p1
FROM Person p1
JOIN Person p2
    ON p1.email = p2.email
WHERE p1.id > p2.id;
