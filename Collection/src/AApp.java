import java.util.*;

public class AApp {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	A a=new A("abhi",24,30000);
	A a1=new A("ashish",22,21334);
	A a2=new A("gundu",12,654643);
	A a3=new A("aman",435,6477746);
	A a4=new A("amar",454,967976);
	al.add(a);
	al.add(a1);
	al.add(a2);
	al.add(a3);
	al.add(a4);
	System.out.println(al);
	System.out.println("================");
    Collections.sort(al);
    System.out.println(al);

}
}
