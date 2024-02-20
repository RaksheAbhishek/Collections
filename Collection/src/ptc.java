import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ptc {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(13);
		al.add(11);
		al.add(9);
		al.add(3222);
		al.add(12);
		al.add(22);
		al.add(21);
		System.out.println(al);
		System.out.println(al.get(5) + " indexs value is ");
		System.out.println("===============");
//		for(int i=0;i<al.size();i++)
//		{
//			
//			al.add(100);
//			
//		}
		System.out.println("value are" + al);
		System.out.println("===============");

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("===============");
		Collections.sort(al);
		System.out.println(al);

		Iterator itr = al.iterator();
		al.remove(0);
		System.out.println(al);
		al.add(45645);
		System.out.println(al);

	}

}
