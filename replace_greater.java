package logic;

import java.util.Scanner;

public class replace_greater {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int temp=0;
   System.out.println("Enter the number Of elements in array:");
   int n=s.nextInt();
   System.out.println("Enter the elements:");
   int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
for(int i=0;i<n;i++){
	temp=0;
	for(int j=i+1;j<n;j++){
		if(temp<arr[j]){
			temp=arr[j];
		}
	}
	arr[i]=temp;
	   System.out.print(arr[i]+" ");

}
s.close();
	}

}
