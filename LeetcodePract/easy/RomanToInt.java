package easy;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MCMXCIV";
		System.out.println(romanToInt(s));
	}
    public static int romanToInt(String s) {
    	int n = s.length();
        int res = 0;
        if(n==0){
        	return res;
        }
        for(int i=0;i<n-1;i++){
            int curr = getVal(s.charAt(i));
            int nxt = getVal(s.charAt(i+1));
            System.out.println(curr + ","+ nxt);
        	if(curr<nxt){
        		res -= curr;
        		System.out.println("after + res is: "+res);
        	}
        	else {
        			res += curr ;
        			System.out.println("After - res is: "+res);
        	}
        }
           
    	return res + getVal(s.charAt(n-1));
    }
    
    private static int getVal(char ch) {
    	  if (ch == 'I') return 1;
    	  if (ch == 'V') return 5;
    	  if (ch == 'X') return 10;
    	  if (ch == 'L') return 50;
    	  if (ch == 'C') return 100;
    	  if (ch == 'D') return 500;
    	  if (ch == 'M') return 1000;
    	  throw new IllegalArgumentException("Unsupported Character");
    	}

}
