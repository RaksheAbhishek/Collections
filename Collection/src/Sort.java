import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(100);
		al.add(125);

		al.add(25);
		al.add(50);
		al.add(150);
		al.add(175);
		al.add(75);
		System.out.println(al);

//Collections.sort(al);
//System.out.println(al);

		Collections.reverse(al);
		System.out.println(al);

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}
	}
}
