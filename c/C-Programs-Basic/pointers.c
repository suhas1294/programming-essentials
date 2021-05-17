// Basic concept of pointers explained
// Source : http://www.tutorialspoint.com/cprogramming/c_pointers.htm
#include <stdio.h>

int main () {
   // %x is for hexadecimal
 int  var1 = 512;
 char var2[] = "john doe";

 printf("value of var1 : %d\n", var1);
 printf("value of var2 : %s\n", var2 );

 printf("Address of var1 variable: %x\n", &var1  );
 printf("Address of var2 variable: %x\n", &var2  );

 printf("=======================\n\n");

 int  var = 20;   /* actual variable declaration */
 int  *ip;        /* pointer variable declaration */
 int *ptr = NULL ; /* NUll pointer declaration */

 ip = &var;  /* store address of var in pointer variable*/

 printf("Address of var variable: %x\n", &var  );

   /* address stored in pointer variable */
 printf("Address stored in ip variable: %x\n", ip );

   /* access the value using the pointer */
 printf("Value of *ip variable: %d\n\n", *ip );
 printf("ip = %x\n", ip);
 printf("*ip = %d\n", *ip);

   // %d is for integer, %x is for hexadecimal
 int zsh = 45;
 printf("\n45 in decimal  : %d", zsh);
 printf("\n45 in hexadecimal :%x", zsh);

  printf("\n\n===== Pointers for arithmatic opearations ====\n\n");

 // arithmatic operations on pointer
 const int MAX = 3;
 int  arr1[] = {10, 100, 200};
 int  i, *p1;
   /* let us have array address in pointer */
 p1 = arr1;
 printf ("Address \t\t\t values\n");

 for ( i = 0; i < MAX; i++)
 {
  printf("Address of arr1[%d] = %x\t", i, p1 );
  printf("Value of arr1[%d] = %d\n", i, *p1 );
  /* move to the next location */
  p1++; /* Important */
 }
  printf("\n===== Array of pointers ====\n");
  // Array of pointers example
  int ii, *p2[MAX];
  int  arr2[] = {10, 100, 200};
  for ( ii = 0; ii < MAX; ii++) {
          p2[ii] = &arr2[ii]; /* assign the address of integer. */
  }

  for ( ii = 0; ii < MAX; ii++) {
    printf("Value of arr2[%d] = %d and it address is %x\n", ii, *p2[ii], p2[ii] );
  }

  printf("\n===== Char Pointers used to store strings ====\n");
  // Example-1 Char-Pointers used to store string values
  const int maxx = 4;
  char *names[] = {
    "random_name 1",
    "random_name 2",
    "random_name 3",
    "random_name 4",
  };
  int j = 0;
  for ( j = 0; j < maxx; j++) {
    printf("Value of names[%d] = %s and it's address %x \n", j, names[j], *names[j] );
  }

  // Example-2 for storing strings in pointers (instead of addresses)
  const int aaa  = 4;
  printf("\n\ntesting\n");
  char *random_numbers[] = {"kamfkama", "sdfjb", "sfdjnfjd", "dfjnf", "sdfjufuwneuf" };
  int dd = 0;
  for (dd=0;dd<aaa;dd++){
    printf("value of numb[%d] is %s\n", dd, random_numbers[dd]); /* here *random_numbers[dd] is not used */
  }

  // pointer to pointers concept
   int  some_variable;
   int  *pointer;
   int  **pointer_to_pointer;

   some_variable = 3000;
   /* take the address of some_variable */
   pointer = &some_variable;
   /* take the address of pointer using address of operator & */
   pointer_to_pointer = &pointer;
   /* take the value using pointer_to_pointer */
   printf("\nsome_variable = %d\n\n", some_variable );
   printf("pointer = %x : pointer = address of some_variable : hex\n", pointer);
   printf("*pointer = %d : 8pointer = value of some_variable : 3000\n\n", *pointer );
   printf("pointer_to_pointer = %x : pointer_to_pointer stores address of 'pointer' i.e : some hex\n", pointer_to_pointer );
   printf("**pointer_to_pointer = %d : *pointer_to_pointer stores value of 'pointer' i.e : 3000, 3000 is value of pointer \n", **pointer_to_pointer);
  return 0;
}
