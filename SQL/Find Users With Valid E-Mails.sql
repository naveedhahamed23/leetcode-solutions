-- LeetCode 1517 - Find Users With Valid E-Mails

/*
Problem:
Find all users whose email is valid.

Rules:
1. Username must start with a letter.
2. Remaining username characters may be:
   letters, digits, '_', '.', or '-'.
3. Email must end with '@leetcode.com'.

Approach:
1. Use REGEXP to validate the email format.
2. Return all matching users.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT *
FROM Users
WHERE mail REGEXP
'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$';
