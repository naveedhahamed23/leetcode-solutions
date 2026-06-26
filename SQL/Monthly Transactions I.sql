-- LeetCode 1193 - Monthly Transactions I

/*
Problem:
For each month and country, calculate:
1. Total number of transactions
2. Number of approved transactions
3. Total transaction amount
4. Total approved transaction amount

Approach:
1. Extract the month using DATE_FORMAT().
2. Group records by month and country.
3. Count all transactions.
4. Use conditional aggregation to count
   approved transactions.
5. Sum total amounts.
6. Sum only approved transaction amounts.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    DATE_FORMAT(trans_date, '%Y-%m') AS month,
    country,
    COUNT(*) AS trans_count,
    SUM(CASE
            WHEN state = 'approved' THEN 1
            ELSE 0
        END) AS approved_count,
    SUM(amount) AS trans_total_amount,
    SUM(CASE
            WHEN state = 'approved' THEN amount
            ELSE 0
        END) AS approved_total_amount
FROM Transactions
GROUP BY
    month,
    country;
