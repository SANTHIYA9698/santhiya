package Hunter;
import java.util.*;
public class StringMultiplication {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
String number1=s.next();
String number2=s.next();
try{
String output=Integer.toString(Integer.parseInt(number1)*Integer.parseInt(number2));
System.out.println(output);
}catch(NumberFormatException e){
	
}
		s.close();
	}

}
