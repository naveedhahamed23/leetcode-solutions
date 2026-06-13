-- LeetCode 1068 - Product Sales Analysis I

/*
Problem:
Report the product name, year,
and price for each sale.

Approach:
1. Join Sales and Product tables
   using product_id
2. Retrieve:
      - product_name
      - year
      - price

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    p.product_name,
    s.year,
    s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;
