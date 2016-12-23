#include<stdio.h>
void main()
{
    int a;
    printf("enter the number");
    scanf("%d",&a);
    if(a>0)
        printf("positive number");
    else if(a<0)
        printf("negative number");
    else
        printf("zero");
}
