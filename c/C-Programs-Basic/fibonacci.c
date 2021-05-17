#include <stdio.h>
#include <math.h>

int main()
{

  int a[25],i,j;
  a[0]=0;
  a[1]=1;

  for(i=0;i<=25;i++){
    a[i+2] = a[i] + a[i+1];
  }

  for(j=0;j<25;j++){
    printf("%d\n", a[j]);
  }

}