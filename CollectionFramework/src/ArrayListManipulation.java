import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListManipulation {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(21);
		al.add(23);
		al.add(22);
		al.add(11);
		al.add(33);
		al.add(44);
		al.add(55);
		al.add(56);
		al.add(76);
		System.out.println(al);
		
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println(al.contains(33));
//		for(int i=0;i<al.size();i++)
//		{
//			if(i%2==0)
//			{
//				al.remove(i);
//			}
//		}
//		System.out.println(al);
		
	Iterator it=	al.iterator();
	while(it.hasNext()==true)
	{
		int n=(int) it.next();
		if(n%2==0)
		{
			it.remove();
		}
	}
	System.out.println(al);
	}
}
