/**
 * LeetCode 1407 - Top Travellers
 *
 * Problem:
 * Find the total distance travelled by each user.
 * Include users who have not taken any rides and assign
 * them a travelled distance of 0.
 *
 * Approach:
 * 1. LEFT JOIN Users with Rides to include every user.
 * 2. GROUP BY each user to combine all their rides.
 * 3. SUM the distance travelled by each user.
 * 4. Use IFNULL to convert NULL to 0 for users with no rides.
 * 5. Sort by travelled distance in descending order and
 *    name in ascending order.
 *
 * Time Complexity: O(n) for processing the rows (actual performance
 * depends on indexes and the database execution plan).
 * Space Complexity: Depends on the database execution plan.
 */

SELECT
    u.name,
    IFNULL(SUM(r.distance), 0) AS travelled_distance
FROM Users u
LEFT JOIN Rides r
    ON u.id = r.user_id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC, u.name ASC;
