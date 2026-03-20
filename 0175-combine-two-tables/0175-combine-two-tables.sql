# Write your MySQL query statement below
SELECT 
P.firstName,
P.lastName,
A.city,
A.state
FROM
Person as P
Left JOIN 
Address  as A
on P.personId = A.personId