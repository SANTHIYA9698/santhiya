package Hunter;

public class Primedigit3 {

	public static void main(String[] args) {
 int n=25;
 int count=0,sum=0;
 for(int i=2;i<n;i++){
	 count=0;
	 for(int j=2;j<i/2;j++){
		 if((i%j)==0){
			 count++;
		 }
	 }
	 if(count==0){
		 if((i%10)==3){
			 sum+=i;
		 }
	 }
 }
 System.out.println(sum);
	}

}
