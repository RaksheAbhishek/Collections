import java.util.*;
public class ArayDdeque {
public static void main(String[] args) {
	ArrayDeque ad=new ArrayDeque();
	ad.add(21);
	ad.add(453);
	ad.addFirst(565);
	
	ad.addLast(987);
	ad.add(65);
	System.out.println(ad);

	System.out.println();
	System.out.println("================");
	Iterator itr=ad.iterator();
	
	//iterating
	while(itr.hasNext()==true)
	{
		System.out.println(itr.next()+" ");
	}

	System.out.println();
	System.out.println("================");
//reversing iterator
Iterator itr2=ad.descendingIterator();
while(itr2.hasNext())
{
	System.out.println(itr2.next());
}


}
}
