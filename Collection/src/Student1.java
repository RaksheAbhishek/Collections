
public class Student1 {
	int id;
	String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return name+" "+id;
	}

}
