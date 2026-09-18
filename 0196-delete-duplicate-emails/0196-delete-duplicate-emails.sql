# Write your MySQL query statement below
#For every duplicate email, delete the row whose id is greater than another row having the same email.
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.email = p2.email
AND p1.id > p2.id;