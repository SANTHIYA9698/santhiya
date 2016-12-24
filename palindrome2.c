#include<stdio.h>
void main()
{
int number,n,rem,reversenum=0;
printf("Enter the number\t");
scanf("%d",&n);
number=n;
while(n!=0)
{
rem=n%10;
reversenum=reversenum*10+rem;
n/=10;
}
if(number==reversenum)
printf("\n%d is palindrome",number);
else
printf("\n%d is not a palindrome",number);
}
