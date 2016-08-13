package august_twelve;

public class Student extends Person{
	private int friend;
	private String name;
	private int age;
	private String school;
	public Student(String name ,int age,int friend,String school){
		super(name, age, friend);
		this.setSchool(school);
	}
	public void print2(){
		this.print();
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getFriend() {
		return friend;
	}
	public void setFriend(int friend) {
		this.friend = friend;
	}
	public static void main(String args[]){
		Student student = new Student("xiaohui",23,2,"lzu");
		student.print2();
	}
}