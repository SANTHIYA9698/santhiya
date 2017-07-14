package Pro;
public class Seed {
	public static int output;
	public static void main(String[] args) {
		UserMethod(738);
		System.out.println(output);
	}
	public static void UserMethod(int input){
       int arr[]=new int[input];
       for(int i=0;i<input;i++){
    	   arr[i]=i;
       }
       for(int i=1;i<input;i++){
    	  int mul=1;
    	   mul*=arr[i];
    	   int temp=0;
    	   int a=arr[i];
    	   while(arr[i]!=0){
    		   temp=arr[i]%10;
    		   arr[i]=arr[i]/10;
    		   mul*=temp;
    	   }
    	   if(mul==input){
    		   output=a;
    	  }
       }
	}

}
