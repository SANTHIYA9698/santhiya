package Pro;

public class CodeKata {

	public static void main(String[] args) {
String input1="code";
String input2="kata";
char ch;
String result="";
for(int i=0;i<input1.length();i++){
	ch=(char) (input1.charAt(i)+10);
	result+=ch;
}
result+=" ";
for(int i=0;i<input2.length();i++){
	if((i==0)||(i==input2.length()-1)){
		result+=input2.charAt(i);
	}
	else if((i!=0)&&(i!=input2.length()-1)){
		int flag=(input2.charAt(i)+10);
		if(flag>122){
			flag=flag-26;
		}
		ch=(char)flag;
		result+=ch;
	}
}
System.out.println(result);
	}

}
