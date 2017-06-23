package Logics;
import java.util.*;
public class Target {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	int First=0;
	int Second=0;
	System.out.println("Enter the size of the array:");
	int size=s.nextInt();
	System.out.println("Enter the target number:");
	int target=s.nextInt();
	System.out.println("Enter the elements in the array:");
	int array[]=new int[size];
	for(int i=0;i<size;i++){
		array[i]=s.nextInt();
	}
	for(int j=0;j<size;j++){
		for(int i=0;i<size;i++){
			if(array[i]!=array[j])
			if((array[j]+array[i])==target){
				First=array[j];
				Second=array[i];
			}
		}
	}
	System.out.println("The two numbers add up to a specific target number are "+First+" and "+Second);
}
}
