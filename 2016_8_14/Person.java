package august_thirtheen;

abstract class Person {
	private String name;
	private int age;
	public Person(String name , int age){
		this.setName(name);
		this.setAge(age);
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
	public void say(){
		System.out.println(this.getContent());
	}
	public abstract String getContent();
	
	public static void main(String args[]){
		Student student = new Student("xiaohui", 23, "Java");
		student.say();
		Worker worker = new Worker("heihei", 40, 5000);
		worker.say();
	}
}
