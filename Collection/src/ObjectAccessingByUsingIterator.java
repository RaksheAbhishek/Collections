import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ObjectAccessingByUsingIterator {

	public static void main(String[] args) {
        LinkedList<Integer> ref=new LinkedList<Integer>();
         ref.add(100);
         ref.add(25);
         ref.add(150);
         ref.add(50);
         ref.add(75);
         ref.add(125);
         ref.add(175);
         System.out.println(ref);
         System.out.println();
         System.out.println("============");
         ListIterator<Integer> ilt=ref.listIterator();
         while(ilt.hasNext()==true)
         {
        	 System.out.print(ilt.next()+" ");
         }
         System.out.println();
         System.out.println("===========");
         ListIterator<Integer> ilt1=ref.listIterator(ref.size());
         
         
	     while(ilt1.hasPrevious())
	     {
	    	 System.out.print(ilt1.previous()+" ");
	     }
	     System.out.println();
          System.out.println("=============");	
          
       Iterator<Integer> dlt=ref.descendingIterator();
       while(dlt.hasNext())
       {
    	   System.out.print(dlt.next()+"    ");
       }
	}

}
