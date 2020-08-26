package SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Comparator_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tr = new TreeSet<>(new MyComparator());
		tr.add(10);
		tr.add(5);
		tr.add(20);
		tr.add(8);
		tr.add(1);
		System.out.println(tr);
	}
}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		if(I1 < I2){
			return +1;
		}
		else if(I1>I2){
			return -1;
		}
		else
		return 0;
/*		return  I1.compareTo(I2); // Ascending order 
		 return I2.compareTo(II)  // Descending order 
		 * return -I1.compareTo(I2) // Descending order
		 * return -I2.compareTo(I1) // Ascending order
		 * return +1; ---- Returns insertion order
		 * return -1 ----  Reverse of insertion order
		 * return 0  ----  First element only
		 
		 */
		
	}	
}
