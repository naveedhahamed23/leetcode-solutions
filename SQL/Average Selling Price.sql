-- LeetCode 1251 - Average Selling Price

/*
Problem:
Calculate the average selling price
for each product.

Average Price =
Total Revenue / Total Units Sold

Approach:
1. LEFT JOIN Prices and UnitsSold.
2. Match sales occurring within
   the valid price period using BETWEEN.
3. Compute total revenue using
   price × units.
4. Divide by total units sold.
5. Round to 2 decimal places.
6. Replace NULL with 0.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    p.product_id,
    IFNULL(
        ROUND(
            SUM(p.price * u.units) / SUM(u.units),
            2
        ),
        0
    ) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
    ON p.product_id = u.product_id
   AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;
