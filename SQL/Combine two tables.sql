-- LeetCode 175 - Combine Two Tables

/*
Problem:
Report the first name, last name, city,
and state of each person.

If a person does not have an address,
return NULL for city and state.

Approach:
1. Use LEFT JOIN to keep all persons
2. Match records using personId
3. Select required columns

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    firstName,
    lastName,
    city,
    state
FROM Person
LEFT JOIN Address
USING (personId);
