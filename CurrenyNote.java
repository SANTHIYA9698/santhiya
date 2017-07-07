package Guvi;
public class CurrenyNote {
public static int output;
	public static void main(String[] args) {
userMethod(4673);
System.out.println("No of Currecy notes is:"+output);
	}
public static void userMethod(int input){
	int count=0,Note=0;
	if(input>=500){
		count=input/500;
		input=input-(count*500);
		Note+=count;
		count=0;
	}
	if(input>=100){
		count=input/100;
		input-=(count*100);
		Note+=count;
		count=0;
	}
	if(input>=50){
		count=input/50;
		input-=(count*50);
		Note+=count;
		count=0;
	}
	if(input>=10){
		count=input/10;
		input-=(count*10);
		count=0;
		Note+=count;
	}
	if(input>=1){
		count=input/1;
		input-=(count*1);
		Note+=count;
	}
	output=Note;
}
}
