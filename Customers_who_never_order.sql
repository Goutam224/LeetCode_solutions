# Write your MySQL query statement below
SELECT name as Customers FROM Customers as c
WHERE c.id NOT IN (SELECT customerId FROM Orders);
