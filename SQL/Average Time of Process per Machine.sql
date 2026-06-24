-- LeetCode 1661 - Average Time of Process per Machine

/*
Problem:
Calculate the average processing time
for each machine.

Processing Time = end_timestamp - start_timestamp

Approach:
1. Convert:
      start -> -timestamp
      end   -> +timestamp
   using CASE.
2. SUM() computes the total processing time.
3. COUNT(DISTINCT process_id) counts each process once.
4. Divide total time by number of processes.
5. Round the result to 3 decimal places.

Time Complexity: O(n)
Space Complexity: O(n)
*/

SELECT
    machine_id,
    ROUND(
        SUM(
            CASE
                WHEN activity_type = 'start'
                THEN -timestamp
                ELSE timestamp
            END
        ) / COUNT(DISTINCT process_id),
        3
    ) AS processing_time
FROM Activity
GROUP BY machine_id;
