package august_twelve;

public class Son extends Father{
	
	public static void main(String args[]){
		Father father = new Son();
		father.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
	}
}

