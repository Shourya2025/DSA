# Write your MySQL query statement below
Select p.firstName,
p.lastName,
a.city ,
a.state
From Person p 
LEFT JOIN Address a
ON p.personId = a.personId;