package Hunter;

public class Keyboard {

	public static void main(String[] args) {
       int input=456;
       int rem=0;
       String output="";
       while(input!=0){
    	  rem=input%10;
    	  input=input/10;
    	  switch(rem){
    	  case 1:
    		 output+="";
    		 break;
    	  case 2:
    		  output+="ABC";
    		  break;
    	  case 3:
    		  output+="DEF";
    		  break;
    	  case 4:
    		  output+="GHI";
    		  break;
    	  case 5:
    		  output+="JKL";
    		  break;
    	  case 6:
    		  output+="MNO";
    		  break;
    	  case 7:
    		  output+="PQRS";
    		  break;
    	  case 8:
    		  output+="TUV";
    		  break;
    	  case 9:
    		  output+="WXYZ";
    		  break;
    	  }
       }
       System.out.println("Possible Strings are:");
       StringBuffer rev=new StringBuffer(output);
       String output1=rev.reverse().toString();
       System.out.println(output+"\n"+output1);
       for(int i=0;i<=output.length();i++){
    	   for(int j=i+1;j<=output.length();j++){
    		   System.out.println(output.substring(i,j));
    		   System.out.println(output1.substring(i,j));
    	   }
       }
	}
}
