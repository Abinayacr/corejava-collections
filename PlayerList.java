package collections;
import java.util.*;
public class PlayerList {
	
		ArrayList playerArray;
		List subListObj;
		PlayerList()
		{
			playerArray=new ArrayList();
			subListObj=new ArrayList();
		}
	void add()
	{
		for(int ctr=0; ctr<5; ctr++) 
		{
			playerArray.add(new Integer(ctr));
		}
		playerArray.add("m");
		playerArray.add("s");
		playerArray.add("v");
		playerArray.add("s");
		System.out.println();
	}
	void display()
	{
		System.out.println("********"+"*********");
		System.out.println("Retrieve obj");
		System.out.println("***********"+"***********");
		System.out.println();
		for(int ctr=0; ctr<playerArray.size(); ctr++) {
			System.out.print(" "+playerArray.get(ctr));
		}
		playerArray.add("s");
		System.out.println();
	}
	void search() 
	{
		System.out.println();
		System.out.println("*******"+"********");
		System.out.println("search");
		System.out.println("*******"+"********");
		System.out.println();
		System.out.println("1st occurance"+" \"s\" is at position"+playerArray.indexOf("s"));
		System.out.println("last occurance"+" \"s\" is at position"+playerArray.indexOf("s"));
		System.out.println();
	}
	void extract() {
		System.out.println("**************"+"***********");
		System.out.println("extract a sublist"+"print new list");
		System.out.println("**********"+"************");
		System.out.println();
		subListObj=playerArray.subList(5,  playerArray.size());
		System.out.println("new sub-list fm index 5 to"+playerArray.size()+"is:"+subListObj);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		PlayerList a = new PlayerList();
		a.add();
		a.display();
		a.search();
		a.extract();
    }
}
