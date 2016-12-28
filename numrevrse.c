#include<stdio.h>
#include<string.h>
void main()
 {
   int n;
   char str[100];
  printf("\nEnter the number: ");
   scanf("%d", &n);
   sprintf(str, "%d", n);
   strrev(str);
   n=atoi(str);
   printf("\nReversed number: ");
   printf("%d", n);
}


