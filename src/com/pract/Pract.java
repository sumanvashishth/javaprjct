package com.pract;

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "My Name is Suman";
		String[] b = S.split(" ");
		String ans = "";
		for(int i=b.length-1;i>=0;i--){
			ans += b[i]+" ";
		}
		System.out.println(ans);
		
		
/*		StringBuilder ans = new StringBuilder();
		int end = S.length();
		for(int i=S.length()-1;i>=0;i--){
			if(S.charAt(i)==' ' || i == 0){
				if(i == 0){
					ans = ans.append(S.substring(i, end));	
				}
				else{
					ans = ans.append(S.substring(i+1, end));
					ans.append(" ");
				}
				end = i;
				
			}
			
		}
		System.out.println(ans);*/
		
	}

}
