package Hunter;

public class SingleElement {

	public static void main(String[] args) {
int array[]={45,67,54,45,54};
int count=0;
int output=0;
for(int i=0;i<array.length;i++){
	count=0;
	for(int j=0;j<array.length;j++){
if(i!=j){
		if(array[i]==array[j]){
			count++;
		}
}
	}
	if(count==0){
		output=array[i];
	}
}
System.out.println(output);
	}

}
