# Write your MySQL query statement below
SELECT u.name,SUM(t.amount) as balance FROM Users as u RIGHT JOIN Transactions as t ON u.account=t.account  GROUP BY t.account HAVING SUM(amount)>10000;
