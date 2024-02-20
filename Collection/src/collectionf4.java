import java.util.ArrayList;
import java.util.HashSet;

public class collectionf4 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("dog");
		al.add("horse");
		al.add("dog");
		al.add("men");
        al.add("apple");
        al.add("rat");
        al.add("rat");
        al.add("cat");
        System.out.println(al);
        
        
        HashSet<String> hs=new HashSet<String>(al);
		
        ArrayList<String> al1=new ArrayList<>(hs);
        
        System.out.println("before sorting unique elements");
        System.out.println(al);
        
        System.out.println("after sorting unique elements");
        System.out.println(al1);
	}
}
