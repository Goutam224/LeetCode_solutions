# Write your MySQL query statement below
SELECT DISTINCT a.email as Email FROM Person as a
JOIN Person b ON a.email=b.email AND a.id<>b.id;
