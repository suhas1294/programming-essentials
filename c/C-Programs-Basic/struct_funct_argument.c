// Structures as Function Arguments
// To get the difference between basic structure and structure as function arguments see the printing part of program
#include <stdio.h>
#include <string.h>

struct Books {
 char  title[50];
 char  author[50];
 char  subject[100];
 int   book_id;
};

/* function declaration */
void printBook( struct Books book );

int main( ) {

 struct Books Book1;        /* Declare Book1 of type Book */
 struct Books Book2;        /* Declare Book2 of type Book */

 /* book 1 specification */
 strcpy( Book1.title, "C Programming");
 strcpy( Book1.author, "Dennis Ritchie");
 strcpy( Book1.subject, "C Programming structures");
 Book1.book_id = 6495407;

 /* book 2 specification */
 strcpy( Book2.title, "World-wide-web");
 strcpy( Book2.author, "Tim Berners-Lee");
 strcpy( Book2.subject, "The Internet");
 Book2.book_id = 6495700;

 /* print Book1 info */
 printBook( Book1 );

 /* Print Book2 info */
 printBook( Book2 );

 return 0;
}

void printBook( struct Books book ) {

 printf( "\nBook title : %s\n", book.title);
 printf( "Book author : %s\n", book.author);
 printf( "Book subject : %s\n", book.subject);
 printf( "Book book_id : %d\n", book.book_id);
}
