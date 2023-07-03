package mapHireachy;

/*
 * Garbage collector dominates WeakHashMap..
 */
import java.util.WeakHashMap;

class Person{
	private String name;
	private int age;
	
	//Setters and Getters
	
	@Override
	public String toString() {
		return name+" "+age;
	}
	
	@Override
	public void finalize() {
		System.out.println("Garbage collector Successfulyy collected the object");
	}
}
public class GarbageCollector2 {
	public static void main(String[] args) {
		Person p = new Person();
		
		WeakHashMap wm = new WeakHashMap();
		wm.put(p,"akash");
		
		p=null;
		System.gc();
	}

}
