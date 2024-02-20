import java.util.ArrayList;
import java.util.Iterator;

public class Araylist {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(12);
		al.add(23);
		al.add(45);
		al.add(34);
		al.add(98);
		System.out.println(al+" ");
		System.out.println();
		System.out.println("================");
       for(int i=0;i<al.size();i++)
       {
    	   System.out.println(al.get(i)+" ");
       }
	

		System.out.println();
		System.out.println("================");
Iterator itr=al.iterator();
while(itr.hasNext()==true)
{
	System.out.println(itr.next()+" ");
}
	

System.out.println();
System.out.println("================");
Employe e1=new Employe(21,1111,101);
Employe e2=new Employe(23,2112,211);
Employe e3=new Employe(22,434,222);
	al.add(e1);
	al.add(e2);
	al.add(e1);
	System.out.println(al);
	}

}
