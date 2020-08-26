package SetInterface;

import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet<>();
		ts.add("A");
		ts.add("a");
		ts.add("ram");
		ts.add("ab");
		//ts.add(null); //only applicable for empty tree set, after null if any other element inserted NPE will appea
		System.out.println(ts);
		/*
		 * NPE for below treeset,because StringBuffer does not implement comparable
		 * */
		TreeSet tr = new TreeSet<>();
		tr.add(new StringBuffer("A") );
		tr.add(new StringBuffer("L") );
		tr.add(new StringBuffer("B") );
		tr.add(new StringBuffer("Z") );
		System.out.println(tr);
		
	}

}
