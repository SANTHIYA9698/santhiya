package Pro;

public class Palindrome {

	public static void main(String[] args) {
String input="xyxzxyxmalayalamabc";
int len=0;
String output="";
for(int i=0;i<input.length()-1;i++){
	for(int j=i+1;j<input.length();j++){
		String n1=input.substring(i,j);
		StringBuffer sb=new StringBuffer(n1);
		String n2=sb.reverse().toString();
		if(n1.equals(n2)){
			if(n1.length()>len){
				output=n1;
				len=n1.length();
			}
		}
	}
}
System.out.println(output);
	}

}
