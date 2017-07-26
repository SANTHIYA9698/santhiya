package Hunter;

public class StringMultiplication {

	public static void main(String[] args) {
String number1="40";
String number2="50";
try{
String output=Integer.toString(Integer.parseInt(number1)*Integer.parseInt(number2));
System.out.println(output);
}catch(NumberFormatException e){
	
}
	}

}
