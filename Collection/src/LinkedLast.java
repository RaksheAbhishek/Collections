import java.util.Collections;
import java.util.LinkedList;

public class LinkedLast {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(122);
	ll.add(65656);
		ll.add(565);
		ll.add(657657);
		ll.add(3424);
		ll.add(98687);
		System.out.println(ll);
		
		Collections.sort(ll);
		System.out.println(ll);
		ll.addFirst(3);
	ll.addLast(11);
	System.out.println(ll);
    ll.removeFirst();	
    System.out.println(ll);
    ll.removeLast();
	System.out.println(ll);
	
	System.out.println(ll.getFirst());
	System.out.println(ll.getLast());
	}

}
/*
addFirst()	Adds an item to the beginning of the list.	
addLast()	Add an item to the end of the list	
removeFirst()	Remove an item from the beginning of the list.	
removeLast()	Remove an item from the end of the list	
getFirst()	Get the item at the beginning of the list	
getLast()	Get the item at the end of the list

*/