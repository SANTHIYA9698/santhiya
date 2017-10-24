package Hunter;
import java.util.*;
public class MAX_INT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
      int number1=s.nextInt();
      int number2=s.nextInt();
      int Division=0;
      if(number1<number2){
    	  System.out.println("MAX_INT");
      }
      else {
    	  while(number1>=number2){
    	  number1=number1-number2;
    	  Division++;
      }
      System.out.println("The Division of Integer1 and Integer2 is:"+Division);
	}
		s.close();
	}
}
