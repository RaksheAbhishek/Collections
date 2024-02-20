
public class Employee implements Comparable <Employee>{
String name;
int age;
int salary;
public Employee(String name, int age, int salary) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
}

@Override
	public String toString() {
		return name+" "+age+" "+salary;
	}

public int compareTo(Employee second) 
{
if(this.name.compareToIgnoreCase(second.name)>0)
{
	return 1;
}
else
{
	return -1;
}
}


}
