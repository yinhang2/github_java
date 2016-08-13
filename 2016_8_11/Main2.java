package august_eleven;

public class Main2 {
	public static void main(String args[]){
		AutoName person = new AutoName("zhangsan");
		AutoName person2 = new AutoName();
		AutoName person3 = new AutoName();
		AutoName person4 = new AutoName("zhangsan");
		AutoName person5 = new AutoName();
		person.talk();
		person2.talk();
		person3.talk();
		person4.talk();
		person5.talk();
		
	}
}
