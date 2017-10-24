package Hunter;
import java.util.*;
public class PossibleCombinations {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int k=s.nextInt();
        if(n>k) {
         for(int i=1;i<n;i++) {
        	 for(int j=k;j<=n;j++) {
        		 if((i!=j)&&(i<j))
        		 System.out.println(i+" "+j);
        	 }
         }
         }
         else {
        	 for(int i=1;i<k;i++) {
            	 for(int j=n;j<=k;j++) {
            		 if((i!=j)&&(i<j))
            		 System.out.println(i+" "+j);
            	 }
             }
         }
	}

}
