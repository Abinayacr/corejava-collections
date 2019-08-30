package collections;
import java.util.*;
public class TestArrrayList21 {
	public static void main(String[] args) {
	List<String> a1=new ArrayList<String>();
	a1.add("Jim");
	a1.add("michael");
	a1.add("james");
	a1.add("andy");
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
