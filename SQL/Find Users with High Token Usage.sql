/**
 * LeetCode 3793 - Find Users with High Token Usage
 *
 * Problem:
 * Find users who have submitted at least 3 prompts and have at least
 * one prompt with a token count greater than their average token usage.
 *
 * Approach:
 * 1. Group prompts by user_id.
 * 2. Count the total prompts submitted by each user.
 * 3. Calculate the average number of tokens per prompt.
 * 4. Keep users with at least 3 prompts.
 * 5. MAX(tokens) > AVG(tokens) ensures that at least one prompt has
 *    a token count greater than the user's average.
 * 6. Round the average to two decimal places and sort as required.
 *
 * Time Complexity: O(n) for aggregation, excluding sorting costs.
 * Space Complexity: Depends on the database execution plan.
 */

SELECT
    user_id,
    COUNT(*) AS prompt_count,
    ROUND(AVG(tokens), 2) AS avg_tokens
FROM prompts
GROUP BY user_id
HAVING COUNT(*) >= 3
   AND MAX(tokens) > AVG(tokens)
ORDER BY avg_tokens DESC, user_id ASC;
