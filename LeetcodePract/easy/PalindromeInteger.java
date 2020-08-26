package easy;

public class PalindromeInteger {
	    public static boolean isPalindrome(int x) {
	        int res = 0;
	        int temp = x;
	        while(temp!=0){
	            res = res*10;
	            res += temp%10;
	            temp = temp/10;
	        }
	        System.out.println("res is: "+res +" x is: "+x);
	        if(x == res){
	           return true ;
	        }
	        else{
	            return false ;
	        }
	    }
	    public static void main (String args[]){
	        int x = -123;
	        System.out.println(isPalindrome(x));
	    }
	}

