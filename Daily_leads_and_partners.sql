# Write your MySQL query statement below
SELECT date_id,make_name, Count( DISTINCT lead_id) as unique_leads, Count(DISTINCT partner_id) as unique_partners FROM DailySales GROUP BY make_name,date_id;
