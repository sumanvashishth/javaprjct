package CollectionFwk;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort {

	public static void main (String args[]){
		
		ArrayList<String> al = new ArrayList<String>();
		//al.add("bbaacbaabbcc");
        al.add("Geeks For Geeks"); 
        al.add("Friends"); 
        al.add("Dear"); 
        al.add("Is"); 
        al.add("Superb"); 
		System.out.println("Before sort: "+al);
		Collections.sort(al);
		System.out.println("After sort: "+al);
		
	}
	
}
