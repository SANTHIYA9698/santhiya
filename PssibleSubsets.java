package Hunter;

public class PssibleSubsets {

	public static void main(String[] args) {
  String input="Programming";
  int length=4;
  System.out.println("The possible subsets are:");
  try{
  for(int i=0;i<input.length();i++){
		  System.out.println(input.substring(i,i+length));
  }
  }catch(StringIndexOutOfBoundsException e){
	  
  }
	}

}
