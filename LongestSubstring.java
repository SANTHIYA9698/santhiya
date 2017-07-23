package Pro;

public class LongestSubstring {
	public static void main(String[] args) {
   String input="bbbb";
   int count=0,count1=0;
   int length=0;
   for(int i=0;i<input.length();i++){
	   for(int j=(i+1);j<input.length();j++){
		  String substring=input.substring(i,j);
		  count=0;
		  count1=0;
		  for(int k=0;k<substring.length();k++){
			  for(int l=k+1;l<substring.length();l++){
				  count1++;
				  if(!(substring.substring(k,k+1).equals(substring.substring(l,l+1)))){
					  count++;
				  }
			  }
			  if(count==count1){
				 if(substring.length()>length){
					 length=substring.length();
				 }
			  }
		  }
	   }
   }
   System.out.println(length);
	}

}
