import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class collectionf1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("abhishek", 35);
		hm.put("arjun", 99);
		hm.put("dharam", 100);
		hm.put("sachin", 69);
		System.out.println(hm);
		Set a = hm.keySet();
		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-===============");
		System.out.println(hm.values());

	}
}
