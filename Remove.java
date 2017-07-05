package logic;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number Of elements in array:");
   int n=s.nextInt();
   System.out.println("Enter the elements:");
   int arr[]=new int[n];
   int j=0;
for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
System.out.println("Enter the element to be removed:");
int element=s.nextInt();
for(int i=0;i<n;i++){
	if(arr[i]!=element){
		j++;
	}
} int count=0;
	int array[]=new int[j];
	for(int i=0;i<n;i++){
		if(arr[i]!=element){
			array[count]=arr[i];
			count++;
		}
	}
	for(int i=0;i<j;i++){
		System.out.println(array[i]);
	}
	s.close();
	}
}

