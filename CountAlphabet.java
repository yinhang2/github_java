package august_eleven;

class CountON{
	private String s;
	public CountON(String string){
		this.setS(string);
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
    public void count(String string){
    	int countN = 0;
    	int countO = 0;
    	char c[] = this.getS().toCharArray();
    	for(int i=0;i<c.length;i++){
    		if(c[i]=='n') countN++;
    	}
    	for(int i=0;i<c.length;i++){
    		if(c[i]=='o') countO++;
    	}
    	System.out.println(countN);
    	System.out.println(countO);
    	
    }
};

public class CountAlphabet {
	public static void main(String args[]){
		CountON counton = new CountON("want you to know one thing.");
		counton.count(counton.getS());
	}
}
