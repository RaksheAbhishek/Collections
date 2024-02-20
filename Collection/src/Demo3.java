import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {

	public static void main(String[] args) {
            ArrayList al=new ArrayList();
            al.add(new Person(22,3.12f,"male","amar"));
            al.add(new Person(15,2.1f,"female","kiran"));
            al.add(new Person(25,5.5f,"male","abhishek"));
            al.add(new Person(34,7.3f,"male","khali"));
            System.out.println(al);     
            Pers p=new Pers();
            Collections.sort(al, p);
            System.out.println(al);
	}

}
