import java.util.*;

public class Priorityqueue {
public static void main(String[] args) {
PriorityQueue pq=new PriorityQueue();
pq.add(50);
pq.add(55);
pq.add(100);
pq.add(80);
pq.add(25);
pq.add(90);
pq.add(105);
System.out.println(pq);
System.out.println(pq.contains(200));
PriorityQueue pq2=new PriorityQueue();

System.out.println(pq.containsAll(pq2));
PriorityQueue pq3=new PriorityQueue();
pq3.add(100);
pq3.add(50);
pq3.add(25);
pq3.add(10);
pq3.add(95);
pq3.add(65);
pq3.add(75);
System.out.println("pq3 is"+pq3);



 PriorityQueue pq4=new PriorityQueue();
pq4.add(100);
pq4.add(55);
pq4.add(45);
pq4.add(50);
pq4.add(25);
pq4.add(125);
pq4.add(90);
System.out.println(pq4);
LinkedList ll=new LinkedList<>();
ll.add(10);
ll.add(20);
ll.add(30);
ll.add(40);
ll.add(50);
System.out.println(ll);
}
}
