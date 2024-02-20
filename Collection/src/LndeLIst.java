import java.util.Iterator;
import java.util.LinkedList;

public class LndeLIst {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(232);
		ll.addLast(1098);
		ll.add(34);
		ll.add(987);
		ll.add(98);
		ll.add(231);
		ll.add(67);
		System.out.println(ll.contains(232));
		System.out.println(ll + " ");

		System.out.println();
		System.out.println("================");
		for (int i = 0; i < ll.size(); i++) {

			System.out.println(ll.get(i) + " ");
		}

		System.out.println();
		System.out.println("================");

		Iterator itr = ll.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next() + " ");
		}

		System.out.println();
		System.out.println("================");
		Iterator itr1 = ll.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next() + " ");
		}

		System.out.println();
		System.out.println("================");
		Iterator itr2 = ll.listIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next() + " ");
		}

	}
}
