import java.util.ArrayList;

public class collectionf {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(213);
		al.add(3232);
		al.add(54);
		al.add(212);
		al.add(534);
		al.add(87);
		System.out.println(al);
		for(int i=1;i<al.size();i++)
		{
			if(i%2==0)
			{
				System.out.println(al.get(i)+" ");
			}
						System.out.println(al);
		}
	}
}
