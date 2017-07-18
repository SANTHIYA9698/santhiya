package guvi;

public class SwapEvenOdd {

	public static void main(String[] args) {
     String input="Hello World";
     String output="";
     for(int i=0;i<input.length();i++){
    	 if((i%2)==0){
    		output+=input.charAt(i); 
    	 }
     }
     for(int i=0;i<input.length();i++){
    	 if((i%2)!=0){
    		 output+=input.charAt(i);
    	 }
     }
     System.out.println("Swaped String is:"+output);
	}

}
