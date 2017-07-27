package Hunter;

public class NeighbourWords {

	public static void main(String[] args) {
     String Alph="abcdefghijklmnopqrstuvwxyz";
     String word1="apple";
     String word2="alpep";
     int count1[]=new int[26];
     int count2[]=new int[26];
     if(word1.length()!=word2.length()){
    	 System.out.println("Invalid");
     }
     else {
     for(int i=0;i<Alph.length();i++){
    	 for(int j=0;j<word1.length();j++){
    		 if(Alph.substring(i,i+1).equals(word1.substring(j,j+1))){
    			 count1[i]++;
    		 }
    		 if(Alph.substring(i,i+1).equals(word2.substring(j,j+1))){
    			 count2[i]++;
    		 }
    	 }
     }
	}
     int count=0;
     for(int i=0;i<26;i++){
    	if(count1[i]!=count2[i]){
    		count++;
    	}
     }
     if(count!=0){
    	 System.out.println("Invalid");
     }
     else
    	 System.out.println("valid");

	}
}
