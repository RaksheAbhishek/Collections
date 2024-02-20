import java.util.ArrayList;
import java.util.Collections;

public class DEmo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Employee e1 = new Employee("abhishek", 21, 100);
		Employee e2 = new Employee("rakesh", 24, 1223);
		Employee e3 = new Employee("ravi", 45, 112120);
		Employee e4 = new Employee("amar", 30, 110);
		Employee e5 = new Employee("aman", 20, 98880);
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
