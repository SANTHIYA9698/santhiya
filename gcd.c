#include<stdio.h>
void main()
{
int n1,n2,n3,i,gcd;
printf("Enter the two numbers:");
scanf("%d %d %d",&n1,&n2,&n3);
for(i=1;i<=n1&&i<=n2;i++)
{
if((n1%i)==0&&(n2%i)==0&&(n3%i)==0)
{
gcd=i;
}
}
printf("gcd of %d,%d and %d is:%d",n1,n2,n3,gcd);

}

