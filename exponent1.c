#include<stdio.h>
#include<math.h>
int main()
{
double base,exponent,result;
printf("Enter the base value:");
scanf("%lf",&base);
printf("\nEnter the exponent value:");
scanf("%lf",&exponent);
result=pow(base,exponent);
printf("\nThe power is %lf",result);
}
