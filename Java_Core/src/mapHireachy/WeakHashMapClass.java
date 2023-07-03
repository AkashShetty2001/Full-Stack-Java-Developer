package mapHireachy;

//import java.util.HashMap;
import java.util.WeakHashMap;

/*
 * Garbage Collector Internally invokes finalize method while collecting non reference object in heap.
 * HashMap dominates gc... 
 * so to overcome this problem we make use of WeakHashMap
 * gc dominateds WeakhashMap
 */
class Employee1{
	private int eid;
	private String EName;
	private int eNumber;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public int geteNumber() {
		return eNumber;
	}
	public void seteNumber(int eNumber) {
		this.eNumber = eNumber;
	}
	
	@Override
	public String toString() {
		return eid+" "+EName+" "+eNumber;
	}
	
	@Override
	public void finalize() {
		System.out.println("Garbage collector Successfulyy collected the object");
		
	}
}

public class WeakHashMapClass {
	public static void main(String[] args) {
		Employee1 e = new Employee1();
		
		e.setEName("Akash");
		e.setEid(1);
		e.seteNumber(111);
		
		
		WeakHashMap whm = new WeakHashMap();
		whm.put(e, "Employee 1");
		System.out.println(whm);
		
		e=null;//so previous e value should be available for gc..
		
	    System.gc();
	    
	    System.out.println(whm);
	    
	    System.out.println("gc dominated WeakHashMap");
	}

}
