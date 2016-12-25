#include<stdio.h>
void main()
{
int n,i,x;
printf("Enter the integer:\t");
scanf("%d",&n);
printf("Multiplication table for %d is:\n",n);
for(i=1;i<=10;i++)
{
x=n*i;
printf("\n%d * %d = %d",n,i,x);
}
}
