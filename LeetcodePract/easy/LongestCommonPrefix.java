package easy;
public class LongestCommonPrefix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[] = {"aaa", "aba" , "aaa"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String res = "";
		int count = 0;
		if(strs.length==0 || strs == null){
			return "";
				}
		if(strs.length==1){
			return strs[0];
			}
		boolean flag = false;
		for(int i=0;i<strs[0].length();i++){
			for(int j=1;j<strs.length;j++){
				flag = false;
			if(i<strs[j].length() && strs[0].charAt(i)==strs[j].charAt(i)){
				System.out.println("hey");
				flag = true;
			}
			if(flag == false){
				break;
			}
		}
			if (flag == true){
				res =  strs[0].substring(0,i+1);
				System.out.println();
			}
			else{
				break;
			}
		}
		return res;
		// 2nd solution
/*		for(int i=0;i<strs[0].length();i++){
			if(strs[0].charAt(i)==strs[1].charAt(i))
			{
				for(int j=1;j<strs.length;j++){
					if(strs[0].charAt(i)!=strs[j].charAt(i))
					{
						return res;
					}	
				}
					res = strs[0].substring(0,i+1);	
			}
			else
			{
				return res;
			}
		}
	return res;	*/
	}
		
/*	3rd solution
 * 	StringBuilder sb = new StringBuilder();
		for(int i=0;i<strs[0].length();i++){
			char c = strs[0].charAt(i);
			for(int j= 1;j<strs.length;j++){
				if(i>=strs[j].length() || c!=strs[j].charAt(i)){
					return sb.toString();
				}
			}
			sb.append(c);
		}	
		return sb.toString();*/
	}

