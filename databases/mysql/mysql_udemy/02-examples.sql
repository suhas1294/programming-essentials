show databases;
create database ecommerce;
drop database soap_store;
use <database_name>;

-- give currently used database, gives "NULL" when nothing is selected
select database()

create table cats
(
    name varchar(50),
    age int
);

-- how to know if table is created ?
show tables;
show columns from cats;
desc <table_name>; -- describe table

-- deleting a table
drop table <table_name>;
drop table cats;

-- challenge
create table pastries(name varchar(50), quantity int);

-- inserting data into table, order matters
insert into cats(name, age) values('foo', 3);

-- multiple insert into table
insert into cats(name, age) values("foo", 3), ("bar", 4), ("johndo", 6);

-- disable strict mode
set sql_mode='';

show warnings;

-- preventing null values in databases
create table cats
(
    name varchar(100) NOT NULL,
    age int NOT NULL
);

-- when you do 'desc table' and see 'NO' on one of the columns, it means no values at all.
-- 'NO' is different from 'empty string'

-- preventing null values in databases
create table cats
(
    name varchar(100) default 'noname' NOT NULL,
    age int default 99 NOT NULL
);

-- when you do 'desc table_name', what about 'key' column here ?
-- primary key : its just a unique identifier.
create table cats (cat_id int not null, name varchar(100), age int, PRIMARY KEY (cat_id));

-- when you do 'desc table_name', what about 'extra column' column here ?
-- adding auto increment
create table cats (
    cat_id int not null AUTO_INCREMENT, 
    name varchar(100), 
    age int, 
    PRIMARY KEY (cat_id)
);

-- all above concepts included
CREATE TABLE employees (
    id INT AUTO_INCREMENT NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    middle_name VARCHAR(255),
    age INT NOT NULL,
    current_status VARCHAR(255) NOT NULL DEFAULT 'employed',
    PRIMARY KEY(id)
);


--  select statements
select * from cats;
select name from cats;
select name, age from cats;
select * from cats where age=9;
select * from cats where name='bob'; -- case insensitive

-- aliases
select cat_id as id, age as years from cats;

-- update command, ('update', 'set' and 'where')
-- update <table_name> set <column_name>=<new_value> where <column_name> = <existing column value>;
update cats set breed="something" where breed = "another";
-- TRY SELECTING BEFORE YOU UDPATE

-- DELETING records
delete from cats where name="bob";
delete from cats; --all rows will be deleted