#include<stdio.h>
#include<conio.h>
void main()
{
int f1=0,f2=1,i,seriesvalue,n;
printf("Enter the number:\t");
scanf("%d",&n);
printf("The fibonacci series upto %d is:",n);
for(i=1;i<=n;i++)
{
if(i==1)
{
printf("\n%d",f1);
continue;
}
if(i==2)
{
printf(",%d",f2);
continue;
}
seriesvalue=f1+f2;
f1=f2;
f2=seriesvalue;
printf(",%d",seriesvalue);
}
getch();
}
