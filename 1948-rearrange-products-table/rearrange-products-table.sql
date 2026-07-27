# Write your MySQL query statement below
select product_id,'store1' as store,
store1 as price
from products 
where store1 is NOT NULL

union 

SELECT 
    product_id
    ,'store2' AS store
    ,store2 AS price
FROM products
WHERE store2 IS NOT NULL

UNION 

SELECT 
    product_id
    ,'store3' AS store
    ,store3 AS price
FROM products
WHERE store3 IS NOT NULL;