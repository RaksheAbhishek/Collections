
public class Person {
int age;
float hight;
String gender;
String name;
public Person(int age, float hight, String gender, String name) {
	super();
	this.age = age;
	this.hight = hight;
	this.gender = gender;
	this.name = name;
}
@Override
	public String toString() {
		return age+" "+name;
	}



}
