package Hunter;

public class MinimumSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int Array[]={15,5,-20,30,-45};
 int sum=0;
 int limit=999999999;
 int num1=0,num2=0;
 for(int i=0;i<Array.length;i++){
	 for(int j=i+1;j<Array.length;j++){
		 sum=Array[i]+Array[j];
		 int temp=sum;
		 if(temp<0){
			 temp=(temp)+(-2*temp);
		 }
		 if(temp<limit){
			 limit=sum;
			 num1=Array[i];
			 num2=Array[j];
		 }
	 }
 }
 System.out.println(num1+" "+num2);
	}

}
