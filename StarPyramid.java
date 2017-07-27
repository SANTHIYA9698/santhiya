package Hunter;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=6;
		int n=rows;
 for(int i=0;i<rows;i++){
	 for(int j=n;j>0;j--){
		 System.out.print("*");
	 }		
	 System.out.print(" ");
	 for(int j=n;j>0;j--){
		 System.out.print("*");
	 }
	 n--;
	 System.out.print("\n");
 }
	}

}
