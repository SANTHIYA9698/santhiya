#include<stdio.h>
void main()
{
int n1,n2,i,temp;
printf("Enter the two numbers\t");
scanf("%d %d",&n1,&n2);
printf("All prime numbers between %d and %d",n1,n2);
while(n1<n2)
{
temp=0;
for(i=2;i<=n1/2;i++)
{
if((n1%i)==0)
{
temp=1;
break;
}
}
if(temp==0)
printf("\n%d",n1);
++n1;
}
}
