#include <stdio.h>

int main()
{
   int n, sum = 0, c, value;

   printf("Enter the number of integers you want to add\n");
   scanf("%d", &n);

   printf("Enter %d integers\n",n);

   for (c = 1; c <= n; c++)
   {
      scanf("%d", &value);
      sum = sum + value;
   }

   printf("Sum of entered integers = %d\n",sum);

   return 0;
}

// #include <stdio.h>

// int main()
// {
//    int n, sum = 0, c, array[100];

//    scanf("%d", &n);

//    for (c = 0; c < n; c++)
//    {
//       scanf("%d", &array[c]);
//       sum = sum + array[c];
//    }

//    printf("Sum = %d\n",sum);

//    return 0;
// }