#include<stdio.h>
#include<string.h>
void main()
{
char ch[10];
char *ch1;
printf("Enter the string");
scanf("%s",&ch);
ch1=strrev(ch);
printf("%s",ch1);
}
