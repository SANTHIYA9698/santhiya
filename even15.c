#include<stdio.h>
void main()
{
int i,n1,n2;
printf("Enter the two values\t");
scanf("%d %d",&n1,&n2);
printf("\nAll odd numbers between %d and %d are:",n1,n2);
for(i=n1;i<=n2;i++)
{
if((i%2)==0)
printf("\n%d",i);
}
}
