import java.util.ArrayList;
import java.util.Collections;

public class ArrauList {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(122);
	al.add(65656);
	al.add(565);
	al.add(657657);
	al.add(3424);
	al.add(98687);
	System.out.println(al);
	System.out.println(al.get(5));
	System.out.println(al.set(0,999));
	System.out.println(al);
	al.remove(5);
	System.out.println(al);
	al.size();
	System.out.println(al);
	
	
	//al.set is for setting data
	//al.get() is for getting the data
    //al.remove() is for removig the data
	//al.add() is for adding the data
	//al.size is for to get the size
    //collections.sort is used for sorting	
	
	ArrayList<String> al1=new ArrayList<String>();
al1.add("mango");
al1.add("banana");
al1.add("orange");
al1.add("chiku");
al1.add("pineapple");
al1.add("apple");
System.out.println(al1);
System.out.println("+====================");
for(int i=0;i<al1.size();i++)
{
	System.out.print(al1.get(i)+" ");
}
			System.out.println();
System.out.println("=====================");
for(String i:al1)
{
System.out.println(i);	
}

System.out.println();
System.out.println("==============");
Collections.sort(al1);
System.out.println(al1);
System.out.println();
System.out.println("==============");

for(String s:al1)
{
	System.out.println(s);
}
}
}
