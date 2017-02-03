create table T_XBBNHGM_CUSTOMER(customer_id number(10),customer_name varchar2(20),billing_address varchar2(20),customer_email_id varchar2(20),customer_credit_rating number(5));

create table T_XBBNHGM_PRODUCT(product_id number(10),product_name varchar2(20),product_description varchar2(20),other_details varchar2(20));

insert into T_XBBNHGM_PRODUCT values(3,'Phone','Apple','25000');

select * from T_XBBNHGM_PRODUCT;

update T_XBBNHGM_PRODUCT set product_name='Phone' where product_id='1';