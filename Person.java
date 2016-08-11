package august_eleven;

public class Person {
	private String name;
	private int age;
	static String contry = "À¼ÖÝ";
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public boolean compare(Person person){
		Person person1 = this;
		Person person2 = person;
		if(this.getName()==person2.getName()&&this.getAge()==person2.getAge()){
			return true;
		}
		else return false;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
