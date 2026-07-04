-- LeetCode 1667 - Fix Names in a Table

/*
Problem:
Format each user's name so that:
- The first letter is uppercase.
- The remaining letters are lowercase.

Approach:
1. Extract the first character.
2. Convert it to uppercase.
3. Extract the remaining characters.
4. Convert them to lowercase.
5. Concatenate both parts.
6. Sort by user_id.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    user_id,
    CONCAT(
        UPPER(SUBSTR(name, 1, 1)),
        LOWER(SUBSTR(name, 2))
    ) AS name
FROM Users
ORDER BY user_id;
