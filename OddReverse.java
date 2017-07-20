package Hunter;

public class OddReverse {

	public static void main(String[] args) {
String input="This is an example for java programming";
String output="";
String[] split=input.split(" ");
int i=0;
for(String w:split){
	if((i%2)!=0){
		StringBuffer rev=new StringBuffer(w);
		output+=rev.reverse().toString()+" ";
		i++;
	}
	else {
		output+=w+" ";
	i++;
	}
}
System.out.println(output);
	}

}
