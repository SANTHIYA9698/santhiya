package Hunter;

import java.util.Scanner;

public class TargetSum {
	public static void main(String[] args) {
		System.out.println(userMethod());
	}
		public static boolean userMethod(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Array Size:");
int n=s.nextInt();
int A[]=new int[n];
System.out.println("Enter the elements in the Array:");
for(int i=0;i<n;i++){
	A[i]=s.nextInt();
}
System.out.println("Enter the Target Element:");
int target=s.nextInt();
int m=s.nextInt();
int sum=0;
int output=0;
try{
for(int i=0;i<n;i++){
	sum=0;
	int k=m;
	for(int j=i;k>0;j++){
		sum+=A[j];
		//System.out.println(j+" "+k);
		k--;
	}
	if(sum==target){
		output++;
	}
	}
}catch(ArrayIndexOutOfBoundsException e){
	
}
if(output>=1){
	return true;
}
else 
	return false;
	}
	}
