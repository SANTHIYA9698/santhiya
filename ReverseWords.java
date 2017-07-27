package Hunter;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String input="hello world";
 StringBuffer buffer=new StringBuffer(input);
 String reverse=buffer.reverse().toString();
 String words[]=reverse.split(" ");
 String output="";
 for(String W:words){
	 StringBuffer rev=new StringBuffer(W);   
	 output+=rev.reverse().toString()+" ";
 }
 System.out.println(output);
	}

}
