import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ArrayDeque1 {
public static void main(String[] args) {
	ArrayDeque ad=new ArrayDeque();
	ad.add(21);
	ad.add(42);
	ad.add(342);
	ad.add(645);
	ad.add(2313);
	System.out.println(ad);
	ad.addFirst(111);
	ad.addLast(222);
	System.out.println(ad);
	
	
	PriorityQueue pq=new PriorityQueue();
	pq.add(4444);
	pq.add(3453);
	pq.add(30599);
	pq.add(231);
	pq.add(43543);
	System.out.println(pq);
	
	
	TreeSet<Integer> ts=new TreeSet<>();
	ts.add(12321);
	ts.add(1213);
	ts.add(111);
	ts.add(898);
	ts.add(8978);
	ts.add(1223);
	System.out.println(ts);
	
Iterator it=	ts.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

Iterator it1=ts.descendingIterator();
while(it1.hasNext())
{
	System.out.println(it1.next());
}
System.out.println("=================");
System.out.println(ts.ceiling(11111));
System.out.println(ts.floor(222222));
System.out.println("=================");


for(Integer i:ts)
{
	System.out.println(i);
}

System.out.println("=================");
ArrayList al=new ArrayList();
al.add(1212);
al.add(2312);
al.add(231132);
al.add(893);
al.add(1122);
al.add(8192);
System.out.println(al);
Iterator<Integer> it2=al.listIterator();
System.out.println("=================");

while(it2.hasNext())
{
	System.out.println(it2.next());
}

//for(int i=0;i<al.size();i++)
//{
//	System.out.println(al.get(i));
//	al.add(99);
//}

System.out.println("sorting the array list");

System.out.println("=================");
Collections.sort(al);
System.out.println(al);




























}
}
