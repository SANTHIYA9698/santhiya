package Collections;
public class Star {
	public static void main(String[] args) {
      userMethod(5);
	}
	public static void userMethod(int size){
      for(int i=0;i<size;i++){
    	  for(int j=0;j<size;j++){
    		  if((i==0)||(i==(size-1))||(j==0)||(j==(size-1))){
    			  System.out.print("* ");
    		  }    	
    		  else{
    			  System.out.print("  ");
    		  }
    	  }
    	  System.out.print("\n");
      }
	}
}
