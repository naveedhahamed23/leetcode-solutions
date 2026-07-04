-- LeetCode 1484 - Group Sold Products By The Date

/*
Problem:
For each sell_date, return:
1. Number of unique products sold.
2. Alphabetically sorted list of unique products.

Approach:
1. Group rows by sell_date.
2. Count distinct products.
3. Concatenate distinct product names
   using GROUP_CONCAT().
4. Sort product names alphabetically.
5. Sort the final output by sell_date.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

SELECT
    sell_date,
    COUNT(DISTINCT product) AS num_sold,
    GROUP_CONCAT(
        DISTINCT product
        ORDER BY product
    ) AS products
FROM Activities
GROUP BY sell_date
ORDER BY sell_date;
