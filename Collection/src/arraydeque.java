import java.util.*;
public class arraydeque {

	public static void main(String[] args) {
ArrayDeque ad=new ArrayDeque();
ad.add(190);
ad.add(200);
ad.add(300);
ad.add(400);
System.out.println(ad);
ad.addFirst(600);
System.out.println(ad);
ad.addLast(500);
System.out.println(ad);
	}

}
