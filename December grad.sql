use shopping_cart;

create table Customer (
	Cust_ID int primary key NOT NULL,
    Cust_Name varchar(100),
    Cust_City varchar(100),
    Cust_RoomNo int,
    CheckIn_time datetime
);

insert into Customer values (1,"James Vich", "Phoenix", 3, "202-01-07 12:12:12");
insert into Customer values (2,"Da Vinci", "Atlanta", 5, "2021-01-07 12:12:12");
insert into Customer values (3,"Phoenix", "New York", 7, "2020-01-07 12:12:12");
insert into Customer values (4,"Day", "Austin", 9, "2020-11-12 12:12:12");
insert into Customer values (5,"Jane Doe", "Kansas City", 11, "2023-01-07 12:12:12");

select * from Customers;
select * from Order_Details;
select *from orders;
select * from products;
select * from suppliers;
select *from employees;
select *from SupplierDetail;

select City, count(city) as count from Customers group by city;
select min(quantity), max(quantity) from order_details;
select *from products limit 11 offset 4;
select *from suppliers where SupplierName like "_a%";
select *from Customers where country != "USA" and country !="Canada"; 


select * from Order_Details,orders where orders.orderID = Order_Details.OrderID and orders.orderdate between "2020-01-01" and "2021-01-01" order by orders.orderdate desc;
select City, count(city) as count from Customers group by city;
select * from employees where firstname  != "Sanjay" and firstname != "Soniya";

create table SupplierDetail like Suppliers;
insert into SupplierDetail select * from Suppliers;

delete from Customers where country = "Venezuela";


