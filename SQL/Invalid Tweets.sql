-- LeetCode 1683 - Invalid Tweets

/*
Problem:
Find the IDs of tweets whose content
contains more than 15 characters.

Approach:
1. Calculate tweet length using CHAR_LENGTH()
2. Filter tweets with length > 15
3. Return tweet_id

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content) > 15;
