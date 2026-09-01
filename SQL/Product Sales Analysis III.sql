/**
 * LeetCode 1070 - Product Sales Analysis III
 *
 * Problem:
 * Find the first year each product was sold and return the
 * product ID, first year, quantity, and price for that year.
 *
 * Approach:
 * 1. Find the minimum year for each product using MIN(year).
 * 2. Match the product_id and year from the original Sales table
 *    with those first-year values.
 * 3. Return the required columns.
 *
 * The pair (product_id, year) is matched together using a
 * row constructor in the IN condition.
 *
 * Time Complexity: O(n)
 * Space Complexity: Depends on the database execution plan.
 */

SELECT
    product_id,
    year AS first_year,
    quantity,
    price
FROM Sales
WHERE (product_id, year) IN (
    SELECT
        product_id,
        MIN(year)
    FROM Sales
    GROUP BY product_id
);
