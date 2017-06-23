package Logics;
import java.util.*;
public class SubArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int subarr[]=new int[2];
		int mul=0,temp=0;
		for(int i=0;i<10;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
					temp=a[i]*a[j];
					if(temp>mul){
						subarr[0]=a[i];
						subarr[1]=a[j];
						mul=temp;
					}
				}
			}
	
		System.out.println("The array is "+subarr[0]+" "+subarr[1]);
		System.out.println("The product is "+mul);
	}

}
