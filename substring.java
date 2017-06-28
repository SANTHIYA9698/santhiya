package logic;
import java.util.Scanner;
public class substring {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two Strings");
       String input1=s.nextLine();
       String input2=s.nextLine();
       int ouput=-1;
       if(input1.contains(input2)){
    	   int output = (input1.indexOf(input2));
    	   System.out.println(output);
       }
       else
    	   System.out.println(ouput);
       s.close();
	}
}
