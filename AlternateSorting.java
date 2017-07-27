package Hunter;

import java.util.Arrays;

public class AlternateSorting {
	public static void main(String[] args) {
 int arr[]={1,2,3,4,5,6,7};
 Arrays.sort(arr);
 int arr1[]=new int[arr.length];
 int a[]=new int[arr.length/2];
 int a1[]=new int[arr.length-(arr.length/2)];
 for(int i=arr.length-1,j=0;i>=0;i--,j++){
	 arr1[j]=arr[i];
 }
 for(int i=0;i<a1.length;i++){
	 a1[i]=arr1[i];
 }
 for(int i=0;i<a.length;i++){
	 a[i]=arr[i];
 }
 for(int i=0;i<a.length;i++){
	 System.out.print(a1[i]+" "+a[i]+" ");	 
 }
 System.out.print(a1[a1.length-1]);	 

	}

}
