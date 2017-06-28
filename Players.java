package logic;

import java.util.Scanner;

public class Players {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int difference=0;
		System.out.println("Enter the total no of players");
		int input=s.nextInt();
	    difference=input%2;
	    System.out.print("The difference in no of players in two teams is:"+difference);
	    s.close();
	}
}
