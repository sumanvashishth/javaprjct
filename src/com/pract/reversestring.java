package com.pract;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "My name is suman";
//		String arr[]= S.split("\\s");
		StringBuilder ans = new StringBuilder("");	
		int end = S.length();		
		for( int i = S.length()-1;i>=0 ;i--)
		{
			//System.out.println("i before space: "+i);
			if(S.charAt(i) == ' ' || i==0)
			{
				//System.out.println("i is: "+i);
				if(i==0){
					ans.append(S.substring(i, end));
					//System.out.println("ans is: "+ans);
				}
				else{
					ans.append(S.substring(i+1, end));
					ans.append(" ");
					//System.out.println("ans with space: "+ans);
				}
				end = i;
				//System.out.println("end is: "+end);
			}
			
		}
		
		System.out.println("String is: "+ans);
	}

}
