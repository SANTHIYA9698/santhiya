package Pro;

public class Divide_Array {
	public static void main(String[] args) {
 int arr[]={4,2,3,4,2};
 int len=(arr.length);
 int div=0,div1=0,temp=0;
 int count=0,sum=0,sum1=0;
 for(int i=0;i<arr.length;i++){
	 if(i!=4){
	 count+=1;
	 sum=0;
	 for(int j=0;j<count;j++){
		 sum+=arr[j];
	 }
	 div=(sum/count);
	 sum1=0;
	 for(int k=count;k<len;k++){
		 sum1+=arr[k];
	 }
	 div1=(sum1/(len-count));
 }
	 if(div==div1){
		 temp=count;
	 }
 }
 if(temp!=0){
 int a1[]=new int[temp];
 System.out.print("Array 1:");
 for(int i=0;i<temp;i++){
	 a1[i]=arr[i];
	 System.out.print(a1[i]+" ");
 }
 int[] a2=new int[len-temp];
 System.out.print("\nArray 2:");
 for(int i=temp,j=0;i<len;i++,j++){
	 a2[j]=arr[i];
	 System.out.print(a2[j]+" ");
 }
 }
 else{
	 System.out.println("Not Possible");
 }
	}

}
