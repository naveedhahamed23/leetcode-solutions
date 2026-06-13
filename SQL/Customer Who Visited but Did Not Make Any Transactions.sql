-- LeetCode 1581 - Customer Who Visited but Did Not Make Any Transactions

/*
Problem:
Find customers who visited the mall
but did not make any transactions.

Return:
- customer_id
- number of visits without transactions

Approach:
1. LEFT JOIN Visits and Transactions
2. Keep rows where transaction is missing
3. Group by customer_id
4. Count visits per customer

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    v.customer_id,
    COUNT(v.visit_id) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t
    ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;
