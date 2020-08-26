package SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset_Comparator_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet<>(new Mycomparator());
		ts.add(new StringBuffer("Shiva"));
		ts.add(new StringBuffer("Ram"));
		ts.add(new StringBuffer("Om"));
		ts.add("A");
		ts.add("AAaa");
		ts.add(new StringBuffer("Shankar"));
		ts.add(new StringBuffer("Bhole"));
		ts.add(new StringBuffer("Shambhu"));
		ts.add(new StringBuffer("Nath"));
/*		ts.add("Ram"); 
		ts.add("Om");
		ts.add("Shankar");
		ts.add("Bhole");
		ts.add("Shambhu");
		ts.add("Nath");*/
		System.out.println(ts);
		}
}
class  Mycomparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		// For String buffer convert to string first
		String s1 =o1.toString();
		String s2 =o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		 if(l1 < l2){
			 return -1;
		 }
		 else if(l1>l2){
			 return +1;
		 }
		 else{
			 return -s2.compareTo(s1);
		 }
		
		
		//return -s2.compareTo(s1);
				
     /*	Simple for Strings
      * String s1 =(String) o1;
		String s2 =(String) o2;*/
		//return s2.compareTo(s1);
		//return -s1.compareTo(s2);
		//return -1;
		/* return  I1.compareTo(I2); // Ascending order 
		 * return I2.compareTo(II)  // Descending order 
		 * return -I1.compareTo(I2) // Descending order
		 * return -I2.compareTo(I1) // Ascending order
		 * return +1; ---- Returns insertion order
		 * return -1 ----  Reverse of insertion order
		 * return 0  ----  First element only
		 
		 */
		
	}
	
	
}
