package Player;

public class OneOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int array[]={12,34,45,12,34};
 int count=0;
 for(int i=0;i<array.length;i++){
	 count=0;
	 for(int j=0;j<array.length;j++){
		 if(i!=j){
		 if(array[i]==array[j]){
			 //System.out.println(array[i]+" "+array[j]);
			 count++;
		 }
	 }
	 }
	 if(count==0){
		 System.out.println(array[i]+" ");
	 }
 }
	}

}
