SELECT * FROM northwind.products;
-- question 1
select product_id, name
from products 
order by price;
-- question 2 
select product_id, name, price
from products
ORDER BY price;
-- question 3 
select product_id, name, price
from products
WHERE price <= 7.50
ORDER BY length(); 
-- question 4
-- geitost, guaran fantstica, konbu, filo mix, tourtire
-- question 5
select product_id, name
from products
where units <= 100
order by length desc;



