# Write your MySQL query statement below
SELECT p.product_name,s.year,s.price FROM Sales as s RIGHT JOIN Product as p ON s.product_id=p.product_id WHERE s.product_id IS NOT NULL ORDER BY product_name ASC;
