#include<stdio.h>
#include<conio.h>
void main()
{
    char x;
    printf("Get the character ");
    scanf("%c",&x);
    if(x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U')
        printf("The character is vowel");
        else
            printf("It is consonant");
            getch();
}

