#include<stdio.h>
void main()
{
char ch;
printf("Enter the character ");
scanf("%s",&ch);
if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))
printf("It is an alphabet");
else
printf("It is not an alphabet");
}
