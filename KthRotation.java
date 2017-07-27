package Hunter;

public class KthRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int array[]={15,18,2,5,12,13};
 int K=0;try{
 for(int i=0;i<array.length;i++){
	 if(array[i]>array[i+1]){
		 K=i+1;
	 }
 }
 }catch(ArrayIndexOutOfBoundsException e){
	 
 }
 System.out.println("The sorted array is rotated "+(array.length-(K))+" times");
	}

}
