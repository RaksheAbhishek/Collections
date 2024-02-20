
public class Employee1 implements Comparable<Employee1>{
	String name;
	int id;
	int salary;
	public Employee1(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return name+" "+id+" "+salary;
	}


	@Override
	public int compareTo(Employee1 second) {
	
	if(this.id>second.id)
	{
		return 1;
	}
	else
	{
		return -1;
	}
	}


}
