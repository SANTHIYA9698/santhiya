package Hunter;
public class FindNthNum {
	public static void main (String[] args) 
	{
		for (int i=0; i<30; i++)
			userMethod(i);
	}
	 public  static void userMethod(int n)
	    {
	        String[] arr = new String[n+1];
	        arr[0] = ""; 
	        int size = 1, m = 1;
	        if(n!=0){
	        while (size <= n)
	        {
	            
	            for (int i=0; i<m && (size+i)<=n; i++){
	                arr[size + i] = "3" + arr[size - m + i];
	            }
	           
	            for (int i=0; i<m && (size + m + i)<=n; i++){
	                arr[size + m + i] = "4" + arr[size - m + i];
	            }
	            
	            m = m << 1; 
	 
	            size = size + m;
	        }
	        }
	        System.out.println(arr[n]);
	    }
	    
	}

