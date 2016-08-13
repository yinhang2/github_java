package august_twelve;

public class Person {
	private String name;
	private int age;
	private int friend;
	public Person(String name){
		this.setName(name);
	}
	public Person(String name ,int age,int friend){
		this(name, age);
		this.setFriend(friend);
	}
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public void print(){
		System.out.println("father");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFriend() {
		return friend;
	}
	public void setFriend(int friend) {
		this.friend = friend;
	}
	
}
