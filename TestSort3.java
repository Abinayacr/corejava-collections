package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student11 implements Comparable<Student11> {
	int rollno;
	String name;
	int age;
	Student11(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student11 st)
	{
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}

}
public class TestSort3 {
	public static void main(String[] args) {
		ArrayList<Student11> al=new ArrayList<Student11>();
		al.add(new Student11(111,"John",29));
		al.add(new Student11(222,"Mike",21));
		al.add(new Student11(555,"Mary", 26));
		Collections.sort(al);
		for(Student11 st:al) {
			System.out.println(st.rollno+""+st.name+""+st.age);
		}
	}
}