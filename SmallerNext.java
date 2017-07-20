package Hunter;

public class SmallerNext {

	public static void main(String[] args) {
int input[]={5,3,1,6,4};
int output[]=new int[input.length];
for(int i=0;i<input.length-1;i++){
	if(input[i]>input[i+1]){
		output[i]=input[i+1];
	}
	else{
		output[i]=-1;
	}
}
output[input.length-1]=-1;
for(int i=0;i<input.length;i++){
	System.out.print(output[i]+" ");
}
	}

}
