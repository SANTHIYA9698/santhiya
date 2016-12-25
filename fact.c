#include<stdio.h>
#include<math.h>
int fact(int);
int main()
{
int factorial,num;
printf("Enter the number:\t");
scanf("%d",&num);
factorial=fact(num);
printf("factorial of %d is %d",num,factorial);
return 0;
}
int fact(int n)
{
    if(n==0)
        return(1);
    else
        return(n*fact(n-1));
}
