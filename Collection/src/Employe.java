import java.util.Comparator;

public class Employe implements Comparator{
int age;
int salary;
int id;
 

public Employe(int age,int salary,int id)
{
	this.age=age;
	this.salary=salary;
	this.id=id;
	
}
@Override
	public String toString() {
		
		return age+" "+salary+" "+id;
	}
	
	public int compare(Employe o1,Employe o2) {
		if(o1.age>o2.age)
		{
			return 1;
		}
		else {
		return 0;
	}
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
