package player;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String input=")()())";
 int ch1=0;
 int ch2=0;
 int output=0;
 for(int i=0;i<input.length();i++){
	 if(input.substring(i,i+1).equals("(")){
		 ch1++;
	 }
	 else if(input.substring(i,i+1).equals(")")){
		 ch2++;
	 }
 }
 if(ch1==ch2){
	 output=ch1+ch2;
 }
 else if(ch1>ch2){
	 output=ch2+ch2;
 }
 else{
	 output=ch1+ch1;
 }
 System.out.println(output);
	}

}
