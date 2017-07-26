package Hunter;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n[]={1,2,3,4,5,6};
 int d=4;
 try{
 for(int i=0;i<d;i++){
	 int temp=n[0];
	 //System.out.println(temp);

	 for(int j=0;j<n.length-1;j++){
		 n[j]=n[j+1];		 
		// System.out.println(j+" "+n[j]);
	 }
	 n[n.length-1]=temp;
	// System.out.println(n[n.length-1]);
 }
 }catch(ArrayIndexOutOfBoundsException e){
	 
 }
 for(int i=0;i<n.length;i++){
	 System.out.print(n[i]+" ");
 }
	}

}
