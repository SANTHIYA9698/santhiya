package Hunter;

public class CoPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=2;
        int num2=4;
        int count=0;
        for(int i=2;i<num1/2;i++){
        	if((num1%i)==0){
        		count++;
        	}
        }
        if(count==0){
        	 for(int i=2;i<num2/2;i++){
             	if((num2%i)==0){
             		count++;
             	}
             }            
        }
        if(count==0){
        	System.out.println("Co-Prime numbers");
        }
        else
        	System.out.println("Not Co-Prime numbers");

	}

}
