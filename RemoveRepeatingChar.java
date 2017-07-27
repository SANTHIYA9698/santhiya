package Hunter;

public class RemoveRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String input="Engineering";
    String output="";
    int count=0;
    for(int i=0;i<input.length();i++){
    	count=0;
    	for(int j=0;j<input.length();j++){
    		if(i!=j){
    			if(input.substring(i,i+1).equals(input.substring(j,j+1))){
    				count++;
    			}
    		}
    	}
    	if(count==0){
    		output+=input.substring(i,i+1);
    	}
    }
    System.out.println(output);
	}

}
