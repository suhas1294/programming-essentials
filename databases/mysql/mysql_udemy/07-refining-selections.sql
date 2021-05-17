-- distinct function
SELECT author_lname FROM books; 
SELECT DISTINCT author_lname FROM books; 
SELECT author_fname, author_lname FROM books; 
SELECT DISTINCT CONCAT(author_fname,' ', author_lname) FROM books; 
SELECT DISTINCT author_fname, author_lname FROM books

-- order by clause

SELECT author_lname FROM books;
SELECT author_lname FROM books ORDER BY author_lname;
SELECT title FROM books;
SELECT title FROM books ORDER BY title;
SELECT author_lname FROM books ORDER BY author_lname DESC;
SELECT released_year FROM books;
SELECT released_year FROM books ORDER BY released_year;
SELECT released_year FROM books ORDER BY released_year DESC;
SELECT released_year FROM books ORDER BY released_year ASC;
SELECT title, released_year, pages FROM books ORDER BY released_year;
SELECT title, pages FROM books ORDER BY released_year;

SELECT title, author_fname, author_lname FROM books ORDER BY 2;
SELECT title, author_fname, author_lname FROM books ORDER BY 3;
SELECT title, author_fname, author_lname FROM books ORDER BY 1;
SELECT title, author_fname, author_lname FROM books ORDER BY 1 DESC;
SELECT author_lname, title FROM books ORDER BY 2;
SELECT author_fname, author_lname FROM books ORDER BY author_lname, author_fname


-- limit clause
SELECT title FROM books LIMIT 3;
SELECT * FROM books LIMIT 1;

SELECT title, released_year FROM books 
ORDER BY released_year DESC LIMIT 5;

SELECT title, released_year FROM books 
ORDER BY released_year DESC LIMIT 0,5;
 
SELECT title, released_year FROM books 
ORDER BY released_year DESC LIMIT 0,3;
 
SELECT title, released_year FROM books 
ORDER BY released_year DESC LIMIT 1,3;
 
SELECT title, released_year FROM books 
ORDER BY released_year DESC LIMIT 10,1;
 
SELECT * FROM tbl LIMIT 95,18446744073709551615;
 
SELECT title FROM books LIMIT 5;
 
SELECT title FROM books LIMIT 5, 123219476457;
 
SELECT title FROM books LIMIT 5, 50;


-- like query
SELECT title, author_fname FROM books WHERE author_fname LIKE '%da%';
SELECT title, author_fname FROM books WHERE author_fname LIKE 'da%';
SELECT title FROM books WHERE  title LIKE 'the';
SELECT title FROM books WHERE  title LIKE '%the';
SELECT title FROM books WHERE title LIKE '%the%'

SELECT title, stock_quantity FROM books;
SELECT title, stock_quantity FROM books WHERE stock_quantity LIKE '____';
SELECT title, stock_quantity FROM books WHERE stock_quantity LIKE '__';
(235)234-0987 LIKE '(___)___-____'
SELECT title FROM books;
SELECT title FROM books WHERE title LIKE '%\%%';
SELECT title FROM books WHERE title LIKE '%\_%';


-- challenge solution:
SELECT title FROM books WHERE title LIKE '%stories%';
 
SELECT title, pages FROM books ORDER BY pages DESC LIMIT 1;
 
SELECT 
    CONCAT(title, ' - ', released_year) AS summary 
FROM books ORDER BY released_year DESC LIMIT 3;
 
SELECT title, author_lname FROM books WHERE author_lname LIKE '% %';
 
SELECT title, released_year, stock_quantity 
FROM books ORDER BY stock_quantity LIMIT 3;
 
SELECT title, author_lname 
FROM books ORDER BY author_lname, title;
 
SELECT title, author_lname 
FROM books ORDER BY 2,1;
 
SELECT
    CONCAT(
        'MY FAVORITE AUTHOR IS ',
        UPPER(author_fname),
        ' ',
        UPPER(author_lname),
        '!'
    ) AS yell
FROM books ORDER BY author_lname;