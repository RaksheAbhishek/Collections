import java.util.*;
public class PHashset {

	public static void main(String[] args) {
LinkedHashSet<String> hs=new LinkedHashSet<String>();
hs.add("abc");
hs.add("def");
hs.add("ghi");
hs.add("jkl");
hs.add("mnop");



System.out.println(hs);
hs.contains("abs");
System.out.println(hs.contains("abc"));
System.out.println(hs.remove("mnop"));
System.out.println(hs);
hs.clear();
System.out.println(hs);

	}

}
