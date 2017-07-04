package logic;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number Of elements in array:");
   int n=s.nextInt();
   System.out.println("Enter the elements:");
   int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
System.out.println("Enter the element to be removed:");
int element=s.nextInt();
for(int i=0;i<n;i++){
	if(arr[i]==element){
		arr[i]=arr[i+1];
	}
	n--;
	}
for(int i=0;i<n;i++){
System.out.println(arr[i]);
	}
}
}
