package Hunter;

public class MAX_INT {

	public static void main(String[] args) {
      int number1=11;
      int number2=3;
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
	}
}
