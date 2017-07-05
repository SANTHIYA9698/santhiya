package logic;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the number Of elements in array:");
int n=s.nextInt();
System.out.println("Enter the elements:");
int arr[]=new int[n];
int arr1[]=new int[n-1];
for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
int temp=0,n1=0,n2=0;
int i1=0,i2=0;
for(int i=0;i<n;i++){
	if(i!=(arr.length-1)){
		if(arr[i]>arr[i+1])
		arr1[i]=arr[i]-arr[i+1];
		else
			arr1[i]=arr[i+1]-arr[i];
		if(arr1[i]>temp){
			temp=arr1[i];
			n1=arr[i];
			i1=i;
			n2=arr[i+1];
			i2=i+1;
		}
	}
}
if(n1>n2)
	System.out.println("The index of greatest difference is:"+i1);	

	else
		System.out.println("The index of the largest element which has greatest difference is:"+i2);
s.close();
	}
}