import java.util.Iterator;
import java.util.TreeSet;

public class collectionf3 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("abhishek");
		ts.add("patil");
		ts.add("arjun");
		ts.add("basava");
		ts.add("dharam");
		ts.add("xchi jin ping");
		System.out.println(ts);

		Iterator it = ts.iterator();
//		while (it.hasNext() == true)
//		{
//			System.out.println(it.next() + " ");
//		}
		for(String st:ts)
		{
		System.out.println(st);
			
		}
		System.out.println(ts);
		
		
		System.out.println("==================");
		
		for(int i=0;i<ts.size();i++)
		{
		Iterator its=	ts.iterator();
		
		    while(its.hasNext()==true)
		    {
		       System.out.println(its.next());	
		    }
		}
	}
}
