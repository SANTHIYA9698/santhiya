package Hunter;

public class PossibleCombinations {

	public static void main(String[] args) {
         int n=6;
         int k=3;
         for(int i=1;i<=n;i++){
        	 for(int m=i;m<n;m++){
        		 if(i!=m){
        	System.out.print(i+" ");
        	 int temp=k;
        	 for(int j=m;(temp>1);j++,temp--){
        		 System.out.print(j+" ");
        	 }
        	 System.out.println();
        		 }
         }
         }
	}

}
