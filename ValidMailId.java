package Hunter;

public class ValidMailId {

	public static void main(String[] args) {
String Email="santhiyampp@gmail.com";
int condition12=0;
int condition3=0;
int condition4=0;
int count=0;
for(int i=0;i<Email.length();i++){
	condition4++;
	if((Email.substring(i,i+1).equals("@"))||(Email.substring(i,i+1).equals("."))){
		condition12++;
	}
if(Email.substring(i,i+1).equals("@")){
	if(condition4>3){
		count++;
	}
	for(int j=(i+1);!(Email.substring(j,j+1).equals("."));j++){
		condition3++;
	}
	if(condition3==5){
		count++;
	}
}

	}
if(condition12==2){
	count++;
}
if(Email.substring((Email.length()-4),Email.length()).equals(".com")){
	count++;
}
if(count==4){
	System.out.println("Valid Mail Id");
}
else
	System.out.println("InValid Mail Id");
	}

}
