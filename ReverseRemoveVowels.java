package guvi;

public class ReverseRemoveVowels {
	public static void main(String[] args) {
   String input="SuccEss";
   StringBuffer sb=new StringBuffer(input);
   String name=sb.reverse().toString();
   String output="";
   int temp=0;
   String vowels[]={"a","e","i","o","u"};
   for(int i=0;i<name.length();i++){
	   temp=0;
	   for(int j=0;j<vowels.length;j++){
		   if(name.substring(i,i+1).equalsIgnoreCase(vowels[j])){
			   temp++;
		   }
	   }
	   if(temp==0){
		   output+=name.substring(i,i+1);
	   }
	   
   }
   System.out.println(output+"\nvowels removed");
	}

}
