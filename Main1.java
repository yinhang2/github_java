package august_eleven;

public class Main1 {
	public static void main(String args[]){
		Person person1 = new Person("张三",23);
		Person person2 = new Person("张三",24);
		System.out.println(person1.compare(person2));
	}
}
