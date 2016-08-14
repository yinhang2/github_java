package august_thirtheen;

class Person2{
	private String name;
	private int age;
	public Person2(String name ,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return this.name+" "+this.age;
		}
}
public class ObjectDemo {
	public static void main(String args[]){
		Person2 person2 = new Person2("xiaohui", 23);
		System.out.println(person2);
	}
}
