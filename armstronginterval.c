#include<stdio.h>
#include<math.h>
void main()
{
int n1,n2,i,t1,t2,rem,n=0,result=0;
printf("Enter two values:\t");
scanf("%d\t%d",&n1,&n2);
printf("\nAll armstrong numbers between %d and %d are",n1,n2);
for(i=n1;i<=n2;i++)
{
t2=i;
t1=i;
while(t1!=0)
{
    t1/=10;
    ++n;
}
while(t2!=0)
{
rem=t2%10;
result+=pow(rem,n);
t2/=10;
}
if(result==i)
{
printf("\n%d",i);
}
n=0;
result=0;
}
}
