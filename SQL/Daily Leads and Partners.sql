/**
 * LeetCode 1693 - Daily Leads and Partners
 *
 * Problem:
 * For each date and product make, find the number of unique
 * leads and unique partners.
 *
 * Approach:
 * 1. GROUP BY date_id and make_name to create a group for each
 *    date and product make.
 * 2. COUNT(DISTINCT lead_id) counts each lead only once.
 * 3. COUNT(DISTINCT partner_id) counts each partner only once.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

SELECT
    date_id,
    make_name,
    COUNT(DISTINCT lead_id) AS unique_leads,
    COUNT(DISTINCT partner_id) AS unique_partners
FROM DailySales
GROUP BY date_id, make_name;
