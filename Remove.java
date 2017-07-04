import java.util.Scanner;
class Remove{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of elements in array:");
int n=s.nextInt();
System.out.println("Enter the elements in the array:");
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
System.out.println("Enter the element to boe removed:");
int element=s.nextInt();
for(int i=0;i<n;i++){
if(arr[i]==element){
arr[i]=arr[i+1];
}
n--;
}
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
s.close();
}
}
