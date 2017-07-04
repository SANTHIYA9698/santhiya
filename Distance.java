package logic;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int min2=0,min1=0;
       System.out.println("Enter the number of elements in the array:");
       int size=s.nextInt();
       int arr[]=new int[size];
       System.out.println("Enter the elements in the array:");
       for(int i=0;i<size;i++){
    	   arr[i]=s.nextInt();
       }
       System.out.println("Enter the two elements:");
       int element1=s.nextInt();
       int element2=s.nextInt();
       for(int i=0;i<size;i++){
    	   for(int j=i+1;j<size;j++){
    			   if(arr[i]==arr[j]){
    				   while(j<(size-1)){
    				   arr[j]=arr[j+1];
    				   j++;
    				   }
    				   size--;
    			   }
    		   }
    	   }
       
       for(int j=0;j<size;j++){
    	   if(arr[j]==element1){
    		   min1=j;
    	   }
    	   if(arr[j]==element2){
    		   min2=j;
    	   }
       }
    	   if(min1>min2)
         System.out.println("The minimum distance between the two elements in the array is:"+(min1-min2));
    	   else
    	         System.out.println("The minimum distance between the two elements in the array is:"+(min2-min1));

s.close();
	}

}
