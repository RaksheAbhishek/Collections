import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class ObjectAccessingInCaCollectionClasses {
public static void main(String[] args) {
	TreeSet<Integer> ref=new TreeSet<Integer>();
	ref.add(100);
	ref.add(50);
	ref.add(150);
	ref.add(25);
	ref.add(75);
	ref.add(125);
	ref.add(175);
	System.out.println(ref+" ");
	System.out.println("=========");
//	for(int i=0;i<ref.size();i++)
//	{
//		System.out.print(ref.get(i)+" ");
//	}
	System.out.println();
	System.out.println("=========");
	for(Integer x:ref)
	{
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("=========");
}
}
