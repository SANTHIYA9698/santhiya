package Pro;

public class PangramChecker {

	public static void main(String[] args) {
 String Alph="abcdefghijklmnopqrstuvwxyz";
 String input="The brown fox jumps over the lazy dog quickly";
 int count=0;
 int size=0;
 for(int i=0;i<Alph.length();i++){
	 count=0;
	 for(int j=0;j<input.length();j++){
		 if(Alph.substring(i,i+1).equals(input.substring(j,j+1))){
			 count++;
		 }
	 }
	 if(count>0){
		 size++;
	 }
 }
 if(size==26){
	 System.out.println("Pangram");
 }
 else{
	 System.out.println("Not a Pangram");

 }
	}

}
