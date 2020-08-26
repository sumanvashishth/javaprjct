package SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

public class TS_Comparator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ram",10); 
		Employee e2 = new Employee("Hari",20);
		Employee e3 = new Employee("Shiv",40);
		Employee e4 = new Employee("Om",60);
		Employee e5 = new Employee("Sumii",80);
		Employee e6 = new Employee("Aaloo",10);
/*		TreeSet ts = new TreeSet<>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		System.out.println(ts);*/
		
		TreeSet t = new TreeSet(new CustComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
	}

}
class Employee implements Comparable {

	String name;
	int id;
	Employee(String name , int id){
		this.name = name;
		this.id = id;
	}
	public String tostring(){
		return name +"--"+ id;
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int eid1 = this.id;
		Employee e = (Employee)obj;
		int eid2 = e.id;
		if(eid1<eid2){
			System.out.println("<<<<");
			return -1;
		}
		else if(eid1>eid2){
			System.out.println(">>>>");
			return +1;
		}
		else
			return 0;
	}
}

class CustComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee)o1 ;
		Employee e2 = (Employee)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
	
	
}

