package august_thirtheen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo {
	public static void main(String args[]){
		List<String> allList = new ArrayList<String>();
		Collection<String> allCollection = new ArrayList<String>();
		allList.add("hello");
		allList.add(0, "world");
		allCollection.add("every body");
		allCollection.add("tomorrow");
		allList.addAll(allCollection);
		System.out.println(allList);
		for(int i=allList.size()-1;i>=0;i--){
			System.out.print(allList.get(i)+" ");
		}
		System.out.println();
		String string[] = allList.toArray(new String[]{});
		for(int i=0;i<string.length;i++)
		{
			System.out.print(string[i]+" ");
		}
		System.out.println();
		Object object[] = allList.toArray();
		for(int i=0;i<object.length;i++){
			String temp = (String) object[i];
			System.out.print(temp+",");
		}
	}
}
