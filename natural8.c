#include<stdio.h>
void main()
{
  int a[10],n,i,sum=0;
  printf("Enter n value");
  scanf("%d",&n);
  printf("enter the vaues");
  for(i=1;i<=n;i++)
  {
      scanf("%d",&a[i]);
      if(a[i]>0)
        sum+=a[i];
  }
  printf("The sum of the numbers is %d",sum);

}
