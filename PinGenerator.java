package Pro;

public class PinGenerator {

	public static void main(String[] args) {
     String input1="Robin";
     String input2="Rocky";
     String PIN="560037";
     int N=6;
     String Smaller_Name="";
     String Longer_Name="";
     if(input1.length()<input2.length()){
    	 Smaller_Name=input1;
    	 Longer_Name=input2;
     }
     else if(input2.length()<input1.length()){
    	 Smaller_Name=input2;
    	 Longer_Name=input1;
     }
     else {
    	 for(int i=0;i<input1.length();i++){
    		 if(!(input1.substring(i,i+1).equals(input2.substring(i,i+1)))){
    			 char ch1=input1.charAt(i);
    			 char ch2=input2.charAt(i);
       			 if((int)ch1>(int)ch2){
    				Smaller_Name=input1;
    				Longer_Name=input2;
    			 }
    			 else{
    				 Smaller_Name=input2;
     				Longer_Name=input1;
    			 }
    		 }
    	 }
     }
    	String output="";
    	output=Longer_Name.substring(0,1)+Smaller_Name;
    	StringBuffer sb=new StringBuffer(PIN);
		String PINRev=sb.reverse().toString();
		try{
		for(int i=1;i<=PIN.length();i++){
			if(i==N){
				output+=PIN.substring(i-1,i)+PINRev.substring(i-1,i);
			}
		}
		}catch(StringIndexOutOfBoundsException e){
			
		}
		System.out.println(output); 
	}

}
