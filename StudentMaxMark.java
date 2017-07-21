package Hunter;
import java.util.*;

public class StudentMaxMark {

	public static void main(String[] args) {
  ArrayList<String> Marks=new ArrayList<String>();
  Marks.add("Deepak#100#30#40");
  Marks.add("Aravind#50#35#40");
  int marks[]={0,0,0};
  int Max=0;
  String output="";
  Iterator<String> iterator=Marks.iterator();
  while(iterator.hasNext()){
	  String S1=iterator.next();
	 int k=0,sum=0;
	  String array[]={"","",""};
	  for(int i=0;i<S1.length();i++){
		  if(S1.substring(i,i+1).equals("#")){
			  try{
			  for(int j=(i+1);!(S1.substring(j,j+1).equals("#"));j++){
				  array[k]+=S1.substring(j,j+1);
			  }
			  }catch(StringIndexOutOfBoundsException e){
				  
			  }
			  marks[k]=Integer.parseInt(array[k]);
			  sum+=marks[k];
			  k++;
		  }
	  }
	  if(sum>Max){
		  Max=sum;
		  int count=0;
		  for(int i=0;i<S1.length();i++){
			  if((count==0)&&(S1.substring(i,i+1).equals("#"))){
				  output=S1.substring(0,i);
				  count++;
			  }
		  }
	  }
  }
  System.out.println(output);
	}
}
