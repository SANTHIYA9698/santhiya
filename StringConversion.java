package Player;

public class StringConversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input1="4";
String input2="50";
try{
int num1=Integer.parseInt(input1);
int num2=Integer.parseInt(input2);
String output=Integer.toString(num1*num2);
System.out.println("The multiplication of given strings is:"+output);
	}catch(NumberFormatException e){
		
	}
	}
}
