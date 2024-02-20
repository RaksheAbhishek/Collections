import java.util.ArrayList;
import java.util.Collections;

public class Employee1APP {
	public static void main(String[] args) {
		ArrayList  al=new ArrayList<>();
		Employee1 e1=new Employee1("Abhishek", 345, 34500);
		Employee1  e2=new Employee1("ajay",121,3112);
		Employee1 e3=new Employee1("adjd",122,2323);
		Employee1 e4=new Employee1("sdda",1212,2321321);
		Employee1 e5=new Employee1("asdsad",21,32123);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
