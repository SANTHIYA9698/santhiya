package logic;

import java.util.Scanner;

public class ZeroOneCount {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
     System.out.println("Enter the no of elements in the array");
     int n=s.nextInt();
     String input[]=new String[n];
     System.out.println("Enter the elements in the array");
     int count=0;
    for(int i=0;i<n;i++){
    	input[i]=s.next();
    	if(input[i].length()>=3){
    		if((input[i].substring(0,2).equals("10"))||(input[i].substring(0,2).equals("01"))){
    			count++;
    		}
    	}
    }
    System.out.println("The count of the strings having prefix 10 or 01 is:"+count);
    s.close();
	}
}
