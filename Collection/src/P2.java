import java.util.ArrayList;
import java.util.Iterator;

public class P2 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("banana");
		al.add("grapes");
		al.add("potato");
		al.add("apple");
		al.add("tomato");
		al.add("orange");
		al.add("mango");
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i)+" ");
		}
		
	Iterator itr=al.iterator();
	while(itr.hasNext()==true)
	{
		System.out.println(itr.next()+" ");
	}
	
System.out.println("size is"+al.size()+" ");
	System.out.println(al.isEmpty()+" empty");
	
	}

}
