package guvi;

public class CountPrime {

		public static void main(String[] args) {
  int a1=1;
  int an=20;
  int count=0;
  int prime=0;
  for(int i=a1;i<an;i++){
	  prime=0;
	  for(int j=2;j<=i/2;j++){
		  if((i%j)==0){
			  prime++;
		  }
	  }
  if(prime==0){
	  count++;
  }
	}
  System.out.println("The no of prime numbers between the range is:"+count);
		}
}
