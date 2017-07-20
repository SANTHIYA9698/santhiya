package Hunter;

public class JumpingNumbers {

	public static void main(String[] args) {
  int number=4345;
  String input=Integer.toString(number);
  int count=0;
  if(input.length()==1){
	  System.out.println("Jumping Number");	  
  }
  else {
	  try{
	  for(int i=0;i<input.length();i++){
		  int difference=((int)input.charAt(i)-(int)input.charAt(i+1));
		  if((difference==1)||(difference==-1)){
			  count++;
		  }
	  }
	  }catch(StringIndexOutOfBoundsException e){
		  
	  }
	  if(count==(input.length()-1)){
		  System.out.println("jumping Number");
	  }
	  else
		  System.out.println("It is not a jumping number");
  }
	}

}
