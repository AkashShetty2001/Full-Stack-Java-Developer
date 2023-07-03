package mapHireachy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Information{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	
	public Information(String name, int age, String fatherName, String city) {
		super();
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return name+" "+age+" "+fatherName+" "+city;
		
	}
	
	
}
public class PassportApplication {
	public static void main(String[] args) {
		Information i1=new Information("Rohan Sharma ",20,"Sharma","Delhi");
		Information i2=new Information("Rohan  ",20,"rahul","Kolkata");
		Information i3=new Information("rahul ",20,"nitesh","Delhi");
		
		HashMap hm = new HashMap();
		hm.put(0, i1);
		hm.put(1, i2);
		hm.put(2, i3);
		
		
		System.out.println("Welcome to Passport Application");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your Passport Number");
		Integer k = sc.nextInt();
		
		
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		boolean flag=false;
		while(i.hasNext()) {
			Map.Entry e=(Entry)i.next();
			Integer key= (Integer)e.getKey();
			if(key==k)
			{
			System.out.println("Passport Info : "+ e.getValue());
			flag=true;
			}
			
		}
		if(flag==false)
			System.out.println("Incorrect Passport Details");
	}

}
