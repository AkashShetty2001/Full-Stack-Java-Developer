package mapHireachy;

import java.util.HashMap;

/*
 * Garbage Collector Internally invokes finalize method while collecting non reference object in heap.
 * HashMap dominates gc... 
 */
class Employee{
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
public class garbageCollector {
	public static void main(String[] args) {
		Employee e = new Employee();
		
		HashMap hm = new HashMap();
		hm.put(e, "123");
		System.out.println(hm);
		
		e=null;
	    System.gc();
	    System.out.println(hm);
	    
	    System.out.println("HashMap dominated gc..");
	}

}
