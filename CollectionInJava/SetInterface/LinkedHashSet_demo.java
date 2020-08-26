package SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSet_demo {
/*can be used in cache based applications
 * in cache duplicates not allowed , insertion order must be preserved
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add("kanha");
		lhs.add("rama");
		lhs.add(10);
		lhs.add(null);
		lhs.add("hey");
		System.out.println(lhs);

	}

}
