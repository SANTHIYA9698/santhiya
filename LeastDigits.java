package logic;
import java.util.Arrays;
import java.util.Scanner;

public class LeastDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input number:");
		int input=s.nextInt();
		String str1=Integer.toString(input);
		System.out.println("Enter the k value:");
		int k=s.nextInt();
		int size=str1.length();
		String str2[]=new String[size];
		String str3="\0";
		String str4="\0";
		for(int i=0;i<size;i++){
			str2[i]=str1.substring(i,i+1);
		}
		Arrays.sort(str2);
		for(int i=0;i<(size-k);i++){
			str3=str2[i];
			str4=str4.concat(str3);
		}
		System.out.println("The least digit number is:"+str4);
		s.close();
	}

}
