import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ReverseOrder {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(100);
	al.add(25);
	al.add(125);
	al.add(50);
	al.add(75);
	al.add(125);
	al.add(150);
	System.out.println(al);
Comparator c=Collections.reverseOrder();
    Collections.sort(al,c);
    System.out.println(al);  
}
}
