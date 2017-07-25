package Pro;
public class DifferentDigits {
	public static void main(String[] args) {
 String input="34#2a3";
 int num=0;
 int Max=0;
 int min=9;
 for(int i=0;i<input.length();i++){
	 try{
		num=Integer.parseInt(input.substring(i,i+1));
		if(num>Max){
			Max=num;
		}
		if(num<min){
			min=num;
		}
	 }catch(NumberFormatException e){
		 
	 }
 }
 int s1=0,s2=1;
 int sum1=0,sum2=0;
 for(int i=0;i<input.length();i++){
	 try{
			num=Integer.parseInt(input.substring(i,i+1));
			s1+=(num*Max);
		    s2*=(num+min);
	}catch(NumberFormatException e){
		
	}
 }
while(s1!=0){
	sum1=0;
	while(s1!=0){
		int rem=s1%10;
		s1=s1/10;
		sum1+=rem;
	}
	if(sum1>9)
		s1=sum1;
}
while(s2!=0){
	sum2=0;
	while(s2!=0){
		int rem=s2%10;
		s2=s2/10;
		sum2+=rem;
	}

	if(sum2>9)
		s2=sum2;
}
 int digit3=0;
 if(sum1<sum2)
	 digit3=sum1;
 else 
	 digit3=sum2;
 int Square=digit3*digit3;
 System.out.println(digit3);
}
}