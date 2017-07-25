package player;

public class MiddleStar {
public static String output="";
	public static void main(String[] args) {
  pairStar("xxyy");
  System.out.println(output);
	}
public static void pairStar(String input){
	try{
	for(int i=0;i<input.length();i++){
		if(input.substring(i,i+1).equals(input.substring((i+1),(i+2)))){
			output+=input.substring(i,i+1)+"*";
		}
		else{
			output+=input.substring(i,i+1);
		}
		
	}
	}catch(StringIndexOutOfBoundsException e){
	
}
	output+=input.substring(input.length()-1);
}
}