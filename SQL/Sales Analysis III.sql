/**
 * LeetCode 1084 - Sales Analysis III
 *
 * Problem:
 * Find products that were sold only between
 * 2019-01-01 and 2019-03-31, inclusive.
 *
 * Approach:
 * 1. Join Product with Sales using product_id.
 * 2. Group all sales by product.
 * 3. Find the earliest and latest sale date for each product.
 * 4. A product qualifies only if:
 *    - Its first sale is on or after 2019-01-01.
 *    - Its last sale is on or before 2019-03-31.
 *
 * If both conditions are true, all sales occurred within
 * the required date range.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

SELECT
    p.product_id,
    p.product_name
FROM Product p
JOIN Sales s
    ON p.product_id = s.product_id
GROUP BY p.product_id, p.product_name
HAVING MIN(s.sale_date) >= '2019-01-01'
   AND MAX(s.sale_date) <= '2019-03-31';
