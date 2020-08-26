package CollectionFwk;

import java.util.Arrays;

public class CharcterSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputstring = "hello";
		System.out.println("Before sort: "+inputstring);
		System.out.println("After sort: "+sortstring(inputstring));
	}

	private static String sortstring(String inputstring) {
		// TODO Auto-generated method stub
		char[] temp = inputstring.toCharArray();
		char tmp ='a' ;
		//Arrays.sort(temp);
		for(int i=0;i<temp.length-1;i++){
			for(int j=i+1;j<temp.length;j++){
				if(temp[i]>temp[j]){
					tmp = temp[i];
					temp[i] = temp[j];
					temp[j]=tmp;				
				}
			}	
		}
		return new String(temp);
	}

}
