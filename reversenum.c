#include<stdio.h>
int main()
{
int n,revnum=0,rem;
printf("Enter the number:");
scanf("%d",&n);
while(n!=0)
{
rem=n%10;
revnum=revnum*10+rem;
n/=10;
}
printf("\nReversed number is %d",revnum);
return 0;
}
