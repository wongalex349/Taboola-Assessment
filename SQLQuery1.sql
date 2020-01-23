create table PRODUCTS(
NAME varchar(255),
CATEGORY varchar(255)
);

create table PRODUCTPRICEHISTORY(
NAME varchar(255),
PRICE float,
STARTDATE date,
ENDDATE date
);

select * from PRODUCTS
Inner Join PRODUCTPRICEHISTORY
on PRODUCTS.NAME = PRODUCTPRICEHISTORY.Name;