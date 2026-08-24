/**
 * LeetCode 1795 - Rearrange Products Table
 *
 * Problem:
 * Convert store price columns into individual rows containing
 * product_id, store name, and price.
 *
 * Approach:
 * 1. Select the price for each store separately.
 * 2. Assign the store name as a constant using AS store.
 * 3. Exclude NULL prices because the product is not sold in that store.
 * 4. Combine the results using UNION.
 *
 * This converts columns (store1, store2, store3) into rows.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

SELECT
    product_id,
    'store1' AS store,
    store1 AS price
FROM Products
WHERE store1 IS NOT NULL

UNION

SELECT
    product_id,
    'store2' AS store,
    store2 AS price
FROM Products
WHERE store2 IS NOT NULL

UNION

SELECT
    product_id,
    'store3' AS store,
    store3 AS price
FROM Products
WHERE store3 IS NOT NULL;
