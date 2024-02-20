import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
    LinkedList ll=new LinkedList();
    
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.add("raju");
    ll.add("pintu");
    ll.add(true);
    System.out.println(ll);
    ll.add(2,999);
    System.out.println(ll);
    System.out.println("+++++++++++++++");
    System.out.println(ll.contains(40));
    System.out.println("========");
    ll.size();
    System.out.println(ll.size());
    System.out.println("======");
    System.out.println(ll.remove(2));
    System.out.println("==========");
    ll.add(2, ll);
    System.out.println(ll);
    System.out.println(ll.peek());
    System.out.println("=======");
    System.out.println(ll.poll());
    System.out.println(ll.contains(ll));
    
    
	}

}
