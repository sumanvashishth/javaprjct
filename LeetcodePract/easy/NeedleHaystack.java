package easy;

public class NeedleHaystack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "hello";
		String needle = "sello" ;
		System.out.println(strStr(haystack , needle));
	}

    public static int strStr(String haystack, String needle) {
        if(needle.length()==0) {
        	return 0;
        }
        if(haystack.length()==0) {
        	return -1;
        }
        
    	for(int i=0;i<haystack.length();i++) {
    		if(i+needle.length()>haystack.length()) {
    			System.out.println("i+needle.length() is > haystack.length ");
    			break;
    		}
    		for(int j=0;j<needle.length();j++) {
    			if(needle.charAt(j)!=haystack.charAt(i+j)) {
    				System.out.println("breaking");
    				break;
    			}
    			if(j==needle.length()-1) {
    				System.out.println("returning i: "+i);
    				return i;
    			}
    		}
    	}
    	return -1;
    }
}
