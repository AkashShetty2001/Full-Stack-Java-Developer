package mapHireachy;

import java.util.Hashtable;

/*
 * Hashtable was available from 1.0v
 * it is apart of legacy class
 * it is same as HashMap but all methods are synchorized..
 * so multithreading is not possible.
 * it provides thread safety.
 * low performance...
 * rather than that same as HashMap
 */

public class hashtableClass {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(0,"Akask");
		ht.put(1,"Ravikumar");
		
		System.out.println(ht);
		
	}

}
