-- LeetCode 586 - Customer Placing the Largest Number of Orders

/*
Problem:
Find the customer who placed
the largest number of orders.

Approach:
1. Group orders by customer_number
2. Count orders for each customer
3. Sort counts in descending order
4. Return the top customer

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;
