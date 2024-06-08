# Write your MySQL query statement below
select
    visits.customer_id,
    count(visits.visit_id) as count_no_trans 
from 
    visits left join transactions
on 
    Visits.visit_id = transactions.visit_id
where 
    transactions.transaction_id is null
group by 
    visits.customer_id;
