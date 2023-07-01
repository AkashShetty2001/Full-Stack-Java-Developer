package mapHireachy;
import java.util.*;
import java.util.Map.Entry;

class Student{
	
	private String name;
	private int age;
	private String city;
	
	public Student(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return name+" "+age+" "+city;
		
	}
}

public class MapsComplex {
	public static void main(String[] args) {
		
		Student stu1 = new Student("Akash", 20 ,"banglore");
		Student stu2 = new Student("RaviKumar", 19 ,"banglore");
		Student stu3 = new Student("nandhi", 21 ,"banglore");
		
		HashMap hm = new HashMap();
		hm.put(1, stu1);
		hm.put(2, stu2);
		hm.put(3, stu3);
		
		//System.out.println(hm);
		
		Collection c=hm.values();
		Iterator itr1=c.iterator();
		while(itr1.hasNext()) {
			
		Student s=(Student)itr1.next();
			System.out.println(s+ " ");
		}
		
		//System.out.println();
		
		Set s=hm.keySet();
		Iterator itr2=s.iterator();
		while(itr2.hasNext()) {
			Integer i =(Integer)itr2.next();
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		Set e=hm.entrySet();
		Iterator itr3=e.iterator();
		while(itr3.hasNext()) {
			Map.Entry data=(Entry )itr3.next();
			System.out.println("key :"+data.getKey() +" "+"value :"+ data.getValue()+" ");
		}
		
		
		
	}

}
