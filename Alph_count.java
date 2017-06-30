package logic;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Alph_count {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the InputString:");
		String str=s.nextLine();
  String str1[]=new String[str.length()];
  String str2[]=new String[str.length()];
  Pattern p=Pattern.compile("[a-zA-Z]*");
  int j=0,j1=0;
  for(int i=0;i<str.length();i++){
	  Matcher matcher=p.matcher(str.substring(i,i+1));
	  if(matcher.matches()){
		  str1[j]=str.substring(i,i+1);
		 str=str.replace(str.substring(i,i+1)," ");
		  j++;
	  }
  }   
  String words[]=str.split(" ");
  for(String w:words){
	 	  str2[j1]=w;
	  	  j1++;
  }
  int arr[]=new int[str.length()];
  for(int i=0;i<str2.length;i++){
		 try{
	  arr[i]=Integer.parseInt(str2[i]);
	 	  }
	  catch(NumberFormatException e){
		
	  }
	  }
 j=0;
 System.out.print("Output:");
   for(int i=0;i<arr.length;i++){
	   try{
		   while(arr[i]!=0){
		  System.out.print(str1[j]);
		  arr[i]--;
	   }
		   if(i>=1)
	   j++;
	 }
	   catch(ArrayIndexOutOfBoundsException v){
		   
		   }
	   }
   s.close();
	}
}
