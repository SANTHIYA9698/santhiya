#include<stdio.h>
int main()
{
int n,i,dummy=0;
printf("Enter the number\t");
scanf("%d",&n);
for(i=2;i<=n/2;i++)
{
if((n%i)==0)
{
dummy=1;
break;
}
}
if(dummy==1)
printf("\n%d is not a prime number",n);
else
printf("\n%d is a prime number",n);
return 0;
}
