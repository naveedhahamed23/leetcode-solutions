-- LeetCode 1148 - Article Views I

/*
Problem:
Find all authors who viewed at least one
of their own articles.

Return the result sorted by id.

Approach:
1. Select rows where:
      author_id = viewer_id
2. Remove duplicates using DISTINCT
3. Rename author_id to id
4. Sort results in ascending order

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id ASC;
