-- LeetCode 1517 - Find Users With Valid E-Mails

/*
Problem:
Find all users with valid email addresses.

A valid email:
1. Starts with letters, digits, or '_'
2. Contains exactly one '@'
3. Has a domain consisting only of letters
4. Ends with '.com'

Approach:
1. Use REGEXP to validate email format
2. Filter matching records
3. Sort by user_id

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    user_id,
    email
FROM Users
WHERE email REGEXP
'^[a-zA-Z0-9_]+@[a-zA-Z]+\\.com$'
ORDER BY user_id ASC;
