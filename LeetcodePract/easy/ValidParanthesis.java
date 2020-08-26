package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
	public static void main(String args[]){ 
		String s = "(())";
		System.out.println(isValid(s));
	}
    public static boolean isValid(String s) {
    	HashMap<Character, Character> maps = new HashMap<Character, Character>();
		maps.put('(', ')');
		maps.put('[', ']');
        maps.put('{', '}');
    	Stack<Character> stack = new Stack<>();
    	for(int i=0; i<s.length();i++){
    		if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
    			stack.push(s.charAt(i));
    		}
    		else if (!stack.empty() && s.charAt(i)==maps.get(stack.peek())){
    			stack.pop();
    		}
    		else{
    			return false;
    		}
    	}
    	return stack.empty();
    }
	
}
