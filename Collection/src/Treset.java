import java.util.*;
public class Treset {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(231);
		ts.add(21);
		ts.add(67);
		ts.add(987);
		ts.add(101);
		System.out.println(ts+" ");

		System.out.println();
		System.out.println("================");
	Iterator itr=ts.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

	System.out.println();
	System.out.println("================");
	Iterator it=ts.descendingIterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	}
	

}
