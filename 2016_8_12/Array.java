package august_twelve;

public class Array {
	private int temp[];
	private int foot;
	public Array(int len){
		if(len>0){
			this.temp = new int[len];
		}
		else{
			this.temp = new int[1];
		}
	}
	public boolean add(int a){
		if(this.foot<this.temp.length){
			this.temp[foot] = a;
			return true;
		}
		else return false;
	}
}
