package Pro;

public class ChildPair {

	public static void main(String[] args) {
     int n=10;
     int pairs=0;
     for(int i=0;i<n*2;i++){
    	 for(int j=i+1;j<n*2;j++){
    		 System.out.println(i+","+j);
    		 pairs++;
    	 }
     }
     System.out.println("The no.of Pairs are:"+pairs);
	}

}
