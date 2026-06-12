-- LeetCode 584 - Find Customer Referee

/*
Problem:
Find the names of customers who:
1. Were not referred by customer with id = 2
2. Or have no referee

Approach:
1. Filter customers whose referee_id is not 2
2. Include NULL referee values explicitly
   using IS NULL

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT name
FROM Customer
WHERE referee_id != 2
   OR referee_id IS NULL;
