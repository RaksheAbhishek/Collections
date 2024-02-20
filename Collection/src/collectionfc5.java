import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class collectionfc5 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1,"prabhakaran");
		hm.put(2,"akash");
		hm.put(3, "pandey");
		hm.put(4, "shera");
		hm.put(5,"punith");
		System.out.println(hm);
		
		
		Hashtable<Integer,String> hs=new Hashtable<Integer,String>();
		hs.put(8, "abhishek");
		hs.put(9, "patil");
		hs.put(11, "arjun");
		hs.put(32, "dharam");
		hs.put(6, "ajay");
		System.out.println(hs);
		
		
		System.out.println("+++++++++++++++++");
		
		for(Map.Entry<Integer,String>  entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" these are key values");
			System.out.println(entry.getValue()+" these are the actual values");
		}
		
		System.out.println("==============================");
         for(Map.Entry<Integer, String> ent:hs.entrySet())
         {
        	 System.out.println(ent.getKey()+" these are key values");
 			System.out.println(ent.getValue()+" these are the actual values");
         }
		
	}
}
