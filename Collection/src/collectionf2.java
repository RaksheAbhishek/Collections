import java.util.*;
public class collectionf2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(123);
		ll.add(43);
		ll.add(423);
		ll.add(553);
		ll.add(657);
		ll.add(987);
		ll.add(2222);
		ll.add(89);
		System.out.println(ll);
		System.out.println("===================");
	 
//		for(int i=0;i<ll.size();i++)
//		{
//			ll.add(i);
//			System.out.println(ll);
//		}
		System.out.println("===================");

		for(int i=ll.size()-1;i>=0;i++)
		{
		System.out.println(ll.remove(i));	
		System.out.println(ll);
		}
		
	}
}
