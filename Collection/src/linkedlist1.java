import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList();
		ll.add(12);
		ll.add(323);
		ll.add(83);
		ll.add(232);
		ll.add(12132);
		ll.add(11);
		ll.add(10);
		ll.add(4);
		System.out.println(ll);
		System.out.println("-==========");
		Iterator it = ll.iterator();
		while (it.hasNext() == true) {
			System.out.println(it.next());
		}

		System.out.println("-==========");

		Iterator itr = ll.descendingIterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
      Collections.sort(ll);
      System.out.println("value after sorting");
      System.out.println();
      System.out.println(ll);
      ll.add(1, 1111);
      System.out.println(ll);
      Collections.sort(ll);
      System.out.println(ll);
      
      
      
      
      
      
      
      
      
      
	}
}
