/**
 * LeetCode 1587 - Bank Account Summary II
 *
 * Problem:
 * Find users whose total transaction amount is greater than 10000.
 *
 * Approach:
 * 1. JOIN the Users and Transactions tables using the account number.
 * 2. GROUP BY each user to combine all their transactions.
 * 3. SUM the transaction amounts to calculate the account balance.
 * 4. Use HAVING to keep only users whose balance is greater than 10000.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

SELECT
    u.name,
    SUM(t.amount) AS balance
FROM Users u
JOIN Transactions t
    ON u.account = t.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;
