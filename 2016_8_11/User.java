package august_eleven;

public class User {
	private String name;
	private String password;
	private static int count = 0;
	public User(String name,String password){
		this.setName(name);
		this.setPassword(password);
	}
	public void counts(){
		setCount(getCount() + 1);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		User.count = count;
	}
	

}
