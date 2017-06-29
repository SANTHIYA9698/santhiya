package logic;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class str_fun {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int words=1;
		int sentence=1;
		int integer=0;
		int alphe=0;
		Pattern p=Pattern.compile("[ -/:-?[-]]*");
		String a[]={"0","1","2","3","4","5","6","7","8","9"};
		String str=s.nextLine();		
		String str1=str.trim();
		String str2=str1.replaceAll(" ", "");
		for(int i=0;i<str1.length();i++){			
			Matcher matcher=p.matcher(str1.substring(i,i+1));
			if(matcher.matches()){
				try{
				if(!(str1.substring(i+1,i+2).equals(" "))||(str1.substring(i+1,i+2).equals("."))){
				words++;
			}
				}
				catch(StringIndexOutOfBoundsException e){
					System.out.println(e);
				}
			}
			if(str1.substring(i,i+1).equals(".")){
				sentence++;
			}
			for(int j=0;j<10;j++){
			if(str1.substring(i,i+1).equals(a[j])){				
				integer++;
			}
			}
			if(str1.substring(i,i+1).equals("e")){				
				alphe++;
			}
		}
	if(str1.substring(str1.length()-1).equals(".")){
			System.out.println(str1.substring(str1.length()));
			sentence=sentence-1;
			words=words-1;
		}
				System.out.println("1.Spaces Removed:"+str2);
				System.out.println("2.The longest word in the String is:"+str2);
				System.out.println("3.No.of letters e in the String is:"+alphe+"\n4.No.of integers in the String is:"+integer+"\n6.no.of words in the String is:"+words);
				System.out.println("7.No.of sentence in the String is:"+sentence);
				s.close();
	}
}
