import java.util.Comparator;

public class Pers implements Comparator<Person> {

	@Override
	public int compare(Person first, Person second) {
		if(first.name.compareToIgnoreCase(second.name)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	

}
