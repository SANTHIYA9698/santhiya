package guvi;
import java.util.*;
public class Longeststring {
public static void main(String[] args) {	
				int length=999999,j=0;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
				String input2[]=new String[n];
	for(int i=0;i<n;i++){
		input[i]=s.next();
	}
			for(int i=0;i<input2.length;i++){
				if(input2[i].length()<length){
					length=input2[i].length();
					j=i;
				}
			}
			int t=0,t1=0;
			while(t==0&&(t+t1)<length){
				char ch=input2[j].charAt(t+t1);
				for(int i=0;i<input2.length;i++){
					if((input2[i].charAt(t+t1)!=ch)||(t1==input2[0].length())){
						t=1;
						break;
					}
				}if(t==0)
					t1++;
			}
			System.out.println(input2[j].substring(0,t1));
		
	}

}
