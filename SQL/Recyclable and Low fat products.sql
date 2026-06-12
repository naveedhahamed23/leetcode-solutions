-- LeetCode 1757 - Recyclable and Low Fat Products

/*
Problem:
Find the IDs of products that are both:
1. Low fat
2. Recyclable

Approach:
1. Filter rows using WHERE
2. Keep products where:
      low_fats = 'Y'
      recyclable = 'Y'
3. Return product_id

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT product_id
FROM Products
WHERE low_fats = 'Y'
  AND recyclable = 'Y';
