package august_eleven;

public class Outer {
	private static String info = "hello world!";
	public String getInfo(){
		return Outer.info;
	}
	public void fun(){
		new Inner(this).print();
	}
};
class Inner{
	private Outer out = null;
	public Inner(Outer out){
		this.out = out;
	}
	public void print(){
		System.out.print(out.getInfo());
	}
};
