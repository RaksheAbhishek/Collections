import java.util.*;
public class Generics {

	public static void main(String[] args) {
LinkedList<Integer> ll=new LinkedList<Integer>();

ll.add(121);
ll.add(12121);
ll.add(323);
ll.add(90);
ll.add(32);
System.out.println(ll);
Iterator itr=ll.iterator();
while(itr.hasNext()==true)
{
	System.out.println(itr.next());
}

Iterator<Integer> it=ll.descendingIterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

Collections.sort(ll);
System.out.println(ll);


	}

}
