#include<stdio.h>
void main()
{
int n1,n2,minmul;
printf("Enter the two integers:");
scanf("%d %d",&n1,&n2);
minmul=((n1>n2)?n1:n2);
while(1)
{
if(((minmul%n1)==0)&&((minmul%n2)==0))
{
printf("The lcm of %d,%d is %d",n1,n2,minmul);
break;
}
else
++minmul;
}
}
