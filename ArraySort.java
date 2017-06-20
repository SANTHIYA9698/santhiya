package Logics;
import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int mark[]=new int[50];
int mark1[]=new int[50];
for(int i=0;i<10;i++){
	mark[i]=s.nextInt();
}
Arrays.sort(mark);
for(int i=9,j=0;i>=0;i--,j++){
mark1[j]=mark[i];	
}
for(int i=0;i<10;i++){
	System.out.print(mark1[i]+" ");
}
int k=s.nextInt();
System.out.println("\n 4th tallest:"+mark1[3]);
System.out.println("kth tallest:"+mark1[k-1]);
	}

}
