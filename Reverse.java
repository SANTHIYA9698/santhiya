package Logics;
import java.util.*;
public class Reverse {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String []str1=str.split("\\s");
		for(String str2:str1)
		{
			StringBuffer str3=new StringBuffer(str2);
			System.out.print(str3.reverse()+" ");
		}
	}

}
