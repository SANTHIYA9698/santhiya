package Hunter;

public class FirstOccurance {

	public static void main(String[] args) {
String input[]={"AB","CD","E","AN"};
int length=999999999;
String output="";
for(int i=0;i<input.length;i++){
	if(input[i].length()<length){
		length=input[i].length();
		output=input[i];
	}
}
System.out.println(output);
	}

}
