package guvi;

public class CheckWorkingDay {
public static boolean output;
	public static void main(String[] args) {
    WorkingDay("sunday");
    System.out.println(output);
	}
public static void WorkingDay(String input){
	String Days[]={"Monday","Tuesday","wednesday","Thursday","friday"};
	int t=0;
	for(int i=0;i<Days.length;i++){
		if(Days[i].equalsIgnoreCase(input)){
			System.out.println(Days[i]+" "+input);
			t++;
		}
		}
	if(t!=0){
		output=true;
	}
	else{
		output=false;
	}
}
}
