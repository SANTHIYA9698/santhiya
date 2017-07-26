package Hunter;

public class CountDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int Array[]={7,6,23,19,10,11,9,3,15};
    int k=4,count=0;;
    for(int i=0;i<Array.length;i++){
    	for(int j=i+1;j<Array.length;j++){
    		int difference=Array[i]-Array[j];
    		if((difference==k)||(difference==(-k))){
    			count++;
    		}
    	}
    }
    System.out.println(count);
	}

}
