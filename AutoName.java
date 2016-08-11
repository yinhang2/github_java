package august_eleven;

public class AutoName {
	private String name;
	private int age;
	private static int count=0;
	public AutoName(){
		++count;
		this.setName("demo"+count);
	}
	public AutoName(String name){
		this.setName(name);
	}
	public void talk(){
		System.out.println(this.name);
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
