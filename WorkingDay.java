package Hunter;

public class WorkingDay {

	public static void main(String[] args) {
 System.out.println(UserMethod("monday"));
	}
	public static boolean UserMethod(String input){
		if((input.equalsIgnoreCase("sunday"))||(input.equalsIgnoreCase("saturday"))){			
			return false;
	}
		else
		return true;
	}
}
