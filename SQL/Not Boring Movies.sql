-- LeetCode 620 - Not Boring Movies

/*
Problem:
Find movies that:
1. Have an odd-numbered id
2. Are not described as "boring"

Return results sorted by rating
in descending order.

Approach:
1. Filter non-boring movies
2. Keep only odd ids using modulo
3. Sort by rating descending

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

SELECT
    id,
    movie,
    description,
    rating
FROM Cinema
WHERE description != 'boring'
  AND id % 2 != 0
ORDER BY rating DESC;
