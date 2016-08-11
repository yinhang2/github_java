package august_eleven;

public class StaticBloc {
	public static StaticBloc instance = new StaticBloc();
	private StaticBloc(){
		
	}
	public void print(){
		System.out.println("hello world!");
	}
	public static StaticBloc getInstance() {
		return instance;
	}
}
