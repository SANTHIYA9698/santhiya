#include<stdio.h>
void main()
{
    int x[30],i,lar;
    printf("Get the numbers\n");
    for(i=0;i<2;i++)
    {
    scanf("%d",x[i]);
    printf("%d \t",x[i]);
    }
    lar=0;
    for(i=0;i<2;i++)
    {
    if(lar<x[i])
        lar=x[i];
    }
        printf("The largest among three numbers is %d",lar);
}
