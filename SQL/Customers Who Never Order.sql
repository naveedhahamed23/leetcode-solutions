-- LeetCode 183 - Customers Who Never Order

/*
Problem:
Find customers who never placed an order.

Approach:
1. LEFT JOIN Customers and Orders
2. Keep all customers
3. Find customers with no matching order
   using IS NULL

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders o
    ON c.id = o.customerId
WHERE o.customerId IS NULL;
