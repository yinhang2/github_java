package august_eleven;

import java.io.CharConversionException;

class StringCal{
	private String string1;
	private String idnumber;
	public StringCal(String string1){
		this.setString1(string1);
	}
	public StringCal(String string1,String idnumber){
		this.setString1(string1);
		this.setIdnumber(idnumber);
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	
	public void getDate(StringCal sc){                                             //输出字符串其中的一段内容
		String s = sc.getString1().substring(9);
		System.out.println(s);
	}
	
	public void changeName(StringCal sc,int a,int b,String string){                     //把字符串中的某段字符进行等量替换
		char c[] = sc.getString1().toCharArray();
		char c2[] = string.toCharArray();
		for(int i=0;i<b-a+1;i++){
			c[a+i] = c2[i];
		}
		System.out.println(c);
	}
	
	public void getChar2(StringCal sc,int a){                                 //输出字符串中某个位置上的字符
		char c[] = sc.getString1().toCharArray();
		System.out.println(c[a]);
	}
	
	public void clearZero(StringCal sc,char c2){                           //删除字符串中的一个字符
		char c[] = sc.getString1().toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++){
			if(c[i]==c2) count++;
		}
		if(count==0) System.out.println("字符"+c2+"并不存在，不能删去");
		else{
			for(int i=0;i<c.length;i++){
				if(c[i]==c2){
					for(int j=i;j<c.length-1;j++){
						c[j] = c[j+1];
					}
					i-=1;c[c.length-1]='#';
				}
			}
			int a = 0;
			for(int i=0;i<c.length;i++){
				if(c[i]=='#'){
					a = i;
					break;
				}
			}
			for(int i=0;i<a;i++){
				System.out.print(c[i]);
			}
		}
	}
	
	
	public void getIdBir(StringCal sc){
		char c[] = sc.idnumber.toCharArray();					//从任意身份证中提取出生日信息
		for(int i=6;i<14;i++){
			System.out.print(c[i]);
		}
	}												
};
public class StringTest {
	public static void main(String args[]){
		StringCal sc = new StringCal("Java技术学习班20070326");
		sc.getDate(sc);
		StringCal sc2 = new StringCal("MLDN JAVA");
		sc2.changeName(sc2, 5, 8, "J2EE");
		sc.getChar2(sc, 8);
		sc.clearZero(sc, 'e');
		StringCal sc3 = new StringCal("Java技  术学  习班 2007032   6");
		sc3.clearZero(sc3, ' ');
		System.out.println();
		StringCal sc4 = new StringCal("尹航","230106199205133219");
		sc4.getIdBir(sc4);
	}
}
