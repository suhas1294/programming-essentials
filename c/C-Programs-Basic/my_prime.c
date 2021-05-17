#include <stdio.h>
#include <math.h>

int main()
{
  int given_number,n,c,count;

  printf("Enter the number untill which you want prime number list\n");
  scanf("%d", &given_number);
  printf("Prime number untill %d are\n", given_number );

  for (n=1;n<=given_number;n++){

    for(c=1;c<=n;c++){
      if ((n%c)==0){
        count++;
      }
    }
// *************************************
    if(count == 2){
      printf("%d\t",n );
    }
    else {
      count=0;
      continue;
    }
// *************************************
  }
}