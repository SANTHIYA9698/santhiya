#include<stdio.h>
void main()
{
    int yr;
    printf("Enter the year ");
    scanf("%d",&yr);
    if((yr%4)==0)
        printf("It is leap year");
    else
        printf("It is not a leapyear");
    }
