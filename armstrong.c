#include<stdio.h>
int main()
{
int n,originalvalue,rem,result=0;
printf("Enter a the digit number:\t");
scanf("%d",&n);
originalvalue=n;
while(originalvalue!=0)
{
rem=originalvalue%10;
result+=rem*rem*rem;
originalvalue/=10;
}
if(result==n)
printf("%d is a armstrong number",n);
else
printf("%d is not a armstrong number",n);
return 0;
}

