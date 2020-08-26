package easy;

public class ReverseInteger {

	    public static int reverse(int x) {
	        boolean signed = false;
	        long res = 0;
	        if(x<0){
	            x = x * (-1);
	            signed = true;
	        }
	    	   while(x!=0){
	    		   res = res*10;
	           res += x % 10;
	           x = x/10;
	    	   }   
	        if(signed == true){
	            res = res * (-1);
	        }
	    	if(res>Integer.MAX_VALUE || res <Integer.MIN_VALUE){
	    		System.out.print("Out of range");
	    		return 0;
	    	}
	        return (int)res;


	    }
	    public static void main (String args[]){
	        int x = -2147483648;
	        System.out.println("Reversed no is: "+reverse(x));      
	    }
	}

