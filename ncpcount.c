#include<stdio.h>
#include<string.h>
void main()
{
int cnum,cchar,cspace,cspclchar,calphanum,i;
char strng[100];
cnum=cchar=cspace=cspclchar=calphanum=0;
printf("Enter the string:");
gets(strng);
for(i=0;strng[i]!='\0';i++)
{
if(strng[i]>='0'&&strng[i]<='9')
cnum++;
else if((strng[i]>='A'&&strng[i]<='Z')||(strng[i]>='a'&&strng[i]<='z'))
cchar++;
else if(strng[i]==' ')
cspace++;
else
cspclchar++;
}
printf("\n Numbers:%d \nCharaters:%d",cnum,cchar);
calphanum=cnum+cchar+cspace+cspclchar;
printf("\nAlphanumerics:%d",calphanum);
}
