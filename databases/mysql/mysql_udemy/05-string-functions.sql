-- running sql file: source <sql_filename.sql> inside 'mysql-ctl -cli'


-- stirng functions
-- 1. concat
--  you can have multiple concat functions per statement
select concat('hello', 'word') -- works !!
select concat('hello', '...', 'word') -- works !!
select concat(author_fname, ' ', author_lname) as full_name from books ; -- works !!

--  concat_ws : concat with seperator
select concat(' - ', author_fname, author_lname) as full_name from books ; -- works !!


-- 2. substring 
-- MySql IS '1' BASED INDEXING
SELECT substring(column_name, start_index, end_index) as short_title from books;
-- substr() is alternative

--  using concat and substring together:
SELECT CONCAT
    (
        SUBSTRING(title, 1, 10),
        '...'
    ) AS 'short title'
FROM books;

-- 3. 'replace'  function
-- its case sensitive
SELECT REPLACE('Hello World', 'Hell', '%$#@');
SELECT REPLACE('Hello World', 'l', '7');

SELECT
  REPLACE('cheese bread coffee milk', ' ', ' and ');

 SELECT
    SUBSTRING(REPLACE(title, 'e', '3'), 1, 10) AS 'weird string'
FROM books;

-- 4. reverse
SELECT REVERSE('Hello World');
SELECT REVERSE('meow meow');
SELECT REVERSE(author_fname) FROM books;
SELECT CONCAT('woof', REVERSE('woof'));
SELECT CONCAT(author_fname, REVERSE(author_fname)) FROM books;

-- 5. char length
SELECT CHAR_LENGTH('Hello World');
SELECT author_lname, CHAR_LENGTH(author_lname) AS 'length' FROM books;
SELECT CONCAT(author_lname, ' is ', CHAR_LENGTH(author_lname), ' characters long') FROM books;

-- 6. changing case of string:
SELECT UPPER('Hello World');
SELECT LOWER('Hello World');
SELECT UPPER(title) FROM books;
SELECT CONCAT('MY FAVORITE BOOK IS ', UPPER(title)) FROM books;
SELECT CONCAT('MY FAVORITE BOOK IS ', LOWER(title)) FROM books

-- ORDER MATTERS !!!
SELECT UPPER(CONCAT(author_fname, ' ', author_lname)) AS "full name in caps"
FROM books; --WORKS
SELECT CONCAT(UPPER(author_fname, ' ', author_lname)) AS "full name in caps" 
FROM books; -- DOES NOT WORK !
-- UPPER only takes one argument and CONCAT takes two or more arguments, so they can't be switched in that way.

-- anyway this works!:
SELECT CONCAT(UPPER(author_fname), ' ', UPPER(author_lname)) AS "full name in caps" 
FROM books;