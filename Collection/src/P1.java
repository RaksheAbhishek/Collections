import java.util.*;


public class P1 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(212);
	al.add(3324);
	al.add(787);
	al.add(4564);
	al.add(987);
	al.add(342);
	
	Iterator itr=al.iterator();
	while(itr.hasNext()==true)
	{
		System.out.println(itr.next()+" ");
	}
LinkedList ll=new LinkedList();
ll.add(al);
System.out.println(ll);

}
}
