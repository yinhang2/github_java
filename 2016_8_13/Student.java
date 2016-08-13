package august_thirtheen;

public class Student extends Person{
	private String book;
	public Student(String name,int age,String book){
		super(name, age);
		this.setBook(book);
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return this.getName()+","+this.getAge()+","+this.book;
	}
	
}
