package august_thirtheen;

public class Worker extends Person{
	private float salary;
	public Worker(String name,int age,float salary){
		super(name, age);
		this.setSalary(salary);
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return this.getName()+","+this.getAge()+","+this.salary;
	}	
}
