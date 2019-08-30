package collections;
import java.util.ArrayList;
import java.util.Collections;
public class MyBasicArrayList {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("java");
		a1.add("c++");
		a1.add("perl");
		a1.add("php");
		System.out.println(a1);
		System.out.println("ele at index 1:"+a1.get(1));
		System.out.println("does list contains java?"+a1.contains("java"));
		a1.add(2,"play");
		System.out.println(a1);
		System.out.println("is arraylist empty?" +a1.isEmpty());
		System.out.println("index of perl is"+a1.indexOf("perl"));
		System.out.println("size of the arraylist is:"+a1.size());
		Collections.sort(a1);
		System.out.println(a1);
	}
}
