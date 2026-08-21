/**
 * LeetCode 1045 - Customers Who Bought All Products
 *
 * Problem:
 * Find customers who bought every product listed in the Product table.
 *
 * Approach:
 * 1. GROUP BY customer_id to process each customer separately.
 * 2. COUNT(DISTINCT product_key) finds the number of different
 *    products purchased by each customer.
 * 3. The subquery counts the total number of products.
 * 4. If both counts are equal, the customer bought every product.
 *
 * Example:
 * Product table contains 3 products.
 *
 * Customer 1 bought: 1, 2, 3 -> COUNT = 3 -> Include
 * Customer 2 bought: 1, 2    -> COUNT = 2 -> Exclude
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) = (
    SELECT COUNT(*)
    FROM Product
);
