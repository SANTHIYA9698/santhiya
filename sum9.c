#include<stdio.h>
void main()
{
int a[100],i,sum=0,n;
printf("enter n value");
scanf("%d",&n);
printf("Enter the values");
for(i=1;i<=n;i++)
{
scanf("%d",&a[i]);
sum=sum+a[i];
}
printf("The sum of n numbers is %d",sum);
}
