import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class HashMAP {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(11, "abhishek");
		hs.put(2, "patil");
		hs.put(3,"bangalore");
		System.out.println(hs);
		Set s=hs.keySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(1, new Student1(1,"abhishek"));
		lhm.put(2, new Student1(423,"abhishek"));

		lhm.put(3, new Student1(324324,"abhilash"));

		lhm.put(6, new Student1(1212,"avinash"));

		lhm.put(4, new Student1(1111,"gundya"));
      
		
		System.out.println(lhm);
		
		}

}
