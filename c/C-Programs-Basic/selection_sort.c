#include <stdio.h>

int main()
{
  int a[100], n, i, j, pos;

  printf("Enter number of elements\n");
  scanf("%d", &n);

  printf("Enter %d integers\n", n);
  for ( i=0; i< n ; i++ )
  {
    scanf("%d", &a[i]);
  }

  // selection sort logic
  for ( i=0 ; i<(n-1) ; i++ )
  {
    pos = i;

    for ( j = i+1 ; j<n ; j++ )
    {
      if ( a[pos] > a[j] )
        pos = j;
    }

    if ( pos != i )
    {
      a[pos] = a[pos] + a[i] ;
      a[i]   = a[pos] - a[i] ;
      a[pos] = a[pos] - a[i] ;
    }

  }

  printf("Sorted list in ascending order:\n");

  for ( i = 0 ; i < n ; i++ )
    printf("%d\n", a[i]);

  return 0;
}