package august_thirtheen;

public class Person3 {
	private String name;
	private int age;
	Person3(String name,int age){
		this.setName(name);
		this.setAge(age);
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
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		Person3 person3 = (Person3) obj;
		if((person3.name == this.name) && (person3.age == this.age)){
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		return this.name+" "+this.age;
	}
	public static void main(String args[]){
		Person3 per1 = new Person3("xiaohui", 23);
		Person3 per2 = new Person3("xiaohui", 23);
		System.out.println(per1.equals(per2));
		System.out.println(per1.equals("hello"));
	}
}
