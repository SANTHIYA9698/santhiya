#include<stdio.h>
void main()
{
char input;
printf("Enter the input:");
scanf("%c",&input);
if((input=='Q')||(input=='q'))
exit (1);
else
printf("Invaid input");
}
