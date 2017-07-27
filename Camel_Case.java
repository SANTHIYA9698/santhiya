package Hunter;

public class Camel_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     String input="Enter The New World";
		     String output="";
		     output+=(input.substring(0,1)).toUpperCase();
		     for(int i=1;i<input.length();i++){
		    	 if(input.substring(i-1,i).equals(" ")){
		    		 output+=input.substring(i,i+1).toUpperCase();
		    	 }
		    	 else{
		    		 output+=input.substring(i,i+1);
		    	 }
		     }
		     if(input.equals(output)){
		    	 System.out.println("The given String is Camel Case");		    	 
		     }
		     else{
		    	 System.out.println("The given String is not Camel Case");		   	 

		     }
			}
}
