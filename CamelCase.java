package guvi;

public class CamelCase {

	public static void main(String[] args) {
     String input="enter the new world";
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
     System.out.println(output);
	}

}
