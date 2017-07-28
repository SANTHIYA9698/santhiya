package Pro;

public class CheckSubString {

	public static void main(String[] args) {
   String inputA="1234xyz";
   String inputB="abxdekk123";
   int count=0;
   for(int i=0;i<inputA.length();i++){
  	 for(int j=i+1;j<inputA.length();j++){
  		for(int k=0;k<inputB.length();k++){
  	    	 for(int l=k+1;l<inputB.length();l++){
  	    if(inputA.substring(i,j+1).equals(inputB.substring(k,l+1))){
    count++;
  	    }
  	    	}
  	 }
   }
	}
   if(count>0){
	   System.out.println("true");
   }
   else
	   System.out.println("false");
   }
}