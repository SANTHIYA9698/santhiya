package Hunter;

public class Square {

	public static void main(String[] args) {
 int coordinate1[]={10,10};
 int coordinate2[]={10,20};
 int coordinate3[]={20,20};
 int coordinate4[]={20,10};
int diff1=(coordinate1[0]-coordinate2[0]);
int diff2=(coordinate1[1]-coordinate2[1]);
 if(((coordinate3[0]-coordinate4[0])==diff1)||((coordinate3[0]-coordinate4[0])==-diff1)){
	 if(((coordinate3[1]-coordinate4[1])==diff2)||((coordinate3[1]-coordinate4[1])==-diff2)){
		 int sum=(coordinate1[0]+coordinate2[0])+(coordinate3[0]+coordinate4[0]);
		 int sum1=(coordinate1[1]+coordinate2[1])+(coordinate3[1]+coordinate4[1]);
		 if(sum==sum1)
System.out.println("Square");
	 }
 }
 else {
	 System.out.println("Not a Square");
 }
	}

}
