package august_twelve;

public class B extends A implements C,D{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("override");
	}
	public static void main(String args[]){
		B b = new B();
		b.print();
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
}
