package Logics;
import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int mark[]=new int[50];
for(int i=0;i<50;i++){
	mark[i]=s.nextInt();
}
Arrays.sort(mark);
int k=s.nextInt();
System.out.println("\n 4th tallest:"+mark[50-4]);
System.out.println("kth tallest:"+mark1[50-k]);
		s.close();
	}

}
